package projet_java_cm_2015;

public class Etudiant1 {
	private String nom;
	private String prenom;
	private int num;
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getNum() {
		return num;
	}
	@Override
	public String toString() {
		return "Etudiant1 [nom=" + nom + ", prenom=" + prenom + ", num=" + num
				+ "]";
	}
	public void setNum(int num) {
		this.num = num;
	}
	
}
