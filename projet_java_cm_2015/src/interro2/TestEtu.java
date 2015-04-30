package interro2;
import java.util.Arrays;
public class TestEtu {
	public static void main(String[] args) {
		Etudiant[] tabEtu = new Etudiant[3];
		tabEtu[0] = new Etudiant("Vroman", "Marie-Noël", 30, 12, 1969);
		tabEtu[1] = new Etudiant("Castiaux", "Laurane", 12, 9 ,1998);
		tabEtu[2] = new Etudiant("Castiaux", "Julien", 1, 3, 1997);
		System.out.println("Avant le tri\n");
		for (int i = 0; i < tabEtu.length; i++) {
			System.out.println(tabEtu[i]);
		}
		Arrays.sort(tabEtu);
		System.out.println("Après le tri\n");
		for (int i = 0; i < tabEtu.length; i++) {
			System.out.println(tabEtu[i]);
		}
	}
}
