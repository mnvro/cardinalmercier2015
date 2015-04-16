package be.cardinalmercier.stratego;

public class Pion {
	protected int type;
	//protected String nomComplet;
	protected boolean surLeJeu = false; // sinon il est dans la boîte de rangement
	protected Coordonnee coord;
	protected boolean pieceQuiCombatNormalement = true;
	protected boolean pieceQuiSeDeplaceNormalement = true;
	protected boolean pieceMobile = true;
	protected char couleur = 'B'; // ou 'R'
	
	
	
	/**
	 * Toutes les sortes de pièce et leur valeur
	 */
	public static final int MARECHAL = 		10; //1
	public static final int GENERAL = 		9;  //1
	public static final int COLONEL  = 		8;  //2
	public static final int COMMANDANT = 	7;  //3
	public static final int CAPITAINE = 	6;  //4
	public static final int LIEUTENANT = 	5;  //4
	public static final int SERGENT = 		4;  //4
	public static final int DEMINEUR = 		3;  //5
	public static final int ECLAIREUR = 	2;  //8
	public static final int ESPION = 		1;  //1
	public static final int BOMBE = 		0;  //6
	public static final int DRAPEAU =  		-1; //1

	public static final Pion tabPionsJoueur[] = new Pion[40];
	
	static{
		//tabPionsJoueur[] = new Pion();
		/*for (int i=0 ; i < tabPionsJoueur.length ; i++){
					tabPionsJoueur[i] = new Pion();
		}*/
		tabPionsJoueur[0] = new Pion(MARECHAL,0,1);
		tabPionsJoueur[1] = new Pion(GENERAL,0,2);
		tabPionsJoueur[2] = new Pion(COLONEL,0,3);
		tabPionsJoueur[3] = new Pion(COLONEL,0,4);
		tabPionsJoueur[4] = new Pion(COMMANDANT,0,5);
		tabPionsJoueur[5] = new Pion(COMMANDANT,0,6);
		tabPionsJoueur[6] = new Pion(COMMANDANT,0,7);
		tabPionsJoueur[7] = new Pion(CAPITAINE,0,8);
		tabPionsJoueur[8] = new Pion(CAPITAINE,0,9);
		tabPionsJoueur[9] = new Pion(CAPITAINE,1,0);
		tabPionsJoueur[10] = new Pion(CAPITAINE,1,1);
		tabPionsJoueur[11] = new Pion(LIEUTENANT,1,2);
		tabPionsJoueur[12] = new Pion(LIEUTENANT,1,3);
		tabPionsJoueur[13] = new Pion(LIEUTENANT,1,4);
		tabPionsJoueur[14] = new Pion(LIEUTENANT,1,5);
		tabPionsJoueur[15] = new Pion(SERGENT,1,6);
		tabPionsJoueur[16] = new Pion(SERGENT,1,7);
		tabPionsJoueur[17] = new Pion(SERGENT,1,8);
		tabPionsJoueur[18] = new Pion(SERGENT,1,9);
		tabPionsJoueur[19] = new Pion(DEMINEUR,2,0);
		tabPionsJoueur[20] = new Pion(DEMINEUR,2,1);
		tabPionsJoueur[21] = new Pion(DEMINEUR,2,2);
		tabPionsJoueur[22] = new Pion(DEMINEUR,2,3);
		tabPionsJoueur[23] = new Pion(DEMINEUR,2,4);
		tabPionsJoueur[24] = new Pion(ECLAIREUR,2,5);
		tabPionsJoueur[25] = new Pion(ECLAIREUR,2,6);
		tabPionsJoueur[26] = new Pion(ECLAIREUR,2,7);
		tabPionsJoueur[27] = new Pion(ECLAIREUR,2,8);
		tabPionsJoueur[28] = new Pion(ECLAIREUR,2,9);
		tabPionsJoueur[29] = new Pion(ECLAIREUR,3,0);
		tabPionsJoueur[30] = new Pion(ECLAIREUR,3,1);
		tabPionsJoueur[31] = new Pion(ECLAIREUR,3,2);
		tabPionsJoueur[32] = new Pion(ESPION,3,3);
		tabPionsJoueur[33] = new Pion(BOMBE,3,4);
		tabPionsJoueur[34] = new Pion(BOMBE,3,5);
		tabPionsJoueur[35] = new Pion(BOMBE,3,6);
		tabPionsJoueur[36] = new Pion(BOMBE,3,7);
		tabPionsJoueur[37] = new Pion(BOMBE,3,8);
		tabPionsJoueur[38] = new Pion(BOMBE,3,9);
		tabPionsJoueur[39] = new Pion(DRAPEAU,0,0);
		
		
	}
	public Pion(){
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public Coordonnee getCoord() {
		return coord;
	}
	public void setCoord(Coordonnee coord) {
		this.coord = coord;
	}
	public char getCouleur() {
		return couleur;
	}
	public void setCouleur(char couleur) {
		this.couleur = couleur;
	}
	public Pion(int type, int ligne, int colonne){
		this.type = type;
		switch (type){
			case BOMBE : case DRAPEAU : pieceMobile = false;
			default : pieceMobile = true;
		}
		switch (type){
			case DEMINEUR : case ESPION : pieceQuiCombatNormalement = false;
			default : pieceQuiCombatNormalement = true;
		}
		switch (type){
			case ECLAIREUR : pieceQuiSeDeplaceNormalement = false;
			default : pieceQuiSeDeplaceNormalement = true;
		}
	
		
	}
	
	/**
	 * la méthode attaque permet d'attaquer un autre pion
	 * @param unAutrePion le pion contre qui a lieu le combat
	 * @return 0 si les deux pions meurent -1 si c'est l'autre qui gagne +1 si le pion en cours gagne
	 */
	public int attaque (Pion unAutrePion){
		return 0;
	}
	
	public boolean deplacementValide(Coordonnee source, Coordonnee destination){
		return true;
	}
	
	public void seDeplace (Coordonnee source, Coordonnee destination){
		if (pieceMobile && deplacementValide(source, destination)){
			coord = destination;
		}
	}
	
}

