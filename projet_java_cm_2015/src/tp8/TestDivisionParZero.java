package tp8;

public class TestDivisionParZero {

	public static void main(String[] args) {
		try{
			int i = 20;
			int z = 0;
			System.out.println(i/z);
		}catch(ArithmeticException e){
			e.printStackTrace();
		}
		System.out.println("Je passe ici");

	}

}
