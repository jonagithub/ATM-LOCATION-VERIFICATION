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
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import java.awt.Color;
import javax.swing.ButtonGroup;

public class Simulation extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblAtmLocationVerification;
	private JLabel lblLocation;
	private JTextField locationTxt;
	private JLabel lblNumberOfCustomer;
	private JTextField noOfCustomerInt;
	private JButton btnDone;
	private JButton btnViewDetails;
	private JLabel lblTotalTransactionsPer;
	private JTextField transactionInt;
	private JLabel lblDistanceOfNearest;
	private JTextField distancetxt;
	private JLabel lblLeasingRent;
	private JTextField leasingrenttxt;
	private JLabel lblSecurity;
	private JRadioButton rdbtnYessecure;
	private JRadioButton rdbtnNosecure;
	private JLabel lblPermissibleSpace;
	private JRadioButton rdbtnYesspace;
	private JRadioButton rdbtnNospace;
	private JLabel lblMarketingPotential;
	private JRadioButton rdbtnYespotential;
	private JRadioButton rdbtnNopotential;
	private JButton btnNewButton;
	private JButton btnSimulate;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JButton btnViewAllDetails;
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	private final ButtonGroup buttonGroup_3 = new ButtonGroup();
	private final ButtonGroup buttonGroup_4 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Simulation frame = new Simulation();
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
	public Simulation() {
		setTitle("ATM LOCATION VERIFICATION DEVELOPED BY JONATHAN RAI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 895, 898);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(176, 196, 222));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getPanel());
		contentPane.add(getLblLocation());
		contentPane.add(getLocationTxt());
		contentPane.add(getLblNumberOfCustomer());
		contentPane.add(getNoOfCustomerInt());
		contentPane.add(getBtnDone());
		contentPane.add(getBtnViewDetails());
		contentPane.add(getLblTotalTransactionsPer());
		contentPane.add(getTransactionInt());
		contentPane.add(getLblDistanceOfNearest());
		contentPane.add(getDistancetxt());
		contentPane.add(getLblLeasingRent());
		contentPane.add(getLeasingrenttxt());
		contentPane.add(getLblSecurity());
		contentPane.add(getRdbtnYessecure());
		contentPane.add(getRdbtnNosecure());
		contentPane.add(getLblPermissibleSpace());
		contentPane.add(getRdbtnYesspace());
		contentPane.add(getRdbtnNospace());
		contentPane.add(getLblMarketingPotential());
		contentPane.add(getRdbtnYespotential());
		contentPane.add(getRdbtnNopotential());
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnSimulate());
		contentPane.add(getBtnViewAllDetails());
		
	}

	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setForeground(new Color(255, 255, 255));
			panel.setBackground(new Color(255, 165, 0));
			panel.setBounds(0, 0, 877, 108);
			panel.setLayout(null);
			panel.add(getLblAtmLocationVerification());
		}
		return panel;
	}
	private JLabel getLblAtmLocationVerification() {
		if (lblAtmLocationVerification == null) {
			lblAtmLocationVerification = new JLabel("ATM LOCATION VERIFICATION SIMULATION");
			lblAtmLocationVerification.setForeground(new Color(255, 255, 255));
			lblAtmLocationVerification.setFont(new Font("Tahoma", Font.BOLD, 32));
			lblAtmLocationVerification.setBounds(58, 26, 759, 54);
		}
		return lblAtmLocationVerification;
	}
	private JLabel getLblLocation() {
		if (lblLocation == null) {
			lblLocation = new JLabel("LOCATION");
			lblLocation.setIcon(new ImageIcon("C:\\Users\\Jonathan\\Downloads\\Simulation Java Icon\\maps-and-flags.png"));
			lblLocation.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblLocation.setBounds(55, 130, 143, 42);
		}
		return lblLocation;
	}
	private JTextField getLocationTxt() {
		if (locationTxt == null) {
			locationTxt = new JTextField();
			locationTxt.setBounds(386, 136, 242, 33);
			locationTxt.setColumns(10);
		}
		return locationTxt;
	}
	private JLabel getLblNumberOfCustomer() {
		if (lblNumberOfCustomer == null) {
			lblNumberOfCustomer = new JLabel("NUMBER OF CUSTOMER");
			lblNumberOfCustomer.setIcon(new ImageIcon("C:\\Users\\Jonathan\\Downloads\\Simulation Java Icon\\multiple-users-silhouette.png"));
			lblNumberOfCustomer.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblNumberOfCustomer.setBounds(55, 196, 242, 55);
		}
		return lblNumberOfCustomer;
	}
	private JTextField getNoOfCustomerInt() {
		if (noOfCustomerInt == null) {
			noOfCustomerInt = new JTextField();
			noOfCustomerInt.setColumns(10);
			noOfCustomerInt.setBounds(386, 208, 242, 33);
		}
		return noOfCustomerInt;
	}
	private JButton getBtnDone() {
		if (btnDone == null) {
			btnDone = new JButton("DONE");
			btnDone.setBackground(new Color(30, 144, 255));
			btnDone.setForeground(new Color(255, 255, 255));
			btnDone.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setData();
				}
			});
			btnDone.setBounds(655, 140, 143, 25);
		}
		return btnDone;
	}
	private JButton getBtnViewDetails() {
		if (btnViewDetails == null) {
			btnViewDetails = new JButton("VIEW DETAILS");
			btnViewDetails.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					ViewDetails v=new ViewDetails ();
					v.displayData(locationTxt.getText());
					v.setVisible(true);
					dispose();
				}
			});
			btnViewDetails.setBackground(new Color(255, 0, 0));
			btnViewDetails.setForeground(new Color(255, 255, 255));
			btnViewDetails.setBounds(655, 212, 143, 25);
		}
		return btnViewDetails;
	}
	private JLabel getLblTotalTransactionsPer() {
		if (lblTotalTransactionsPer == null) {
			lblTotalTransactionsPer = new JLabel("TOTAL TRANSACTIONS PER WEEK");
			lblTotalTransactionsPer.setIcon(new ImageIcon("C:\\Users\\Jonathan\\Downloads\\Simulation Java Icon\\buy.png"));
			lblTotalTransactionsPer.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblTotalTransactionsPer.setBounds(55, 271, 301, 55);
		}
		return lblTotalTransactionsPer;
	}
	private JTextField getTransactionInt() {
		if (transactionInt == null) {
			transactionInt = new JTextField();
			transactionInt.setColumns(10);
			transactionInt.setBounds(386, 283, 242, 33);
		}
		return transactionInt;
	}
	private JLabel getLblDistanceOfNearest() {
		if (lblDistanceOfNearest == null) {
			lblDistanceOfNearest = new JLabel("DISTANCE OF NEAREST ATM");
			lblDistanceOfNearest.setIcon(new ImageIcon("C:\\Users\\Jonathan\\Downloads\\Simulation Java Icon\\distance.png"));
			lblDistanceOfNearest.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblDistanceOfNearest.setBounds(55, 367, 301, 55);
		}
		return lblDistanceOfNearest;
	}
	private JTextField getDistancetxt() {
		if (distancetxt == null) {
			distancetxt = new JTextField();
			distancetxt.setColumns(10);
			distancetxt.setBounds(386, 379, 242, 33);
		}
		return distancetxt;
	}
	private JLabel getLblLeasingRent() {
		if (lblLeasingRent == null) {
			lblLeasingRent = new JLabel("LEASING RENT");
			lblLeasingRent.setIcon(new ImageIcon("C:\\Users\\Jonathan\\Downloads\\Simulation Java Icon\\rent.png"));
			lblLeasingRent.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblLeasingRent.setBounds(55, 459, 301, 55);
		}
		return lblLeasingRent;
	}
	private JTextField getLeasingrenttxt() {
		if (leasingrenttxt == null) {
			leasingrenttxt = new JTextField();
			leasingrenttxt.setColumns(10);
			leasingrenttxt.setBounds(386, 471, 242, 33);
		}
		return leasingrenttxt;
	}
	private JLabel getLblSecurity() {
		if (lblSecurity == null) {
			lblSecurity = new JLabel("SECURITY");
			lblSecurity.setIcon(new ImageIcon("C:\\Users\\Jonathan\\Downloads\\Simulation Java Icon\\shield.png"));
			lblSecurity.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblSecurity.setBounds(55, 541, 301, 55);
		}
		return lblSecurity;
	}
	private JRadioButton getRdbtnYessecure() {
		if (rdbtnYessecure == null) {
			rdbtnYessecure = new JRadioButton("YES");
			buttonGroup_4.add(rdbtnYessecure);
			rdbtnYessecure.setFont(new Font("Tahoma", Font.BOLD, 16));
			rdbtnYessecure.setBackground(new Color(176, 196, 222));
			rdbtnYessecure.setForeground(new Color(0, 0, 0));
			rdbtnYessecure.setBounds(302, 557, 127, 25);
		}
		return rdbtnYessecure;
	}
	private JRadioButton getRdbtnNosecure() {
		if (rdbtnNosecure == null) {
			rdbtnNosecure = new JRadioButton("NO");
			buttonGroup_4.add(rdbtnNosecure);
			rdbtnNosecure.setFont(new Font("Tahoma", Font.BOLD, 16));
			rdbtnNosecure.setBackground(new Color(176, 196, 222));
			rdbtnNosecure.setForeground(new Color(0, 0, 0));
			rdbtnNosecure.setBounds(488, 556, 127, 25);
		}
		return rdbtnNosecure;
	}
	private JLabel getLblPermissibleSpace() {
		if (lblPermissibleSpace == null) {
			lblPermissibleSpace = new JLabel("PERMISSIBLE SPACE");
			lblPermissibleSpace.setIcon(new ImageIcon("C:\\Users\\Jonathan\\Downloads\\Simulation Java Icon\\address.png"));
			lblPermissibleSpace.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblPermissibleSpace.setBounds(55, 613, 301, 55);
		}
		return lblPermissibleSpace;
	}
	private JRadioButton getRdbtnYesspace() {
		if (rdbtnYesspace == null) {
			rdbtnYesspace = new JRadioButton("YES");
			buttonGroup_2.add(rdbtnYesspace);
			rdbtnYesspace.setFont(new Font("Tahoma", Font.BOLD, 16));
			rdbtnYesspace.setBackground(new Color(176, 196, 222));
			rdbtnYesspace.setForeground(new Color(0, 0, 0));
			rdbtnYesspace.setBounds(302, 629, 127, 25);
		}
		return rdbtnYesspace;
	}
	private JRadioButton getRdbtnNospace() {
		if (rdbtnNospace == null) {
			rdbtnNospace = new JRadioButton("NO");
			buttonGroup_2.add(rdbtnNospace);
			rdbtnNospace.setFont(new Font("Tahoma", Font.BOLD, 16));
			rdbtnNospace.setBackground(new Color(176, 196, 222));
			rdbtnNospace.setForeground(new Color(0, 0, 0));
			rdbtnNospace.setBounds(488, 629, 127, 25);
		}
		return rdbtnNospace;
	}
	private JLabel getLblMarketingPotential() {
		if (lblMarketingPotential == null) {
			lblMarketingPotential = new JLabel("MARKETING POTENTIAL");
			lblMarketingPotential.setIcon(new ImageIcon("C:\\Users\\Jonathan\\Downloads\\Simulation Java Icon\\seo.png"));
			lblMarketingPotential.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblMarketingPotential.setBounds(55, 692, 301, 55);
		}
		return lblMarketingPotential;
	}
	private JRadioButton getRdbtnYespotential() {
		if (rdbtnYespotential == null) {
			rdbtnYespotential = new JRadioButton("YES");
			buttonGroup_3.add(rdbtnYespotential);
			rdbtnYespotential.setFont(new Font("Tahoma", Font.BOLD, 16));
			rdbtnYespotential.setBackground(new Color(176, 196, 222));
			rdbtnYespotential.setForeground(new Color(0, 0, 0));
			rdbtnYespotential.setBounds(302, 708, 127, 25);
		}
		return rdbtnYespotential;
	}
	private JRadioButton getRdbtnNopotential() {
		if (rdbtnNopotential == null) {
			rdbtnNopotential = new JRadioButton("NO");
			buttonGroup_3.add(rdbtnNopotential);
			rdbtnNopotential.setFont(new Font("Tahoma", Font.BOLD, 16));
			rdbtnNopotential.setBackground(new Color(176, 196, 222));
			rdbtnNopotential.setForeground(new Color(0, 0, 0));
			rdbtnNopotential.setBounds(488, 708, 127, 25);
		}
		return rdbtnNopotential;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("BACK");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new Atm().setVisible(true);
					dispose();
				}
			});
			btnNewButton.setForeground(new Color(255, 255, 255));
			btnNewButton.setBackground(new Color(255, 0, 0));
			btnNewButton.setBounds(135, 787, 162, 42);
		}
		return btnNewButton;
	}
	private JButton getBtnSimulate() {
		if (btnSimulate == null) {
			btnSimulate = new JButton("SIMULATE");
			btnSimulate.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int number = Integer.parseInt(noOfCustomerInt.getText());
					com.simulation.atm.model.Location l = new com.simulation.atm.model.Location();
					l.setDistanceofnearestatm(Integer.parseInt(distancetxt.getText()));
					l.setLeasingrent(Integer.parseInt(leasingrenttxt.getText()));
					Customer c = new Customer();
					c.setNumberoftransaction(Integer.parseInt(transactionInt.getText()));
					if(rdbtnYessecure.isSelected()) {
						l.setSecurity("Yes");
					}else {
						l.setSecurity("No");
					}
					if(rdbtnYesspace.isSelected()) {
						l.setPermissiblespace("Yes");
					}else {
						l.setPermissiblespace("No");
					}
					if(rdbtnYespotential.isSelected()) {
						l.setMarketingpotential("Yes");
					}else {
						l.setMarketingpotential("No");
					}
					if(number>=10 && l.getSecurity()=="Yes" && l.getDistanceofnearestatm()>=500  && c.getNumberoftransaction()>20  && l.getPermissiblespace() == "Yes" && l.getMarketingpotential()=="Yes" && (l.getLeasingrent()<=15000 && l.getLeasingrent() >0 ))  {
						JOptionPane.showMessageDialog(null, "Yes, this location is suitable for ATM");
					}else {
						JOptionPane.showMessageDialog(null, " NO, this location is not suitable for ATM");
					}
					
				}
			});
			btnSimulate.setForeground(new Color(255, 255, 255));
			btnSimulate.setBackground(new Color(30, 144, 255));
			btnSimulate.setBounds(466, 787, 162, 42);
		}
		return btnSimulate;
	}
	private void setData() {
		CustomerDao cdao = new CustomerDaoImpl();
		
		Customer c = cdao.countCustomer(locationTxt.getText()) ;
		noOfCustomerInt.setText(String.valueOf(c.getCount()));
		
		Customer c1 = cdao.totaltransaction(locationTxt.getText());
		transactionInt.setText(String.valueOf(c1.getNumberoftransaction()));
	}
	
	private JButton getBtnViewAllDetails() {
		if (btnViewAllDetails == null) {
			btnViewAllDetails = new JButton("VIEW ALL DETAILS");
			btnViewAllDetails.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ViewDetails v=new ViewDetails ();
					v.displayData();
					v.setVisible(true);
					dispose();
				}
			});
			btnViewAllDetails.setForeground(Color.WHITE);
			btnViewAllDetails.setBackground(Color.RED);
			btnViewAllDetails.setBounds(655, 287, 143, 25);
		}
		return btnViewAllDetails;
	}
}
