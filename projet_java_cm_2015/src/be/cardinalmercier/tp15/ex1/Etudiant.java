package be.cardinalmercier.tp15.ex1;
import java.util.ArrayList;
public class Etudiant {
	private String nom;
	private static int dernierNumAttribue = 0;
	private int num;
	private ArrayList<Integer> listePoints = new ArrayList<Integer>();
	public static ArrayList<Etudiant> listeEtu = new ArrayList<Etudiant>();
	public Etudiant(String nom){
		this.nom = nom;
		this.num = ++ dernierNumAttribue; //pré-incrémentation on ajoute d'abord 1 puis on fait l'affecation
	}
	public double moyenne(){
		double somme = 0;
		for (Integer points : listePoints) {
			somme += points;
		}
		if (listePoints.size() == 0) return 0;
		return somme / listePoints.size();	
	}
	public String toString() {
		StringBuffer s = new StringBuffer("Nom : " + nom + " num : "+num+"\nPoints : ");
		for (Integer points : listePoints) {
			s.append("\t" + points);
		}
		s.append("\n" + "moyenne = " + this.moyenne()+"\n");
		String s2 = new String(s);
		return s2;
	}
	public static void ajouteEtu(Etudiant newEtu){
		listeEtu.add(newEtu);
	}
	public void ajoutePoint(int newPoint){
		listePoints.add (newPoint);
	}
	/**
	 * @return une chaine de caractères qui représentent tous les étudiants de la liste
	 */
	public static String toStringAll(){
		StringBuffer sb = new StringBuffer();
		for (Etudiant etudiant : listeEtu) {
			sb.append(etudiant.toString());
		}
		String s = new String(sb);
		return s;
	}
}
