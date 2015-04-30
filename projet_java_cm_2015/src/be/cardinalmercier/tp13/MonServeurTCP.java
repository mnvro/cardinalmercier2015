package be.cardinalmercier.tp13;

import java.io.IOException;
import java.net.ServerSocket;

public class MonServeurTCP extends ServerSocket {
	private int numPort ;

	public MonServeurTCP() throws IOException {
		super(Param.NUMPORT);
		numPort = Param.NUMPORT;
	}
	public static void main(String[] args) {
		MonServeurTCP ms = new MonServeurTCP();
	}
}
