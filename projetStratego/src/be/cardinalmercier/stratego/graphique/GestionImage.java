package be.cardinalmercier.stratego.graphique;

import be.cardinalmercier.stratego.Stratego;

public class GestionImage {
	public static String cheminVersDossierImage = "images\\";
	public static String getImagePlateauDeJeu(int ligne, int colonne){
		StringBuffer sb = new StringBuffer(cheminVersDossierImage);
		sb.append("StrategoBackground\\");
		sb.append("StrategoBackground_");
		sb.append((ligne*Stratego.NBLIGNES+colonne+1)+"");
		sb.append(".gif");
		String s = new String(sb);
		
		return s;
	}
	public static String getImageBoiteDeRangement(int type, int ligne, int colonne,char couleur){
		StringBuffer sb = new StringBuffer(cheminVersDossierImage);
		if (couleur == 'R'){
			sb.append("PionsRouges\\");
		} else{
			sb.append("PionsBleus\\");
		}
		sb.append(type+"");
		sb.append(".gif");
		String s = new String(sb);
		//System.out.println("Chemin vers l'image = "+s);
		return s;
	}

}
