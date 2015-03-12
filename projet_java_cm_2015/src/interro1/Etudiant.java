package interro1;

public class Etudiant extends Personne {
	private int numeroMatricule;
	private static int nbEtu;
	public Etudiant(String nom, String prenom, int jj, int mm, int aaaa){
		super(nom,prenom,jj,mm,aaaa);
		nbEtu++;
		numeroMatricule = nbEtu;
	}
	public String toString() {
		return "Etudiant ["+ 
				super.toString() + ", numéro de matricule=" + numeroMatricule +  "]";
	}
}
