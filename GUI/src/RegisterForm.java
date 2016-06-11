import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class RegisterForm implements ActionListener,ItemListener{
	JFrame f=new JFrame();
	//label and text for Name
	JLabel lblName=new JLabel("Enter Name : ");
	JTextField txtName=new JTextField(10);
	//label and text for Contact
	JLabel lblContact=new JLabel("Enter Contact : ");
	JTextField txtContact=new JTextField(10);
	//label and text for Address
	JLabel lblAddress=new JLabel("Enter Address : ");
	JTextArea txtAddress=new JTextArea(5,10);
	//label and Radio Button for gender.
	JLabel lblGender=new JLabel("Select Gender : ");
	JRadioButton rbMale=new JRadioButton("Male");
	JRadioButton rbFemale=new JRadioButton("Female");
	ButtonGroup rbGroup=new ButtonGroup();
	JCheckBox chk=new JCheckBox("Do you want to save Info...");
	JButton btSave=new JButton("Save");
	JButton btReset=new JButton("Reset");
	public static void main(String[] args) {
		new RegisterForm().displayForm();
	}
	public void displayForm(){
		f.setTitle("Register Form");
		f.setLayout(new GridBagLayout());
		GridBagConstraints gbc=new GridBagConstraints();
		Insets in=gbc.insets;
		in.set(5, 5, 5, 5);
		gbc.gridx=0;
		gbc.gridy=0;
		f.add(lblName,gbc);
		
		gbc.gridx=1;
		gbc.gridy=0;
		f.add(txtName,gbc);
		
		gbc.gridx=0;
		gbc.gridy=1;
		f.add(lblContact,gbc);
		
		gbc.gridx=1;
		gbc.gridy=1;
		f.add(txtContact,gbc);
		
		gbc.gridx=0;
		gbc.gridy=2;
		f.add(lblAddress,gbc);
		
		gbc.gridx=1;
		gbc.gridy=2;
		f.add(txtAddress,gbc);
		
		gbc.gridx=0;
		gbc.gridy=3;
		f.add(lblGender,gbc);
		
		rbGroup.add(rbMale);
		rbGroup.add(rbFemale);		
		

		gbc.gridx=1;
		gbc.gridy=3;
		f.add(rbMale,gbc);

		gbc.gridx=2;
		gbc.gridy=3;
		f.add(rbFemale,gbc);
		

		gbc.gridx=1;
		gbc.gridy=4;
		f.add(chk,gbc);
		chk.addItemListener(this);

		gbc.gridx=0;
		gbc.gridy=5;
		btSave.addActionListener(this);
		f.add(btSave,gbc);

		gbc.gridx=1;
		gbc.gridy=5;
		btReset.addActionListener(this);
		f.add(btReset,gbc);
		btSave.setEnabled(false);
		btReset.setEnabled(false);
		//f.setSize(400, 400);
		f.setBounds(300, 250, 400, 400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	@Override
	public void actionPerformed(ActionEvent ev) {
	
		if(btSave==ev.getSource()){
			String name =txtName.getText();
			String contact =txtContact.getText();
			String address =txtAddress.getText();
			System.out.println("Name : "+name);
			System.out.println("Contact : "+contact);
			System.out.println("Address : "+address);
		}
		if(btReset==ev.getSource()){
			txtName.setText("");
			txtContact.setText("");
			txtAddress.setText("");
			System.out.println("Reset");
		}
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		int i=e.getStateChange();
		if(i==1){
			btSave.setEnabled(true);
			btReset.setEnabled(true);
		}
		else if(i==2){
			btSave.setEnabled(false);
			btReset.setEnabled(false);
		}
		
	}
}
