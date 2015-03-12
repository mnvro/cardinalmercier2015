package tp2Etu;

import javax.swing.JOptionPane;

public class TestEtudiant {
	public static void main(String[] args) {
		Etudiant et = new Etudiant() ;
		et.setNom(JOptionPane.showInputDialog("Quel est ton nom?"));
		// prenom
		et.setNbExercicesTotal (0);
		et.setNbExercicesReussis (0);
		for (int i = 0; i<10 ; i++){
			int a = (int)(Math.random()*100);
			int b = (int)(Math.random()*100);
			String reponseString = JOptionPane.showInputDialog(a+" + "+b);
			int reponseInt = Integer.parseInt(reponseString);
			if (reponseInt == a+b){
				et.setNbExercicesReussis (et.getNbExercicesReussis()+1);
				JOptionPane.showMessageDialog(null, "Bravo");
			}else{
				JOptionPane.showMessageDialog(null, 
						"Non, "+a+" + "+b+" = "+ (a+b),"titre",
						0
				);
			}
			
			et.setNbExercicesTotal (et.getNbExercicesTotal()+1);
		}
		JOptionPane.showMessageDialog(null, 
				et.getNom() + ", tu as réussi "+et.getNbExercicesReussis()+
				" / "+et.getNbExercicesTotal()
		);
		
	}
}
