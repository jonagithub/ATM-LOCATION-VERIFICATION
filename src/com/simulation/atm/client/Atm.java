package com.simulation.atm.client;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Atm extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblAtmLocationVerification;
	private JLabel label;
	private JButton btnAddAtmUser;
	private JButton btnSimulator;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				
					Atm frame = new Atm();
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
	public Atm() {
		setTitle("ATM LOCATION VERIFICATION DEVELOPED BY JONATHAN RAI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 883, 610);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(47, 79, 79));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getPanel());
		contentPane.add(getLabel());
		contentPane.add(getBtnAddAtmUser());
		contentPane.add(getBtnSimulator());
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBackground(new Color(255, 165, 0));
			panel.setBounds(0, 0, 865, 134);
			panel.setLayout(null);
			panel.add(getLblAtmLocationVerification());
		}
		return panel;
	}
	private JLabel getLblAtmLocationVerification() {
		if (lblAtmLocationVerification == null) {
			lblAtmLocationVerification = new JLabel("ATM LOCATION VERIFICATION");
			lblAtmLocationVerification.setForeground(Color.WHITE);
			lblAtmLocationVerification.setBackground(Color.ORANGE);
			lblAtmLocationVerification.setFont(new Font("Tahoma", Font.BOLD, 35));
			lblAtmLocationVerification.setBounds(146, 46, 629, 57);
		}
		return lblAtmLocationVerification;
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("");
			label.setIcon(new ImageIcon("C:\\Users\\Jonathan\\Downloads\\Simulation Java Icon\\atm.png"));
			label.setBounds(288, 147, 256, 321);
		}
		return label;
	}
	private JButton getBtnAddAtmUser() {
		if (btnAddAtmUser == null) {
			btnAddAtmUser = new JButton("ADD ATM USER");
			btnAddAtmUser.setForeground(new Color(255, 255, 255));
			btnAddAtmUser.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					new UserInfo().setVisible(true);
					dispose();
				}
			});
			btnAddAtmUser.setBackground(new Color(255, 215, 0));
			btnAddAtmUser.setIcon(new ImageIcon("C:\\Users\\Jonathan\\Downloads\\Simulation Java Icon\\add-user.png"));
			btnAddAtmUser.setFont(new Font("Tahoma", Font.BOLD, 16));
			btnAddAtmUser.setBounds(122, 463, 211, 68);
		}
		return btnAddAtmUser;
	}
	private JButton getBtnSimulator() {
		if (btnSimulator == null) {
			btnSimulator = new JButton("SIMULATOR");
			btnSimulator.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new Simulation().setVisible(true);
					dispose();
				}
			});
			btnSimulator.setForeground(new Color(255, 255, 255));
			btnSimulator.setBackground(new Color(255, 215, 0));
			btnSimulator.setFont(new Font("Tahoma", Font.BOLD, 16));
			btnSimulator.setBounds(570, 463, 190, 68);
		}
		return btnSimulator;
	}
}
