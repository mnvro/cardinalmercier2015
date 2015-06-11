package be.cm.tp18.copy;

/**
 * @author Marie-No�l Vroman
 *
 */
public class Exercice {
	
	protected int type;
	protected int niveauDeDifficult�;
	protected String phraseDebut;
	
	
	public static final int TYPE_QCM = 0;
	public static final int TYPE_ACOMPLETER = 1;
	public static final int TYPE_VRAI_FAUX = 2;
	
	public Exercice(int niveauDeDifficult�, String phraseDebut) {
		super();
		this.niveauDeDifficult� = niveauDeDifficult�;
		this.phraseDebut = phraseDebut;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getNiveauDeDifficult�() {
		return niveauDeDifficult�;
	}

	public void setNiveauDeDifficult�(int niveauDeDifficult�) {
		this.niveauDeDifficult� = niveauDeDifficult�;
	}

	public String getPhraseDebut() {
		return phraseDebut;
	}

	public void setPhraseDebut(String phraseDebut) {
		this.phraseDebut = phraseDebut;
	}
	
	
	
	

}
