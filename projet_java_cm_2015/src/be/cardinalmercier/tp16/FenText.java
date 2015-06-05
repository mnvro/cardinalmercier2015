package be.cardinalmercier.tp16;

import java.awt.* ;
import java.awt.event.* ;
import javax.swing.* ;
class FenText extends JFrame implements ActionListener{ 
	private JTextField saisie, copie ;
	private JButton bouton ;
	public FenText (){ 
		setTitle ("Saisie de texte") ;
		setSize (300, 120) ;
		Container contenu = getContentPane() ;
		contenu.setLayout (new FlowLayout() ) ;
		saisie = new JTextField (20) ;
		contenu.add(saisie) ;
		saisie.addActionListener(this) ;
		bouton = new JButton ("COPIER") ;
		contenu.add(bouton) ;
		bouton.addActionListener(this) ;
		copie = new JTextField (20) ;
		copie.setEditable(false);
		contenu.add(copie) ;
	}
	public void actionPerformed (ActionEvent e){ 
		//if (e.getSource() == bouton){ 
			String texte = saisie.getText() ;
			copie.setText(texte) ;
		//}
	}



	public static void main (String args[]){ 
		FenText fen = new FenText() ;
		fen.setVisible(true) ;
		fen.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}
}