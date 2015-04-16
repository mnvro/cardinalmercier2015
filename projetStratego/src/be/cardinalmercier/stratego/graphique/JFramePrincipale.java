package be.cardinalmercier.stratego.graphique;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import be.cardinalmercier.stratego.Couleur;
import be.cardinalmercier.stratego.Stratego;

public class JFramePrincipale extends JFrame {
	private char couleur;
	
	private JPanelStratego plateauDeJeu;
	private JPanelStratego boiteDeRangement;
	private JPanelStratego boiteDeRangementAdversaire;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFramePrincipale frame = new JFramePrincipale();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JFramePrincipale() {
		couleur = (JOptionPane.showInputDialog("Votre couleur (R/B) ?")).toUpperCase().charAt(0);
		//System.out.println("couleur = "+couleur);
		plateauDeJeu = new JPanelStratego(Stratego.NBLIGNES,Stratego.NBCOLONNES,true,couleur);
		boiteDeRangement = new JPanelStratego(4,Stratego.NBCOLONNES,false,couleur);
		boiteDeRangementAdversaire = new JPanelStratego(4,Stratego.NBCOLONNES,false,Couleur.getAutreCouleur(couleur));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, plateauDeJeu.getLargeur()+boiteDeRangement.getLargeur() + Stratego.nbPixelsAjoutesEnLargeur, 
				plateauDeJeu.getHauteur() + Stratego.nbPixelsAjoutesEnHauteur
		);
		setMinimumSize(new Dimension(Stratego.NBCOLONNES*Stratego.largeurPixelImage + Stratego.nbPixelsAjoutesEnLargeur, 
				Stratego.NBLIGNES*Stratego.hauteurPixelImage + Stratego.nbPixelsAjoutesEnHauteur)
		);
		
		
		JPanel jPanelHaut = new JPanel();
		getContentPane().add(jPanelHaut, BorderLayout.NORTH);
		
		JPanel jPanelBas = new JPanel();
		getContentPane().add(jPanelBas, BorderLayout.SOUTH);
		
		JPanel jPanelDroit = new JPanel();
		getContentPane().add(jPanelDroit, BorderLayout.EAST);
		jPanelDroit.setLayout(new BorderLayout(0, 0));
		
		JPanel jPanelCentre = new JPanel();
		getContentPane().add(jPanelCentre, BorderLayout.CENTER);
		
		jPanelCentre.add(plateauDeJeu);
		jPanelDroit.add(boiteDeRangementAdversaire,BorderLayout.NORTH);
		jPanelDroit.add(boiteDeRangement,BorderLayout.SOUTH);
	}

}
