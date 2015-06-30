package be.cardinalmercier.question3;

import java.io.IOException;
import java.net.ServerSocket;

public class Serveur extends ServerSocket{
	public Serveur() throws IOException {
		super(2015);
	}
}
