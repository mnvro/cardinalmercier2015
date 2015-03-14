package tp9;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JTextField;



import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FenetreAvecWB extends JFrame {

	private JPanel contentPane;
	private JTextField jTextFieldIP;
	private JTextField jTextFieldResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FenetreAvecWB frame = new FenetreAvecWB();
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
	public FenetreAvecWB() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 150, 400, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel jPanelHaut = new JPanel();
		contentPane.add(jPanelHaut, BorderLayout.NORTH);
		
		JLabel jLabelHaut = new JLabel("Bonjour tout le monde");
		jPanelHaut.add(jLabelHaut);
		
		JPanel jPanelBas = new JPanel();
		contentPane.add(jPanelBas, BorderLayout.SOUTH);
		
		JButton jButtonOK = new JButton("OK");
		jButtonOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ip ip = new Ip(jTextFieldIP.getText());
				System.out.println(ip.getClasse());
				//jTextFieldResult.setText("toto");
				jTextFieldResult.setText( ip.getClasse()+"");
			}
		});
		jPanelBas.add(jButtonOK);
		
		JButton jButtonCancel = new JButton("Cancel");
		jButtonCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jTextFieldIP.setText("");
				
				jTextFieldResult.setText("");
			}
		});
		jPanelBas.add(jButtonCancel);
		
		JPanel jPanelCentre = new JPanel();
		contentPane.add(jPanelCentre, BorderLayout.CENTER);
		GridBagLayout gbl_jPanelCentre = new GridBagLayout();
		gbl_jPanelCentre.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_jPanelCentre.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_jPanelCentre.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_jPanelCentre.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		jPanelCentre.setLayout(gbl_jPanelCentre);
		
		JLabel jLabelIP = new JLabel("Adresse Ip");
		GridBagConstraints gbc_jLabelIP = new GridBagConstraints();
		gbc_jLabelIP.anchor = GridBagConstraints.EAST;
		gbc_jLabelIP.insets = new Insets(0, 0, 5, 5);
		gbc_jLabelIP.gridx = 2;
		gbc_jLabelIP.gridy = 1;
		jPanelCentre.add(jLabelIP, gbc_jLabelIP);
		
		jTextFieldIP = new JTextField();
		jTextFieldIP.setText("192.168.0.1");
		GridBagConstraints gbc_jTextFieldIP = new GridBagConstraints();
		gbc_jTextFieldIP.fill = GridBagConstraints.HORIZONTAL;
		gbc_jTextFieldIP.insets = new Insets(0, 0, 5, 0);
		gbc_jTextFieldIP.gridx = 3;
		gbc_jTextFieldIP.gridy = 1;
		jPanelCentre.add(jTextFieldIP, gbc_jTextFieldIP);
		jTextFieldIP.setColumns(10);
		
		JLabel jLabelClasse = new JLabel("Classe :");
		GridBagConstraints gbc_jLabelClasse = new GridBagConstraints();
		gbc_jLabelClasse.anchor = GridBagConstraints.EAST;
		gbc_jLabelClasse.insets = new Insets(0, 0, 0, 5);
		gbc_jLabelClasse.gridx = 2;
		gbc_jLabelClasse.gridy = 3;
		jPanelCentre.add(jLabelClasse, gbc_jLabelClasse);
		
		jTextFieldResult = new JTextField();
		jTextFieldResult.setEditable(false);
		GridBagConstraints gbc_jTextFieldResult = new GridBagConstraints();
		gbc_jTextFieldResult.fill = GridBagConstraints.HORIZONTAL;
		gbc_jTextFieldResult.gridx = 3;
		gbc_jTextFieldResult.gridy = 3;
		jPanelCentre.add(jTextFieldResult, gbc_jTextFieldResult);
		jTextFieldResult.setColumns(10);
	}

}
