package tp8;

import tp7.Etudiant2;

public class TestTableau {

	public static void main(String[] args) {
		int tab[] = new int[5];
		try{
			System.out.println(tab[-1]);
		}catch (ArrayIndexOutOfBoundsException e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		Etudiant2 tabEtu[] = new Etudiant2[5];
		for (int i=0;i<5;i++){
			tabEtu[i]= new Etudiant2(i);
		}
		try{
		System.out.println(tabEtu[5]);
		}catch (ArrayIndexOutOfBoundsException ee){
			System.out.println("on a un problème");
		}

	}

}
