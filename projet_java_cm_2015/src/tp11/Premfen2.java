package tp11;

import javax.swing.* ;
class MaFenetre extends JFrame{ 
	public MaFenetre () { 
		setTitle ("Ma premiere fenetre") ;
		setBounds (50, 100, 300, 150) ;
	}
}
public class Premfen2{ 
	public static void main (String args[]){ 
		JFrame fen = new MaFenetre() ;
		fen.setVisible (true) ;
		while (true) { 
			System.out.print ("nouvelle largeur : ") ;
			//int larg = Clavier.lireInt() ;
			int larg = Integer.parseInt(JOptionPane.showInputDialog("largeur"));
			System.out.print ("nouvelle hauteur : ") ;
			//int haut = Clavier.lireInt() ;
			int haut = Integer.parseInt(JOptionPane.showInputDialog("hauteur"));
			System.out.print ("nouveau titre : (vide pour finir) ");
			//String tit = Clavier.lireString() ;
			String tit = JOptionPane.showInputDialog("titre");
			if (tit.length() == 0) break ;
			fen.setSize (larg, haut) ;
			fen.setTitle(tit) ;
		}
	}
}