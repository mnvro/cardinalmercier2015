package be.cm.tp18;

import javax.swing.JPanel;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class JPanelACompleter extends JPanel implements ActionListener {
	private JTextField jTextFieldACompleter;
	private JLabel jLabelDebutPhrase;
	private JLabel jLabelFinPhrase;
	private JButton btnValiderMaRponse;

	/**
	 * Create the panel.
	 */
	public JPanelACompleter() {
		setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		jLabelDebutPhrase = new JLabel("New label");
		add(jLabelDebutPhrase);
		
		jTextFieldACompleter = new JTextField();
		jTextFieldACompleter.setText("");
		add(jTextFieldACompleter);
		jTextFieldACompleter.setColumns(10);
		
		jLabelFinPhrase = new JLabel("New label");
		add(jLabelFinPhrase);
		
		btnValiderMaRponse = new JButton("Valider ma r\u00E9ponse");
		btnValiderMaRponse.addActionListener(this);
		add(btnValiderMaRponse);

	}
	
	public void afficherExercice(Exercice exercice){
		//jLabelDebutPhrase.setText(exercice.getDebutPhrase());
		jTextFieldACompleter.setText("");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// vérifier la réponse
		System.out.println("ça fonctionne!");
		
	}

}
