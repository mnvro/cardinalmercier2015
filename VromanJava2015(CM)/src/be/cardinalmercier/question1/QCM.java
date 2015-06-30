package be.cardinalmercier.question1;
/**
 * @author mnv
 *
 */
public class QCM extends Exercice {
	public final static int TYPE_VRAI_FAUX = 1;
	public final static int TYPE_FAUX_VRAI = 2;
	public final static int TYPE_OUI_NON = 3;
	public final static int TYPE_NON_OUI = 4;
	private int nbPropositions;
	private String [] tabPropositions;
	private int indiceBonneReponse;
	public QCM() {
		setType (TypeExercice.TYPE_EXERCICE_QCM);
	}
	public QCM(int niveau, String enonce, int nbPropositions, String [] tabPropositions, int indiceBonneReponse) {
		super(niveau, enonce, TypeExercice.TYPE_EXERCICE_QCM);
		this.nbPropositions = nbPropositions;
		this.tabPropositions = tabPropositions;
		this.indiceBonneReponse = indiceBonneReponse;
	}
	public QCM(int niveau, String enonce, int indiceBonneReponse, int type_vrai_ou_faux){
		super(niveau, enonce, TypeExercice.TYPE_EXERCICE_VRAI_OU_FAUX);
		this.indiceBonneReponse = indiceBonneReponse;
		nbPropositions = 2;
		tabPropositions = new String[nbPropositions];
		switch (type_vrai_ou_faux){
			case (TYPE_VRAI_FAUX):
				tabPropositions[0]="Vrai";
				tabPropositions[1]="Faux";
				break;
			case (TYPE_FAUX_VRAI):
				tabPropositions[1]="Vrai";
				tabPropositions[0]="Faux";
				break;
			case (TYPE_OUI_NON):
				tabPropositions[1]="Non";
				tabPropositions[0]="Oui";
				break;
			case (TYPE_NON_OUI):
				tabPropositions[0]="Non";
				tabPropositions[1]="Oui";
				break;
		}
	}
	public int getNbPropositions() {
		return nbPropositions;
	}
	public void setNbPropositions(int nbPropositions) {
		this.nbPropositions = nbPropositions;
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
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(this.getEnonce());sb.append("\n");
		for (int i=0 ; i < tabPropositions.length ; i++){
			sb.append("\t"+" "+i+" : ");
			sb.append(tabPropositions[i]);
			if (i == indiceBonneReponse){
				sb.append(" *");
			}
			sb.append("\n");
		}
		return sb.toString();
	}
}
