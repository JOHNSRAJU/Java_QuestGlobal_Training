package com.multiThreading.realTimeStock.trading;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class StockTradingPlatform {
	private final ThreadGroup buyOrders = new ThreadGroup("Buy Orders");
	private final ThreadGroup sellOrders = new ThreadGroup("Sell Orders");
	private final ThreadGroup marketAnalysis = new ThreadGroup("Market Analysis");

	private static Map<String, Double> stockPrices = new ConcurrentHashMap<String, Double>();
	private Lock lock = new ReentrantLock();
	private ExecutorService tradingThreadPool = Executors.newFixedThreadPool(10);
	private ForkJoinPool analyticPool = new ForkJoinPool();

	static class ClientSession{
		String sessionId;
		String clientName;
		double accountBalance;
		public ClientSession() {
			this.sessionId = UUID.randomUUID().toString();
			this.clientName = "Client - "+	Thread.currentThread().getId();
			this.accountBalance = 10000;
		}
	}
	private static final ThreadLocal<ClientSession> clientSession = ThreadLocal.withInitial(ClientSession::new);

	public Future<Double> getStockPrice(String stockSymbol){
		return tradingThreadPool.submit(()->stockPrices.getOrDefault(stockSymbol, 0.0));
	}

	public Future<Double> getAccountBalance(){
		return tradingThreadPool.submit(()->clientSession.get().accountBalance);
	}

	public void executeBuyOrder(String stockSymbol, double amount) {
		new Thread(buyOrders,()->{
			lock.lock();
			try {
				double stockPrice = stockPrices.getOrDefault(stockSymbol, 0.0);
				if(clientSession.get().accountBalance>=amount*stockPrice) {
					clientSession.get().accountBalance-=amount*stockPrice;
					System.out.println("Buy order executed for "+stockSymbol);
				}else {
					System.out.println("Insufficient Balance");
				}
			} finally {
				lock.unlock();
			}

		}).start();
	}

	public void executeSellOrder(String stockSymbol, double amount) {
		new Thread(buyOrders,()->{
			lock.lock();
			try {
				double stockPrice = stockPrices.getOrDefault(stockSymbol, 0.0);
				clientSession.get().accountBalance+=amount*stockPrice;
				System.out.println("Sell order executed for "+stockSymbol);
			} finally {
				lock.unlock();
			}

		}).start();
	}
	public void performMarketAnalysis(List<String> stockSymbols) {
		analyticPool.invoke(new StockAnalysisTask(stockSymbols));
	}

	private class StockAnalysisTask extends RecursiveAction{
		private List<String> stockSymbol;


		public StockAnalysisTask(List<String> stockSymbol) {
			this.stockSymbol = stockSymbol;
		}


		@Override
		protected void compute() {
			// TODO Auto-generated method stub
			if(stockSymbol.size()<=1) {
				stockSymbol.forEach(symbol->{
					System.out.println("Analyzing stock : "+symbol);
				});
			}
			else {
				int mid=stockSymbol.size()/2;
				invokeAll(
						new StockAnalysisTask(stockSymbol.subList(0, mid)),
						new StockAnalysisTask(stockSymbol.subList(mid, stockSymbol.size()))
						);
			}
		}
	}
	public void haltSellOrders() {
		System.out.println("Market crash detected! Halting all Sell Orders.");
		sellOrders.interrupt();
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		StockTradingPlatform platform = new StockTradingPlatform();
		platform.stockPrices.put("DEGEN", 230.99);
		platform.stockPrices.put("BTC", 70.0);

		for(int i=0;i<5;i++) {
			platform.executeBuyOrder("DEGEN", 2);
			platform.executeSellOrder("BTC", 1);
			Future<Double> balance = platform.getAccountBalance();
			System.out.println("Account Balance : "+balance.get());
		}

		List<String> stocks = Arrays.asList("DEGEN","BTC","DigiByte");
		platform.performMarketAnalysis(stocks);

		platform.haltSellOrders();


		platform.tradingThreadPool.shutdown();
		platform.analyticPool.shutdown();
	}
}


