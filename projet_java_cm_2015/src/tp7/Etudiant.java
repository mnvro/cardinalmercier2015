package tp7;

import java.util.Arrays;

public class Etudiant extends Affichable  implements Comparable {
	private int num;
	public Etudiant(int num){
		this.num = num;
	}
	public String toString() {
		return "num de l'étudiant = "+num;
	}
	public void affiche(){
		System.out.println(this.toString());
	}
	public int compareTo(Object o) {
		Etudiant autreEtu = (Etudiant) o;
		return this.num - autreEtu.num;
	}
	public static void main(String[] args) {
		Etudiant tabEtu[] = new Etudiant[3];
		tabEtu[0] = new Etudiant(10); tabEtu[1] = new Etudiant(9); tabEtu[2] = new Etudiant(1);
		System.out.println("Avant le tri");
		for (Etudiant etudiant : tabEtu) {
			etudiant.affiche();
		}
		Arrays.sort(tabEtu);
		System.out.println("Après le tri");
		for (Etudiant etudiant : tabEtu) {
			etudiant.affiche();
		}
	}
}

