package be.cardinalmercier.stratego;

public class Case {
	private int ligne;
	private int colonne;
	private Pion pion;
	public boolean estLibre(){
		return pion == null ;
	}
	public int getLigne() {
		return ligne;
	}
	public void setLigne(int ligne) {
		this.ligne = ligne;
	}
	public int getColonne() {
		return colonne;
	}
	public void setColonne(int colonne) {
		this.colonne = colonne;
	}
	public Pion getPion() {
		return pion;
	}
	public void setPion(Pion pion) {
		this.pion = pion;
	}
	public Coordonnee getCaseDessus(){
		int l;
		if (ligne > 0) l = ligne-1; else return null;
		Coordonnee coord = new Coordonnee(l,colonne);
		return coord;
	}
	public Coordonnee getCaseDessous(){
		int l;
		if (ligne < Stratego.NBLIGNES-1) l = ligne+1; else return null;
		Coordonnee coord = new Coordonnee(l,colonne);
		return coord;
	}
	public Coordonnee getCaseGauche(){
		int c;
		if (colonne > 0) c = colonne-1; else return null;
		Coordonnee coord = new Coordonnee(ligne,c);
		return coord;
	}
	public Coordonnee getCaseDroite(){
		int c;
		if (colonne < Stratego.NBCOLONNES-1) c = colonne+1; else return null;
		Coordonnee coord = new Coordonnee(ligne,c);
		return coord;
	}
}
