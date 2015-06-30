package be.cardinalmercier.question1;

/**
 * @author mnv
 *
 */
public class Exercice {
	private int niveau;
	private String enonce;
	private int type;
	public Exercice(){
	}
	public Exercice(int niveau,String enonce,int type){
		this.niveau = niveau;
		this.enonce = enonce;
		this.type = type;
	}
	public int getNiveau() {
		return niveau;
	}
	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}
	public String getEnonce() {
		return enonce;
	}
	public void setEnonce(String enonce) {
		this.enonce = enonce;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String toString() {
		return "énonce=" + enonce +"\n";
	}
}
