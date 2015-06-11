package be.cm.tp18.copy;

public class ExerciceVraiFaux extends QCM {
	public final static int VRAI = 1;
	public final static int FAUX = 0;

	public ExerciceVraiFaux(int niveauDeDifficulté,
			String phraseDebut, int indiceBonneReponse) {
		super(niveauDeDifficulté, phraseDebut,
				indiceBonneReponse);
		nbProposition = 2;
		String[] tabProp = {"Faux","Vrai"};
		tabPropositions = tabProp;
		this.type = Exercice.TYPE_QCM;
		
	}
	
	public static void main(String[] args) {
		ExerciceVraiFaux evf = new ExerciceVraiFaux(1, "Le pluriel de cheval est chevaux ", VRAI);
	}
	
}
