package be.cardinalmercier.tp16;

import java.awt.* ;
import java.awt.event.* ;
import javax.swing.* ;
import javax.swing.event.* ; // utile pour DocumentListener ....
class FenText3 extends JFrame implements DocumentListener{ 
	private JTextField saisie, copie ;
	private JButton bouton ;
	public FenText3 (){ 
		setTitle ("Miroir d’un texte") ; setSize (300, 110) ;
		Container contenu = getContentPane() ;
		contenu.setLayout (new FlowLayout() ) ;
		saisie = new JTextField (20) ;
		contenu.add(saisie) ;
		saisie.getDocument().addDocumentListener (this) ;
		copie = new JTextField (20) ;
		copie.setEditable(true);
		copie.setBackground (Color.gray) ;
		contenu.add(copie) ;
	}
	public void insertUpdate (DocumentEvent e){ 
		String texte = saisie.getText() ;
		copie.setText(texte) ;
	}
	public void removeUpdate (DocumentEvent e){ 
		String texte = saisie.getText() ;
		copie.setText(texte) ;
	}
	public void changedUpdate (DocumentEvent e){
	}
	public static void main (String args[]){ 
		FenText3 fen = new FenText3() ;
		fen.setVisible(true) ;
		fen.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
}