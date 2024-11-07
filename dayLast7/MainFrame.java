package swing.demo.dayLast7;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.TextArea;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.HierarchyEvent;
import java.awt.event.HierarchyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileWriter;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import swingDemo.ToolBar;

public class MainFrame extends JFrame{
	private FormPanel formPanel;
	private JTextArea textArea;
	private JToolBar toolbar;
	private static JFileChooser fileChooser = new JFileChooser();
	public MainFrame() {
		super("Demo");
		setSize(400,500);
		setLayout(new BorderLayout());
		JRootPane rootPane = this.getRootPane();

		Container contentPane = rootPane.getContentPane();

		JLayeredPane layeredPane = new JLayeredPane();
		textArea = new JTextArea();
		textArea.setEditable(false);
		add(textArea,BorderLayout.CENTER);
		toolbar = toolBar(this);
		formPanel = new FormPanel((f)-> {
			textArea.append(f.toString()+"\n");
			toolbar.setVisible(false);
			
		});
		contentPane.add(formPanel,BorderLayout.WEST);
		contentPane.add(toolbar,BorderLayout.NORTH);
		setVisible(true);
		
		formPanel.getUserName().addFocusListener(new FocusAdapter() {

			@Override
			public void focusGained(FocusEvent e) {
				// TODO Auto-generated method stub
				textArea.append("UserName Focused\n");
			}

			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
				textArea.append("UserName UnFocused\n");
			}
			
		});
		
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				textArea.append("Window iconified\n");
			}

			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				textArea.append("Window Activated\n");
			}

			@Override
			public void windowStateChanged(WindowEvent e) {
				// TODO Auto-generated method stub
				textArea.append("Window State Changed\n");
			}

			@Override
			public void windowGainedFocus(WindowEvent e) {
				// TODO Auto-generated method stub
				textArea.append("Window Focus gained\n");
			}

			@Override
			public void windowLostFocus(WindowEvent e) {
				// TODO Auto-generated method stub
				textArea.append("Window Focus lost\n");
			}
			
		});
		toolbar.addHierarchyListener(new HierarchyListener() {
			
			@Override
			public void hierarchyChanged(HierarchyEvent e) {
				textArea.append("Hierarchy changed\n");
				
			}
		});
		
		formPanel.getPassword().getDocument().addDocumentListener(new DocumentListener() {
			
			@Override
			public void removeUpdate(DocumentEvent e) {
				
				textArea.append("Password backspaced\n");
			}
			
			@Override
			public void insertUpdate(DocumentEvent e) {
				textArea.append("Password added\n");
				
			}
			
			@Override
			public void changedUpdate(DocumentEvent e) {
				textArea.append("Password changed");
				
			}
		});
		
	}
	static JToolBar toolBar(MainFrame mf) {
		JToolBar toolBar = new JToolBar();
		JButton open = new JButton("Open");
		JButton save = new JButton("Save");
		JButton exit = new JButton("Exit");
		toolBar.setLayout(new FlowLayout(FlowLayout.LEFT));
		toolBar.setBackground(Color.white);
		toolBar.add(open);
		toolBar.add(save);
		toolBar.add(exit);
		
		save.addActionListener((e)->{
			if(JOptionPane.showConfirmDialog(mf, "Are you sure to save?","Save",JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION) {
				System.out.println("Saved");
			}
		});
		open.addActionListener((e)->{
			if(JOptionPane.showConfirmDialog(mf, "Are you sure to open?","Open",JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION) {
				System.out.println("Open");
			}
		});
		exit.addActionListener((e)->{
			if(JOptionPane.showConfirmDialog(mf, "Are you sure to exit?","ExitSave",JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION) {
				System.exit(0);
			}
		});
		return toolBar;
	}
}
