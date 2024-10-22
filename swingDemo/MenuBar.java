package swingDemo;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
public class MenuBar extends JPanel implements ActionListener{
	JButton hello;
	JButton hii;
	JTextArea textArea;
	public MenuBar() {
		hello = new JButton("Hello");
		hii = new JButton("Hi");
		setLayout(new FlowLayout(FlowLayout.LEFT));
		hello.addActionListener(this);
		hii.addActionListener(this);
		add(hello);
		add(hii);
	}
	void setTextArea(JTextArea area) {
		this.textArea = area;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==hello) {
			textArea.append("Hello\n");
		}
		else{
			textArea.append("Hii\n");
		}
		
	}
}
