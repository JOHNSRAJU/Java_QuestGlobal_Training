package ticketSystem;
public class Ticket {
	double calculateTotalCost(int noOfTickets,double rate){
		return noOfTickets*rate;
	}
	double calculateTotalCost(int childTickets,double rateChild,int adultTickets, double rateAdult, int seniorTickets, double rateSenior){
		return childTickets*rateChild+adultTickets*rateAdult+seniorTickets*rateSenior;
	}
}
