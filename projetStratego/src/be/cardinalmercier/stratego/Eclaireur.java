package be.cardinalmercier.stratego;

public class Eclaireur extends Pion {
	
	public Eclaireur(){
		this.pieceQuiSeDeplaceNormalement = false;
	}

	@Override
	public int attaque(Pion unAutrePion) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

	/* (non-Javadoc)
	 * @see be.cardinalmercier.stratego.Pion#deplacementValide(be.cardinalmercier.stratego.Coordonnee, be.cardinalmercier.stratego.Coordonnee)
	 */
	@Override
	public boolean deplacementValide(Coordonnee source, Coordonnee destination) {
		// TODO Auto-generated method stub
		return false;
	}

}
