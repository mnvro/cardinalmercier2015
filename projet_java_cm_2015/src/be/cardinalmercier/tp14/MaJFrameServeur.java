package be.cardinalmercier.tp14;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridBagLayout;

import javax.swing.JLabel;

import java.awt.GridBagConstraints;

import javax.swing.JTextField;
import javax.swing.JButton;

import be.cardinalmercier.tp13.Param;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.IOException;

public class MaJFrameServeur extends JFrame {

	private JPanel contentPane;
	private JTextField jTextFieldNumPort;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MaJFrameServeur frame = new MaJFrameServeur();
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
	public MaJFrameServeur() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel jPanelHaut = new JPanel();
		contentPane.add(jPanelHaut, BorderLayout.NORTH);
		
		JPanel jPanelBas = new JPanel();
		contentPane.add(jPanelBas, BorderLayout.SOUTH);
		
		JButton btnDmarrerLeServeur = new JButton("D\u00E9marrer le serveur");
		btnDmarrerLeServeur.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					MonServeur ms = new MonServeur(Integer.parseInt(jTextFieldNumPort.getText()));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		jPanelBas.add(btnDmarrerLeServeur);
		
		JPanel jPanelCentre = new JPanel();
		contentPane.add(jPanelCentre, BorderLayout.CENTER);
		GridBagLayout gbl_jPanelCentre = new GridBagLayout();
		/*gbl_jPanelCentre.columnWidths = new int[]{0, 0, 0};
		gbl_jPanelCentre.rowHeights = new int[]{0, 0};
		gbl_jPanelCentre.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_jPanelCentre.rowWeights = new double[]{0.0, Double.MIN_VALUE};*/
		jPanelCentre.setLayout(gbl_jPanelCentre);
		
		JLabel jLabelNumPort = new JLabel("Num\u00E9ro du port :");
		GridBagConstraints gbc_jLabelNumPort = new GridBagConstraints();
		//gbc_jLabelNumPort.insets = new Insets(0, 0, 0, 5);
		//gbc_jLabelNumPort.anchor = GridBagConstraints.EAST;
		gbc_jLabelNumPort.gridx = 0;
		gbc_jLabelNumPort.gridy = 0;
		jPanelCentre.add(jLabelNumPort, gbc_jLabelNumPort);
		
		jTextFieldNumPort = new JTextField();
		GridBagConstraints gbc_jTextFieldNumPort = new GridBagConstraints();
		gbc_jTextFieldNumPort.fill = GridBagConstraints.HORIZONTAL;
		gbc_jTextFieldNumPort.gridx = 1;
		gbc_jTextFieldNumPort.gridy = 0;
		jTextFieldNumPort.setText(Param.numPort+"");
		jPanelCentre.add(jTextFieldNumPort, gbc_jTextFieldNumPort);
		jTextFieldNumPort.setColumns(10);
	}

}
