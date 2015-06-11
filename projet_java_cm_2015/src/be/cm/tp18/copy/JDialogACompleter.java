package be.cm.tp18.copy;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class JDialogACompleter extends JDialog implements ActionListener {
	private JTextField jTextFieldACompleter;
	private JLabel jLabelDebutPhrase;
	private JLabel jLabelFinPhrase;
	
	private ExerciceACompleter exerciceACompleter;
	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			String tabPropositions[] = {"go","goes"};
			ExerciceACompleter eac = new  ExerciceACompleter(1, "She (go) ", 2, tabPropositions, 1, " to school");
			JDialogACompleter dialog = new JDialogACompleter(eac);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public JDialogACompleter(ExerciceACompleter exercice) {
		setBounds(100, 100, 450, 300);
		this.setTitle("JDialog");
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		this.exerciceACompleter = exercice;
		setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		jLabelDebutPhrase = new JLabel("New label");
		add(jLabelDebutPhrase);
		
		jTextFieldACompleter = new JTextField();
		jTextFieldACompleter.setText("");
		add(jTextFieldACompleter);
		jTextFieldACompleter.setColumns(10);
		
		jLabelFinPhrase = new JLabel("New label");
		add(jLabelFinPhrase);
		
		
		
		jLabelDebutPhrase.setText(exercice.getPhraseDebut());
		jTextFieldACompleter.setText("");
		jLabelFinPhrase.setText(exercice.getPhraseFin());
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
				okButton.addActionListener(this);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
			this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			this.setVisible(true);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String repDuJoueur = jTextFieldACompleter.getText();
		if (exerciceACompleter.estLaBonneReponse(repDuJoueur))
			JOptionPane.showMessageDialog(null, "Bonne réponse");
		else{
			JOptionPane.showMessageDialog(null, "Mauvaise réponse");
		}
		
	}

}
