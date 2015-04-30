package be.cardinalmercier.tp13;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class MonClient extends Socket {
	public MonClient() throws UnknownHostException, IOException{
		super("192.168.1.12",62900);
	}
	public static void main(String[] args) {
		try {
			MonClient mc = new MonClient();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
