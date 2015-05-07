package be.cardinalmercier.tp14;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class MonServeur extends ServerSocket implements Runnable {
	private int numPort;
	private ArrayList<Socket> tabClient = new ArrayList<Socket>();
	public MonServeur() throws IOException {
		super(Param.numPort);
		this.numPort = Param.numPort;
	}

	public MonServeur(int numPort) throws IOException {
		super(numPort);
		this.numPort = numPort;
		System.out.println("**** Le serveur écoute sur le port : " + numPort);
		
		(new Thread(this)).start();
		
	}

	public static void main(String[] args) {
		while(Param.numPort <= 65535){
			try {
				MonServeur ms = new MonServeur(Param.numPort);
				break;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				Param.numPort++;
			}
		}
	}

	@Override
	public void run() {
		while(! this.isClosed()){
			try {
				tabClient.add(this.accept());
				System.out.println("**** Le serveur a reçu un client");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
