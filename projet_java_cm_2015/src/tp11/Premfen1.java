package tp11;

import javax.swing.* ;
class MaFenetre extends JFrame{ 
	public MaFenetre () { // constructeur
		setTitle ("Ma premiere fenetre") ;
		setSize (300, 150) ;
		this.setVisible(true);
		setBounds (100, 50, 300, 200) ;
	}
}
public class Premfen1{ 
	public static void main (String args[]){ 
		JFrame fen = new MaFenetre() ;
		//fen.setVisible (true) ;
		//fen.setBounds (100, 50, 300, 200) ; // le coin supérieur gauche de la fenetre
		// est placé au pixel de coordonnées 10, 40
		// et ses dimensions seront de 300 * 200 pixels
	}
}
