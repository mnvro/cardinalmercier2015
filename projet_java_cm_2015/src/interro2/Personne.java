package interro2;

public class Personne {
	private String nom;
	private String prenom;
	private Date dateNaissance;
	public Personne(String nom, String prenom, int jj, int mm, int aaaa) {
		this.nom = nom;
		this.prenom = prenom;
		dateNaissance = new Date(jj,mm,aaaa);
	}
	
	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom
				+ ", dateNaissance=" + dateNaissance.toString() + "]";
	}
}
