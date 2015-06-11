package be.cm.tp18.copy;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class JFramePrincipale extends JFrame {

	private JPanel contentPane;
	private ExerciceACompleter eac;
	private int score = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					String tabPropositions[] = {"go","goes"};
					ExerciceACompleter eac = new  ExerciceACompleter(1, "She (go) ", 2, tabPropositions, 1, " to school");
					JFramePrincipale frame = new JFramePrincipale(eac);
					JDialogACompleter jdac = new  JDialogACompleter(eac);
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
	public JFramePrincipale(ExerciceACompleter eac) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		//contentPane = new JPanelACompleter(eac); // choisir le bon JPanel
		//contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		//setContentPane(contentPane);
		
		
		
	}
	

}
