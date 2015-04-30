package tp13_les_threads_et_les_sockets;

public class Compteur1 {
	protected String nom;
	protected int max;

	public Compteur1(String nom, int max) {
		this.nom = nom;
		this.max = max;
	}
	public Compteur1(String nom) {
		this(nom, 10);
	}
	public void run() {
		for (int i = 1; i <= max; i++) {
			System.out.println(nom + " : " + i);
		}
		System.out.println("*** " + nom + " a fini de compter jusqu'à " + max);
	}
	public static void main(String[] args) {
		Compteur1[] compteurs = {
				new Compteur1("Toto"),
				new Compteur1("Bibi"),
				new Compteur1("Robert"),
				new Compteur1("Pierre")
		};
		for (int i = 0; i < compteurs.length; i++) {
			compteurs[i].run();
		}
	}
} 