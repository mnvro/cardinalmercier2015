package be.cardinalmercier.question1;
/**
 * @author mnv
 *
 */
public class ExerciceATrou extends Exercice {
	private String bonneReponse;
	private String finEnonce;
	public ExerciceATrou() {
	}
	public ExerciceATrou(int niveau, String enonce, String bonneReponse, String finEnonce) {
		super(niveau, enonce, TypeExercice.TYPE_EXERCICE_A_TROU);
		this.bonneReponse = bonneReponse;
		this.finEnonce = finEnonce;
	}

	public String toString() {
		return super.toString()+" "+ bonneReponse + " " + finEnonce;
	}
	/**
	 * @param reponse la r�ponse de l'utilisateur
	 * @return vrai si la r�ponse est la m�me que la r�ponse attendue (en ignorant la casse)
	 */
	public boolean verification(String reponse){
		return bonneReponse.compareToIgnoreCase(reponse) == 0;
	}
	public String getBonneReponse() {
		return bonneReponse;
	}
	public void setBonneReponse(String bonneReponse) {
		this.bonneReponse = bonneReponse;
	}
	public String getFinEnonce() {
		return finEnonce;
	}
	public void setFinEnonce(String finEnonce) {
		this.finEnonce = finEnonce;
	}
	
}
