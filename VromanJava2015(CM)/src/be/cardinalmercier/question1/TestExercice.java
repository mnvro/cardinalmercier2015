package be.cardinalmercier.question1;
/**
 * @author mnv
 *
 */
public class TestExercice {
	public static void main(String[] args) {
		Exercice tabExercices[] = new Exercice[3];
		String tabPropositions[] = {
				"x�+36","x�+12x+36","x�+6x+36"
		};
		tabExercices[0] = new QCM(2,"(x+6)� est �gal � ",tabPropositions.length,tabPropositions,1);
		String enonce = "Compl�te cette phrase avec le verbe entre paranth�ses conjugu� au simple present.\n Jane ";
		tabExercices[1] = new ExerciceATrou(1, enonce, "buys", " (buy) beautiful clothes");
		tabExercices[2] = new QCM(1,"Java est un langage orient� objet",0,QCM.TYPE_VRAI_FAUX);
		for (int i = 0 ; i < tabExercices.length ; i++){
			System.out.println(tabExercices[i].toString());
			System.out.println("\n--------------------\n");
		}
	}
}
