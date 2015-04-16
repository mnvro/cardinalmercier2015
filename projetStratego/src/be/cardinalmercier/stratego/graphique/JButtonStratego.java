package be.cardinalmercier.stratego.graphique;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import be.cardinalmercier.stratego.Coordonnee;
import be.cardinalmercier.stratego.Pion;
import be.cardinalmercier.stratego.Stratego;

public class JButtonStratego extends JButton {
	private Coordonnee coord;
	private Pion pion;
	private ImageIcon imageDeFond;
	private boolean surLeJeu = true;
	private boolean cliquable;
	
	public boolean isCliquable() {
		return cliquable;
	}
	public void setCliquable(boolean cliquable) {
		this.cliquable = cliquable;
	}
	/**
	 * @param ligne
	 * @param colonne
	 * @param surLeJeu
	 * @param couleur
	 * @param parent 0 pour dire que le jButton fait partie du plateau de jeu, 1 s'il appartient à la boîte de rangement de l'adversaire et 2 si c'est ma boîte de rangement
	 */
	public JButtonStratego(int ligne, int colonne, boolean surLeJeu, char couleur) {
		super();
		this.surLeJeu = surLeJeu;
		//this.cliquable = cliquable;
		
		this.coord = new Coordonnee(ligne,colonne);
		if (surLeJeu){
			imageDeFond = new ImageIcon(GestionImage.getImagePlateauDeJeu(ligne, colonne));
			this.setIcon(imageDeFond);
		} else{
			setPion(Pion.tabPionsJoueur[ligne*Stratego.NBCOLONNES+colonne]);
			imageDeFond = new ImageIcon(GestionImage.getImageBoiteDeRangement(pion.getType(), ligne, colonne, couleur));
			
		}
		pion = null;
	}
	public boolean estSurLeJeu(){
		return surLeJeu;
	}
	public Coordonnee getCoord() {
		return coord;
	}
	public void setCoord(Coordonnee coord) {
		this.coord = coord;
	}
	public Pion getPion() {
		return pion;
	}
	public void setPion(Pion pion) {
		this.pion = pion;
	}
	public ImageIcon getImageDeFond() {
		return imageDeFond;
	}
	public void setImageDeFond(ImageIcon imageDeFond) {
		this.imageDeFond = imageDeFond;
	}
	

}
