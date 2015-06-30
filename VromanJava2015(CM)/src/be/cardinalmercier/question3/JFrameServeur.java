package be.cardinalmercier.question3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridBagLayout;

import javax.swing.JButton;

import java.awt.GridBagConstraints;

import javax.swing.JLabel;

import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class JFrameServeur extends JFrame implements ActionListener,Runnable {

	private JPanel contentPane;
	private JLabel jLabel;
	private JButton jButtonLancer;
	private Serveur s;
	private Socket client;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameServeur frame = new JFrameServeur();
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
	public JFrameServeur() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		jLabel = new JLabel("On va d\u00E9marrer le serveur");
		GridBagConstraints gbc_jLabel = new GridBagConstraints();
		gbc_jLabel.insets = new Insets(0, 0, 5, 0);
		gbc_jLabel.gridx = 1;
		gbc_jLabel.gridy = 0;
		panel.add(jLabel, gbc_jLabel);
		
		jButtonLancer = new JButton("Lancer le serveur");
		GridBagConstraints gbc_jButtonLancer = new GridBagConstraints();
		gbc_jButtonLancer.gridx = 1;
		gbc_jButtonLancer.gridy = 1;
		jButtonLancer.addActionListener(this);
		panel.add(jButtonLancer, gbc_jButtonLancer);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		try {
			s = new Serveur();
			jButtonLancer.setVisible(false);
			new Thread(this).start();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void run() {
		try {
			jLabel.setText("On attend un client");
			client = s.accept();
			jLabel.setText("Un client s'est connecté");
			new ObjectOutputStream(client.getOutputStream()).writeObject("Bienvenue sur le serveur");
			jLabel.setText("on a envoyé un message au client");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
