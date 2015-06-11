package be.cm.tp18.copy;

public class ExerciceACompleter extends QCM {
	private String phraseFin;
	public ExerciceACompleter(int niveauDeDifficulté,
			String phraseDebut, int nbProposition, String[] tabPropositions,
			int indiceBonneReponse, String phraseFin) {
		super(niveauDeDifficulté, phraseDebut, nbProposition, tabPropositions,
				indiceBonneReponse);
		this.phraseFin = phraseFin;
		this.type = Exercice.TYPE_QCM;
	}

	public static void main(String[] args) {
		String tabPropositions[] = {"go","goes"};
		ExerciceACompleter eac = new  ExerciceACompleter(1, "She (go) ", 2, tabPropositions, 1, " to school");
	}

	public String getPhraseFin() {
		return phraseFin;
	}

	public void setPhraseFin(String phraseFin) {
		this.phraseFin = phraseFin;
	}
	
	public boolean estLaBonneReponse(String reponse){
		return reponse.compareToIgnoreCase(this.getTabPropositions()[this.getIndiceBonneReponse()])==0;
	}

}
