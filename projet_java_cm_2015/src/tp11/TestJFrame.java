package tp11;

import javax.swing.JFrame;

public class TestJFrame {

	public static void main(String[] args) {
		JFrame fen = new JFrame() ;
		fen.setVisible (true) ; 	// rend visible la fenêtre de référence fen
		fen.setSize (300, 150) ; 	// donne à la fenêtre une hauteur de 150 pixels
									// et une largeur de 300 pixels
		fen.setTitle ("Ma premiere fenetre") ;
	}

}
