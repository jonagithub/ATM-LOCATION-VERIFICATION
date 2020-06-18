package com.simulation.atm.client;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import com.simulation.atm.model.Customer;
import com.simulation.atm.service.CustomerDao;
import com.simulation.atm.service.CustomerDaoImpl;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UserInfo extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblUserInformation;
	private JLabel lblAccountNumber;
	private JTextField accountnumbertxt;
	private JLabel lblName;
	private JLabel lblAddress;
	private JLabel label;
	private JTextField nametxt;
	private JTextField addresstxt;
	private JTextField transactiontxt;
	private JButton btnBack;
	private JButton btnAdd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserInfo frame = new UserInfo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public UserInfo() {
		setTitle("ATM LOCATION VERIFICATION DEVELOPED BY JONATHAN RAI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 855, 636);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBackground(new Color(47, 79, 79));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getPanel());
		contentPane.add(getLblAccountNumber());
		contentPane.add(getAccountnumbertxt());
		contentPane.add(getLblName());
		contentPane.add(getLblAddress());
		contentPane.add(getLabel());
		contentPane.add(getNametxt());
		contentPane.add(getAddresstxt());
		contentPane.add(getTransactiontxt());
		contentPane.add(getBtnBack());
		contentPane.add(getBtnAdd());
	}

	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBackground(new Color(255, 165, 0));
			panel.setBounds(0, 0, 837, 124);
			panel.setLayout(null);
			panel.add(getLblUserInformation());
		}
		return panel;
	}
	private JLabel getLblUserInformation() {
		if (lblUserInformation == null) {
			lblUserInformation = new JLabel("USER INFORMATION");
			lblUserInformation.setForeground(new Color(255, 255, 255));
			lblUserInformation.setFont(new Font("Tahoma", Font.BOLD, 35));
			lblUserInformation.setBounds(221, 39, 409, 51);
		}
		return lblUserInformation;
	}
	private JLabel getLblAccountNumber() {
		if (lblAccountNumber == null) {
			lblAccountNumber = new JLabel("ACCOUNT NUMBER");
			lblAccountNumber.setForeground(new Color(255, 255, 255));
			lblAccountNumber.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblAccountNumber.setBounds(97, 175, 202, 38);
		}
		return lblAccountNumber;
	}
	private JTextField getAccountnumbertxt() {
		if (accountnumbertxt == null) {
			accountnumbertxt = new JTextField();
			accountnumbertxt.setBounds(378, 174, 248, 42);
			accountnumbertxt.setColumns(10);
		}
		return accountnumbertxt;
	}
	private JLabel getLblName() {
		if (lblName == null) {
			lblName = new JLabel("NAME");
			lblName.setForeground(new Color(255, 255, 255));
			lblName.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblName.setBounds(97, 261, 202, 38);
		}
		return lblName;
	}
	private JLabel getLblAddress() {
		if (lblAddress == null) {
			lblAddress = new JLabel("ADDRESS");
			lblAddress.setForeground(new Color(255, 255, 255));
			lblAddress.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblAddress.setBounds(97, 334, 202, 38);
		}
		return lblAddress;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("TRANSACTIONS PER WEEK ");
			label.setForeground(new Color(255, 255, 255));
			label.setFont(new Font("Tahoma", Font.BOLD, 16));
			label.setBounds(97, 388, 278, 101);
		}
		return label;
	}
	private JTextField getNametxt() {
		if (nametxt == null) {
			nametxt = new JTextField();
			nametxt.setColumns(10);
			nametxt.setBounds(378, 260, 248, 42);
		}
		return nametxt;
	}
	private JTextField getAddresstxt() {
		if (addresstxt == null) {
			addresstxt = new JTextField();
			addresstxt.setColumns(10);
			addresstxt.setBounds(378, 346, 248, 42);
		}
		return addresstxt;
	}
	private JTextField getTransactiontxt() {
		if (transactiontxt == null) {
			transactiontxt = new JTextField();
			transactiontxt.setColumns(10);
			transactiontxt.setBounds(378, 418, 248, 42);
		}
		return transactiontxt;
	}
	private JButton getBtnBack() {
		if (btnBack == null) {
			btnBack = new JButton("BACK");
			btnBack.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new Atm().setVisible(true);
				}
			});
			btnBack.setBackground(new Color(255, 0, 0));
			btnBack.setForeground(new Color(255, 255, 255));
			btnBack.setFont(new Font("Tahoma", Font.BOLD, 16));
			btnBack.setBounds(158, 523, 128, 38);
		}
		return btnBack;
	}
	private JButton getBtnAdd() {
		if (btnAdd == null) {
			btnAdd = new JButton("ADD");
			btnAdd.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Customer c = new Customer();
					c.setAccountnumber(Integer.parseInt(accountnumbertxt.getText()));
					c.setName(nametxt.getText());
					c.setAddress(addresstxt.getText());
					c.setNumberoftransaction(Integer.parseInt(transactiontxt.getText()));
				CustomerDao cdao =new CustomerDaoImpl();
					if(cdao.addCustomer(c)) {
						
						JOptionPane.showMessageDialog(null, "Added Success");
						new Simulation().setVisible(true);
						dispose();
					}
					else {
						JOptionPane.showMessageDialog(null, "Unsuccess");
					}
					
				}

				
			});
			btnAdd.setBackground(new Color(30, 144, 255));
			btnAdd.setForeground(new Color(255, 255, 255));
			btnAdd.setFont(new Font("Tahoma", Font.BOLD, 16));
			btnAdd.setBounds(473, 523, 128, 38);
		}
		return btnAdd;
	}
}
