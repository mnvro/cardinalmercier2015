package be.cm.tp18.copy;

/**
 * @author Marie-Noël Vroman
 *
 */
public class Exercice {
	
	protected int type;
	protected int niveauDeDifficulté;
	protected String phraseDebut;
	
	
	public static final int TYPE_QCM = 0;
	public static final int TYPE_ACOMPLETER = 1;
	public static final int TYPE_VRAI_FAUX = 2;
	
	public Exercice(int niveauDeDifficulté, String phraseDebut) {
		super();
		this.niveauDeDifficulté = niveauDeDifficulté;
		this.phraseDebut = phraseDebut;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getNiveauDeDifficulté() {
		return niveauDeDifficulté;
	}

	public void setNiveauDeDifficulté(int niveauDeDifficulté) {
		this.niveauDeDifficulté = niveauDeDifficulté;
	}

	public String getPhraseDebut() {
		return phraseDebut;
	}

	public void setPhraseDebut(String phraseDebut) {
		this.phraseDebut = phraseDebut;
	}
	
	
	
	

}
