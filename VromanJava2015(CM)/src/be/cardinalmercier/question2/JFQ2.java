package be.cardinalmercier.question2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridBagLayout;

import javax.swing.JLabel;

import java.awt.GridBagConstraints;

import javax.swing.JTextField;

import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class JFQ2 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField jTextFieldIP;
	private JLabel lblNbBits;
	private JLabel jLableReponse;
	private JButton jButtonCancel;
	private JButton jButtonOK;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFQ2 frame = new JFQ2();
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
	public JFQ2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel jLablIP = new JLabel("IP : ");
		GridBagConstraints gbc_jLablIP = new GridBagConstraints();
		gbc_jLablIP.insets = new Insets(0, 0, 5, 5);
		gbc_jLablIP.anchor = GridBagConstraints.EAST;
		gbc_jLablIP.gridx = 1;
		gbc_jLablIP.gridy = 1;
		contentPane.add(jLablIP, gbc_jLablIP);
		
		jTextFieldIP = new JTextField();
		jTextFieldIP.setText("192.168.0.1");
		GridBagConstraints gbc_jTextFieldIP = new GridBagConstraints();
		gbc_jTextFieldIP.insets = new Insets(0, 0, 5, 0);
		gbc_jTextFieldIP.fill = GridBagConstraints.HORIZONTAL;
		gbc_jTextFieldIP.gridx = 2;
		gbc_jTextFieldIP.gridy = 1;
		contentPane.add(jTextFieldIP, gbc_jTextFieldIP);
		jTextFieldIP.setColumns(10);
		
		lblNbBits = new JLabel("Nb bits \u00E0 1 : ");
		GridBagConstraints gbc_lblNbBits = new GridBagConstraints();
		gbc_lblNbBits.insets = new Insets(0, 0, 5, 5);
		gbc_lblNbBits.gridx = 1;
		gbc_lblNbBits.gridy = 2;
		contentPane.add(lblNbBits, gbc_lblNbBits);
		
		jLableReponse = new JLabel("24");
		GridBagConstraints gbc_jLableReponse = new GridBagConstraints();
		gbc_jLableReponse.insets = new Insets(0, 0, 5, 0);
		gbc_jLableReponse.gridx = 2;
		gbc_jLableReponse.gridy = 2;
		contentPane.add(jLableReponse, gbc_jLableReponse);
		
		jButtonCancel = new JButton("Cancel");
		jButtonCancel.addActionListener(this);
		GridBagConstraints gbc_jButtonCancel = new GridBagConstraints();
		gbc_jButtonCancel.insets = new Insets(0, 0, 0, 5);
		gbc_jButtonCancel.gridx = 1;
		gbc_jButtonCancel.gridy = 3;
		contentPane.add(jButtonCancel, gbc_jButtonCancel);
		
		jButtonOK = new JButton("OK");
		jButtonOK.addActionListener(this);
		GridBagConstraints gbc_jButtonOK = new GridBagConstraints();
		gbc_jButtonOK.gridx = 2;
		gbc_jButtonOK.gridy = 3;
		contentPane.add(jButtonOK, gbc_jButtonOK);
	}

	@Override
	public void actionPerformed(ActionEvent evt) {
		//System.out.println("on a cliqué");
		if (((JButton)evt.getSource()).getActionCommand() == "OK"){
			String ips = jTextFieldIP.getText();
			Ip ip = new Ip (ips);
			int nb1 = ip.getDefaultSlash();
			jLableReponse.setText(nb1+"");
			
		} else{
			//System.out.println("on a cliqué sur cancel");
			jTextFieldIP.setText("");
			jLableReponse.setText("");
		}
		
	}

}
