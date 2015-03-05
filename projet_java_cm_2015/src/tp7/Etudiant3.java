package tp7;



import java.util.ArrayList;

public class Etudiant3 {
	private ArrayList<Double> listePoint = new ArrayList<Double>();
	public double moyenne(){
		double calcul = 0;
		for (Double result : listePoint) {
			calcul += result;
		}
		return calcul/listePoint.size();
	}
	public String toString() {
		String s ="Voici les poins de l'étudiant";
		for (Double result : listePoint) {
			s+=" "+result;
		}
		s+="\net sa moyenne "+moyenne();
		return s;
	}
	public void ajouteCote(double cote){
		listePoint.add(cote);
	}
	public static void main(String[] args) {
		Etudiant3 et = new Etudiant3();
		et.ajouteCote(0);
		et.ajouteCote(15);
		et.ajouteCote(15);
		et.ajouteCote(25);
		System.out.println(et);
	}
}
