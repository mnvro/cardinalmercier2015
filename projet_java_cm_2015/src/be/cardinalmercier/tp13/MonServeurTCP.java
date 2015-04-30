package be.cardinalmercier.tp13;

import java.io.IOException;
import java.net.ServerSocket;

public class MonServeurTCP extends ServerSocket {
	private int numPort ;
	public MonServeurTCP() throws IOException {
		super(Param.numPort);
		numPort = Param.numPort;
	}
	public static void main(String[] args) {
		MonServeurTCP ms = null;
		for (int i = Param.numPort ; i < 65535 ; i++){
			try {
				ms = new MonServeurTCP();
				System.out.println("le serveur écoute sur le port : "+Param.numPort);
				break;
			} catch (IOException e) {
				e.printStackTrace();
				Param.numPort ++;
			}
			System.out.println("Aucun port disponible");
		}
	}
}

