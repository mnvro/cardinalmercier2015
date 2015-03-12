package tp2Etu;

import javax.swing.JOptionPane;

public class Etudiant {
	private String nom;
	private String prenom;
	private int nbExercicesTotal;
	private int nbExercicesReussis;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getNbExercicesTotal() {
		return nbExercicesTotal;
	}
	public void setNbExercicesTotal(int nbExercicesTotal) {
		this.nbExercicesTotal = nbExercicesTotal;
	}
	public int getNbExercicesReussis() {
		return nbExercicesReussis;
	}
	public void setNbExercicesReussis(int nbExercicesReussis) {
		this.nbExercicesReussis = nbExercicesReussis;
	}

	

}
