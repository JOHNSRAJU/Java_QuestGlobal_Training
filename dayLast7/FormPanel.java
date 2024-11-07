package swing.demo.dayLast7;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;

public class FormPanel extends JPanel {
    private JTextField userName;
    private JPasswordField password;
    private JTextArea comment;
    private JSpinner age;
    private JSlider experienceYear;
    private JList<String> gender;
    private JButton submit;
    private JButton cancel;
    
    

    public JTextField getUserName() {
		return userName;
	}



	public JPasswordField getPassword() {
		return password;
	}



	public JTextArea getComment() {
		return comment;
	}



	public JSpinner getAge() {
		return age;
	}



	public JSlider getExperienceYear() {
		return experienceYear;
	}



	public JList<String> getGender() {
		return gender;
	}



	public JButton getSubmit() {
		return submit;
	}



	public JButton getCancel() {
		return cancel;
	}



	FormPanel(FormListener formListener) {
        setLayout(new GridBagLayout());
        GridBagConstraints gc = new GridBagConstraints();
        setBackground(Color.LIGHT_GRAY);
        setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 5), BorderFactory.createEtchedBorder()));
        Dimension dimension = getPreferredSize();
        dimension.width = 350;
        setPreferredSize(dimension);

        userName = new JTextField(10);
        password = new JPasswordField(10);
        comment = new JTextArea(5, 15);
        JScrollPane commentScroll = new JScrollPane(comment); 

        SpinnerNumberModel spinnerModel = new SpinnerNumberModel(18, 0, 120, 1);
        age = new JSpinner(spinnerModel);
        experienceYear = new JSlider(0, 50, 1);
        experienceYear.setPaintTicks(true);
        experienceYear.setPaintLabels(true);
        experienceYear.setMajorTickSpacing(10);
        experienceYear.setMinorTickSpacing(1);

        DefaultListModel<String> defaultListModel = new DefaultListModel<>();
        defaultListModel.add(0, "Male");
        defaultListModel.add(1, "Female");
        gender = new JList<>(defaultListModel);
        gender.setSelectedIndex(0);

        submit = new JButton("Submit");
        cancel = new JButton("Cancel");
        
        submit.addActionListener((e)->{
        	if(userName.getText().equals("")||password.getText().equals("")) {
        		JOptionPane.showMessageDialog(this,"Fill all the inputs !");
        	}
        	else {
        		Form form = new Form(userName.getText(), new String(password.getPassword()),comment.getText(),age.getValue().toString(),experienceYear.getValue(),gender.getSelectedValue());
            	formListener.formAction(form);
        	}
        });

        // Add components to layout
        gc.gridx = 0;
        gc.gridy = 0;
        gc.anchor = GridBagConstraints.LINE_END;
        gc.insets = new Insets(5, 5, 5, 5);
        add(new JLabel("Username: "), gc);
        gc.gridx = 1;
        gc.anchor = GridBagConstraints.LINE_START;
        add(userName, gc);

        gc.gridx = 0;
        gc.gridy = 1;
        gc.anchor = GridBagConstraints.LINE_END;
        add(new JLabel("Password: "), gc);
        gc.gridx = 1;
        gc.anchor = GridBagConstraints.LINE_START;
        add(password, gc);

        gc.gridx = 0;
        gc.gridy = 2;
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        add(new JLabel("Comment: "), gc);
        gc.gridx = 1;
        gc.anchor = GridBagConstraints.LINE_START;
        add(commentScroll, gc);

        gc.gridx = 0;
        gc.gridy = 3;
        gc.anchor = GridBagConstraints.LINE_END;
        add(new JLabel("Age: "), gc);
        gc.gridx = 1;
        gc.anchor = GridBagConstraints.LINE_START;
        add(age, gc);

        gc.gridx = 0;
        gc.gridy = 4;
        gc.anchor = GridBagConstraints.LINE_END;
        add(new JLabel("Experience: "), gc);
        gc.gridx = 1;
        gc.anchor = GridBagConstraints.LINE_START;
        add(experienceYear, gc);

        gc.gridx = 0;
        gc.gridy = 5;
        gc.anchor = GridBagConstraints.LINE_END;
        add(new JLabel("Gender: "), gc);
        gc.gridx = 1;
        gc.anchor = GridBagConstraints.LINE_START;
        add(gender, gc);
        
        gc.gridx = 0;
        gc.gridy = 6;
        gc.weighty = 1;
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        add(cancel, gc);
        gc.gridx = 1;
        gc.gridy = 6;
        gc.weighty = 1;
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        add(submit, gc);
    }
}