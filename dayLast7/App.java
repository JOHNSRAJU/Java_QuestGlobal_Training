package swing.demo.dayLast7;

import javax.swing.SwingUtilities;

public class App {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(()->{
			new MainFrame();
		});
	}
}
