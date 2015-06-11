package be.cm.tp18.copy;

public class QCM extends Exercice {
	

	protected int nbProposition;
	protected String tabPropositions[] = new String[nbProposition];
	protected int indiceBonneReponse;
	
	public QCM(int niveauDeDifficulté, String phraseDebut, 
			int nbProposition, String tabPropositions[],
			int indiceBonneReponse) {
		super(niveauDeDifficulté, phraseDebut);
		this.nbProposition = nbProposition;
		this.tabPropositions = tabPropositions;
		this.indiceBonneReponse = indiceBonneReponse;
		this.type = Exercice.TYPE_QCM;
	}
	
	protected QCM(int niveauDeDifficulté, String phraseDebut,
			int indiceBonneReponse) {
		super(niveauDeDifficulté, phraseDebut);
		this.nbProposition = 2;
		this.tabPropositions[0] = "Faux"; this.tabPropositions[1] = "Vrai";
		this.indiceBonneReponse = indiceBonneReponse;
		this.type = Exercice.TYPE_QCM;
	}

	public boolean estLaBonneReponse(int indice){
		return indice == indiceBonneReponse;
	}
	
	public boolean estLaBonneReponse(String s){
		return s.compareToIgnoreCase(tabPropositions[indiceBonneReponse]) == 0;
	}
	public static void main(String[] args) {
		String tabPropositions[] = {"Bruxelles","Luxembourg","Paris"};
		QCM qcm = new QCM(1, "Quelle est la capitale de la Belgique", 3, tabPropositions, 0);
	}

	public int getNbProposition() {
		return nbProposition;
	}

	public void setNbProposition(int nbProposition) {
		this.nbProposition = nbProposition;
	}

	public String[] getTabPropositions() {
		return tabPropositions;
	}

	public void setTabPropositions(String[] tabPropositions) {
		this.tabPropositions = tabPropositions;
	}

	public int getIndiceBonneReponse() {
		return indiceBonneReponse;
	}

	public void setIndiceBonneReponse(int indiceBonneReponse) {
		this.indiceBonneReponse = indiceBonneReponse;
	}

}
