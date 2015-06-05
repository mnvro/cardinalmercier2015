package be.cardinalmercier.tp16;

import java.awt.* ;
import java.awt.event.* ;
import javax.swing.* ;
class FenCombo2 extends JFrame implements ActionListener{ 
	private String[] couleurs = {"rouge", "bleu", "gris", "vert", "jaune", "noir" } ;
	private JComboBox combo ;
	public FenCombo2(){ 
		setTitle ("Essais boite combinee") ;
		setSize (300, 200) ;
		Container contenu = getContentPane() ;
		contenu.setLayout (new FlowLayout() ) ;
		combo = new JComboBox(couleurs) ;
		combo.setEditable (true) ;
		combo.setMaximumRowCount(6);
		contenu.add(combo) ;
		combo.addActionListener (this) ;
	}
	public void actionPerformed (ActionEvent e){ 
		System.out.print ("action combo - ") ;
		Object valeur = combo.getSelectedItem() ;
		int rang = combo.getSelectedIndex() ;
		if (rang == -1){ 
			System.out.println ("saisie nouvelle valeur : " + valeur) ;
			combo.addItem (valeur) ;
		}else
			System.out.println ("selection valeur existante : " + valeur
					+ " de rang : " + rang) ;
	}
	

	public static void main (String args[]){ 
		FenCombo2 fen = new FenCombo2() ;
		fen.setVisible(true) ;
		fen.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
}