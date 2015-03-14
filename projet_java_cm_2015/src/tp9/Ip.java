package tp9;

public class Ip extends TrenteDeuxBits {
	public Ip(String ip){
		super(ip);
	}
	public char getClasse(){
		if ((getOct1() >= 0 ) && (getOct1() <= 127)) 
			return 'A';
		if ((getOct1() >= 128 ) && (getOct1() <= 191)) 
			return 'B';
		if ((getOct1() >= 192 ) && (getOct1() <= 223)) 
			return 'C';
		if ((getOct1() >= 224 ) && (getOct1() <= 239)) 
			return 'D';
		return 'Z';
	}
	public int getDefaultSlash(){
		if (getClasse()=='A') return 8;
		if (getClasse()=='B') return 16;
		if (getClasse()=='C') return 24;
		return 0;
	}
	public boolean isPrive(){
		if (getOct1() == 10) return true;
		if ((getOct1() == 172) && (getOct2() >= 16) &&
			(getOct2() <= 31)) return true;
		if ((getOct1() == 192) && (getOct2() == 168))
				return true;
		return false;
	}
	public String toString(){
		return super.toString();
	}
	public String toString1(){
		return getOct1()+"";
	}
	public String toString2(){
		return getOct2()+"";
	}
	public String toString3(){
		return getOct3()+"";
	}
	public String toString4(){
		return getOct4()+"";
	}
	
	public static void main(String[] args) {
		Ip ip1 = new Ip("192.168.0.1");
		System.out.println(ip1+" est de classe "+
				ip1.getClasse()
		);
		System.out.println(ip1 + " est privée ?"+
				ip1.isPrive()
		);
		System.out.println(ip1 + " a comme masque par défaut /"+
				ip1.getDefaultSlash()
		);
		ip1 = new Ip("19.168.0.1");
		System.out.println(ip1+" est de classe "+
				ip1.getClasse()
		);
		System.out.println(ip1 + " est privée ?"+
				ip1.isPrive()
		);
		System.out.println(ip1 + " a comme masque par défaut /"+
				ip1.getDefaultSlash()
		);
	}

}
