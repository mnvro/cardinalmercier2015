package tp13_les_threads_et_les_sockets;

public class Compteur3 implements Runnable{
	protected String nom;
	protected int max;
	public Compteur3(String nom, int max) {
		this.nom = nom;
		this.max = max;
	}
	public Compteur3(String nom) {
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
		Compteur3[] compteurs = {
				new Compteur3("Toto"),
				new Compteur3("Bibi"),
				new Compteur3("Robert"),
				new Compteur3("Pierre")
		};
 		for (int i = 0; i < compteurs.length; i++) {
			(new Thread(compteurs[i])).start();
		}
	}
} 
