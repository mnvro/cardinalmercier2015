package tp13_les_threads_et_les_sockets;



public class Compteur2 extends Thread {
	protected String nom;
	protected int max;

	public Compteur2(String nom, int max) {
		this.nom = nom;
		this.max = max;
	}
	public Compteur2(String nom) {
		this(nom, 10);
	}
	public void run() {
		for (int i = 1; i <= max; i++) {
			System.out.println(nom + " : " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("*** " + nom + " a fini de compter jusqu'à " + max);
	}
	public static void main(String[] args) {
		Compteur2[] compteurs = {
				new Compteur2("Toto"),
				new Compteur2("Bibi"),
				new Compteur2("Robert"),
				new Compteur2("Pierre")
		};
		for (int i = 0; i < compteurs.length; i++) {
			compteurs[i].start();
		}
	}
} 
