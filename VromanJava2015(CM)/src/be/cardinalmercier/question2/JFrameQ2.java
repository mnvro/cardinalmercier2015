package be.cardinalmercier.question2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridBagLayout;

import javax.swing.JLabel;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

public class JFrameQ2 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField jTextFieldIP;
	private JLabel jLabelReponse;
	private JButton jButtonCancel;
	private JButton jButtonOK;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameQ2 frame = new JFrameQ2();
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
	public JFrameQ2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		
		panel.setLayout(gbl_panel);
		
		JLabel jLabelIP = new JLabel("IP :");
		GridBagConstraints gbc_jLabelIP = new GridBagConstraints();
		
		gbc_jLabelIP.gridx = 0;
		gbc_jLabelIP.gridy = 0;
		panel.add(jLabelIP, gbc_jLabelIP);
		
		jTextFieldIP = new JTextField();
		jTextFieldIP.setText("192.168.199.245");
		GridBagConstraints gbc_jTextFieldIP = new GridBagConstraints();
		
		gbc_jTextFieldIP.gridx = 1;
		gbc_jTextFieldIP.gridy = 0;
		panel.add(jTextFieldIP, gbc_jTextFieldIP);
		jTextFieldIP.setColumns(10);
		
		JLabel jLabelNb1 = new JLabel("Nb de bits \u00E0 1 dans le masque par d\u00E9faut : ");
		GridBagConstraints gbc_jLabelNb1 = new GridBagConstraints();
		
		gbc_jLabelNb1.gridx = 0;
		gbc_jLabelNb1.gridy = 1;
		panel.add(jLabelNb1, gbc_jLabelNb1);
		
		jLabelReponse = new JLabel("24");
		GridBagConstraints gbc_jLabelReponse = new GridBagConstraints();
		
		gbc_jLabelReponse.gridx = 1;
		gbc_jLabelReponse.gridy = 1;
		panel.add(jLabelReponse, gbc_jLabelReponse);
		
		jButtonCancel = new JButton("Cancel");
		GridBagConstraints gbc_jButtonCancel = new GridBagConstraints();
		
		gbc_jButtonCancel.gridx = 0;
		gbc_jButtonCancel.gridy = 2;
		jButtonCancel.addActionListener(this);
		panel.add(jButtonCancel, gbc_jButtonCancel);
		
		jButtonOK = new JButton("OK");
		GridBagConstraints gbc_jButtonOK = new GridBagConstraints();
		gbc_jButtonOK.gridx = 1;
		gbc_jButtonOK.gridy = 2;
		jButtonOK.addActionListener(this);
		panel.add(jButtonOK, gbc_jButtonOK);
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		String source = (String) event.getActionCommand();
		if (source.compareToIgnoreCase("OK")==0){
			Ip ip = new Ip(jTextFieldIP.getText());
			jLabelReponse.setText(ip.getDefaultSlash()+"");
		}else{
			jTextFieldIP.setText("");
			jLabelReponse.setText("");
		}
		
	}

}
