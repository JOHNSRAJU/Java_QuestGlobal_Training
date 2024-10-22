package swingDemo;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TextPanel extends JPanel{
	private JTextArea area;
	public TextPanel() {
		area = new JTextArea();
		setLayout(new BorderLayout());
		add(new JScrollPane(area),BorderLayout.CENTER);
	}
	public JTextArea getArea() {
		return area;
	}
}
