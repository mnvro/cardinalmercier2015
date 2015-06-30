package be.cardinalmercier.question3;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client extends Socket {
	private ObjectInputStream ois;
	private void methodeCommuneConstructeur(){
		try {
			ois = new ObjectInputStream(this.getInputStream());
			System.out.println("Le client a reçu du serveur : "+
					ois.readObject()
			);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public Client(){
		methodeCommuneConstructeur();
	}
	public Client(String arg0,int arg1) throws UnknownHostException, IOException{
		super(arg0,arg1);
		methodeCommuneConstructeur();
		
	}
	public static void main(String[] args) {
		try {
			Client c = new Client("127.0.0.1",2015);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
