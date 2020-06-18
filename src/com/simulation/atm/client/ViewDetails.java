package com.simulation.atm.client;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.util.List;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.simulation.atm.model.Customer;
import com.simulation.atm.service.CustomerDao;
import com.simulation.atm.service.CustomerDaoImpl;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewDetails extends JFrame {

	private JPanel contentPane;
	private JButton btnBack;
	private JScrollPane scrollPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewDetails frame = new ViewDetails();
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
	public ViewDetails() {
		setTitle("ATM LOCATION VERIFICATION DEVELOPED BY JONATHAN RAI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 812, 580);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(105, 105, 105));
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getBtnBack());
		contentPane.add(getScrollPane());
		
		
	}
	private JButton getBtnBack() {
		if (btnBack == null) {
			btnBack = new JButton("BACK");
			btnBack.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					new Simulation().setVisible(true);
					dispose();
				}
			});
			btnBack.setForeground(new Color(255, 255, 255));
			btnBack.setBackground(new Color(255, 0, 0));
			btnBack.setFont(new Font("Tahoma", Font.BOLD, 16));
			btnBack.setBounds(324, 463, 150, 43);
		}
		return btnBack;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(46, 48, 708, 377);
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}
	private JTable getTable() {
		if (table == null) {
			table = new JTable();
			table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Account Number", "Name", "Address", "Total Transactions per Week"
				}
			));
		}
		return table;
	}

	void displayData(String address) {
		CustomerDao cdao= new CustomerDaoImpl();
	    List<Customer> slist=cdao.getAllInfo(address);
	    DefaultTableModel model = (DefaultTableModel) table.getModel();
	    model.setRowCount(0);
	    for(Customer c:slist)
	    {
	    	model.addRow(new Object[] {c.getAccountnumber(),c.getName(),c.getAddress(),c.getNumberoftransaction()});
	    	
	    	}
	    
			}
	void displayData() {
		CustomerDao cdao= new CustomerDaoImpl();
	    List<Customer> slist=cdao.getAllInfo();
	    DefaultTableModel model = (DefaultTableModel) table.getModel();
	    model.setRowCount(0);
	    for(Customer c:slist)
	    {
	    	model.addRow(new Object[] {c.getAccountnumber(),c.getName(),c.getAddress(),c.getNumberoftransaction()});
	    	
	    	}
	    
			}
}
