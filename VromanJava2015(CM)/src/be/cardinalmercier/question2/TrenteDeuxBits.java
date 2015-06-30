package be.cardinalmercier.question2;

public class TrenteDeuxBits {
	private int valeur ;
	public TrenteDeuxBits(){
	}
	public TrenteDeuxBits(String ABCD){
		String octS[] = ABCD.split("\\.");
		int oct[] = new int[4];
		for (int i = 0; i < octS.length; i++) {
			oct[i]=Integer.parseInt(octS[i]);
		}
		valeur = ((oct[0]*256+oct[1])*256+oct[2])*256+oct[3];
	}	
	public int getOct1(){
		return valeur>>>24 ; 
	}
	public int getOct2(){
		return valeur>>16 & 0xFF ; // ou bien ‘& 255’
	}
	public int getOct3(){
		return valeur>>8 & 0xFF ;
	}
	public int getOct4(){
		return valeur & 0xFF ;
	}
	public String toString(){
		return getOct1()+"."+getOct2()+"."+getOct3()+"."+getOct4();
	}
	public int getValeur() {
		return valeur;
	}
	public void setValeur(int valeur) {
		this.valeur = valeur;
	}
}

