package tp11;

import java.util.ArrayList;

/**
 * La classe Etudiant permet de représenter des étudiants
 * @author Marie-Noël Vroman
 *
 */
public class Etudiant {
	private String nom;
	private int num;
	private static int nbEtu=0;
	
	/**
	 * Ce constructeur <i>permet</i> de créer un étudiant
	 * @param nom le nom de famille de l'étudiant
	 */
	public Etudiant(String nom){
		this.nom = nom;
		num = ++nbEtu;
	}
	
	public String toString(){
		return "nom : "+nom+" num : "+num;
	}

	/**
	 * Cette méthode crée une arraylist avec des étudiants
	 * @param args pas utilisé
	 */
	public static void main(String[] args) {
		ArrayList<Etudiant> listeEtu = new ArrayList<Etudiant>();
		listeEtu.add(new Etudiant("Toto"));
		listeEtu.add(new Etudiant("Jérémie"));
		listeEtu.add(new Etudiant("Julien"));
		listeEtu.add(new Etudiant("Laurane"));
		listeEtu.add(new Etudiant("Arthur"));
		System.out.println(listeEtu);
		
	}

}
