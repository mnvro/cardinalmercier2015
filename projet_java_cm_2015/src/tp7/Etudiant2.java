package tp7;

import java.util.Arrays;

public class Etudiant2 extends Affichable  implements Comparable<Etudiant2> {
	private int num;
	public int compareTo(Etudiant2 unAutreEtu) {
		return this.num - unAutreEtu.num;
	}
	public Etudiant2(int num){
		this.num = num;
	}
	public String toString() {
		return "num de l'étudiant = "+num;
	}
	public void affiche(){
		System.out.println(this.toString());
	}
	
	public static void main(String[] args) {
		Etudiant2 tabEtu[] = new Etudiant2[3];
		tabEtu[0] = new Etudiant2(10); tabEtu[1] = new Etudiant2(9); tabEtu[2] = new Etudiant2(1);
		System.out.println("Avant le tri");
		for (Etudiant2 etudiant : tabEtu) {
			etudiant.affiche();
		}
		Arrays.sort(tabEtu);
		System.out.println("Après le tri");
		for (Etudiant2 etudiant : tabEtu) {
			etudiant.affiche();
		}
	}
	

	
}