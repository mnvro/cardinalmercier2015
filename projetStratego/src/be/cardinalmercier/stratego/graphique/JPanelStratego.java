package be.cardinalmercier.stratego.graphique;


import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import be.cardinalmercier.stratego.Pion;
import be.cardinalmercier.stratego.Stratego;



public class JPanelStratego extends JPanel implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int nbLignes;
	private int nbColonnes;
	private boolean plateauDeJeu;
	private int largeur;
	private int hauteur;
	
	
	
	
	




	public JPanelStratego(int nbLignes, int nbColonnes,boolean plateauDeJeu, char couleurDuJoueur){
		this.nbLignes = nbLignes;
		this.nbColonnes = nbColonnes;
		this.plateauDeJeu = plateauDeJeu;
		
		
		largeur = nbColonnes*Stratego.largeurPixelImage;
		hauteur = nbLignes*Stratego.hauteurPixelImage;
		
		//this.setBackground(Color.BLACK);
		GridBagLayout gridBagLayout = new GridBagLayout();

		GridBagConstraints gbc = new GridBagConstraints();

		setLayout(gridBagLayout);

		JButtonStratego[][] jb = new JButtonStratego[nbLignes][nbColonnes];
		for (int l = 0; l < nbLignes; l++) {
			for (int c = 0; c < nbColonnes; c++){
				//System.out.println("l = "+l+" c = "+c);
				jb[l][c] = new JButtonStratego(l,c,plateauDeJeu,couleurDuJoueur);
				jb[l][c].setPreferredSize(new Dimension(Stratego.largeurPixelImage,Stratego.hauteurPixelImage));
				jb[l][c].setMinimumSize(new Dimension(Stratego.largeurPixelImage,Stratego.hauteurPixelImage));
				jb[l][c].addActionListener(this);
				gbc.gridx = c;
				gbc.gridy = l;
				if (!plateauDeJeu)
					jb[l][c].setPion(Pion.tabPionsJoueur[l*Stratego.NBCOLONNES+c]);
				jb[l][c].setIcon(jb[l][c].getImageDeFond());
				//if (!maBoite) jb[l][c].setCliquable(false); else jb[l][c].setCliquable(true);
				add(jb[l][c], gbc);
			}
		}
	}



	public int getLargeur() {
		return largeur;
	}



	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}



	public int getHauteur() {
		return hauteur;
	}



	public void setHauteur(int hauteur) {
		this.hauteur = hauteur;
	}



	public int getNbLignes() {
		return nbLignes;
	}



	public void setNbLignes(int nbLignes) {
		this.nbLignes = nbLignes;
	}



	public int getNbColonnes() {
		return nbColonnes;
	}



	public void setNbColonnes(int nbColonnes) {
		this.nbColonnes = nbColonnes;
	}



	public boolean isPlateauDeJeu() {
		return plateauDeJeu;
	}



	public void setPlateauDeJeu(boolean plateauDeJeu) {
		this.plateauDeJeu = plateauDeJeu;
	}




	@Override
	public void actionPerformed(ActionEvent e) {
		JButtonStratego jbs = (JButtonStratego)e.getSource();
		System.out.println("on a cliqué en "+jbs.getCoord().getLigne()+" - "+jbs.getCoord().getColonne());
		
	}
	

}
