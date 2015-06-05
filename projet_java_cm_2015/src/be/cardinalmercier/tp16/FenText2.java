package be.cardinalmercier.tp16;

import java.awt.* ; import java.awt.event.* ; import javax.swing.* ;
class FenText2 extends JFrame implements ActionListener, FocusListener{ 
	private JTextField saisie, copie ;
	private JButton bouton ;
	public FenText2 (){ 
		setTitle ("Saisie de texte") ;
		setSize (300, 100) ;
		Container contenu = getContentPane() ;
		contenu.setLayout (new FlowLayout() ) ;
		saisie = new JTextField (20) ;
		contenu.add(saisie) ;
		saisie.addActionListener(this) ;
		saisie.addFocusListener(this) ;
		copie = new JTextField (20) ;
		copie.setEditable(false);
		contenu.add(copie) ;
	}
	public void actionPerformed (ActionEvent e){ 
		System.out.println ("validation saisie") ;
		String texte = saisie.getText() ;
		copie.setText(texte) ;
	}
	public void focusLost (FocusEvent e){ 
		System.out.println ("perte focus saisie") ;
		String texte = saisie.getText() ;
		copie.setText(texte) ;
	}
	public void focusGained (FocusEvent e){ 
		System.out.println ("focus sur saisie") ;
	}


	public static void main (String args[]){ 
		FenText2 fen = new FenText2() ;
		fen.setVisible(true) ;
	}
}