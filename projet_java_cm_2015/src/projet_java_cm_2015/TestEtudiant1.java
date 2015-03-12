package projet_java_cm_2015;

public class TestEtudiant1 {

	public static void main(String[] args) {
		Etudiant1 et = new Etudiant1();
		et.setNom("Vroman");
		et.setPrenom("Marie-Noël");
		et.setNum(5);
		System.out.println(et);
		System.out.println(et.toString());
	}

}
