package be.cardinalmercier.tp13;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MonServeurTCP extends ServerSocket implements Runnable {
	private int numPort ;
	private Socket client;
	public MonServeurTCP() throws IOException {
		super(Param.numPort);
		numPort = Param.numPort;
		Thread t = new Thread(this);
		t.start();
		
		
	}
	public static void main(String[] args) {
		MonServeurTCP ms = null;
		int i;
		for (i = Param.numPort ; i < 65536 ; i++){
			try {
				ms = new MonServeurTCP();
				System.out.println("le serveur écoute sur le port : "+ms.numPort);
				break;
			} catch (IOException e) {
				e.printStackTrace();
				Param.numPort ++;
			}
		}
		if (i == 65536){
			System.out.println("Aucun port disponible");
		}
	}
	@Override
	public void run() {
		try {
			System.out.println("**** On attend un client....");
			client = this.accept();
			System.out.println("**** un nouveau client s'est connecté....");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

