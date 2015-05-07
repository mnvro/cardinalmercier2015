package be.cardinalmercier.tp14;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class MonClient extends Socket {
	public MonClient() throws UnknownHostException, IOException{
		super("127.0.0.1",Param.numPort);
		System.out.println("*** Le client a pu se connecter");
	}
	
	public MonClient(String ip,int numPort) throws UnknownHostException, IOException{
		super(ip,numPort);
		System.out.println("*** Le client a pu se connecter");
	}

	public static void main(String[] args) {
		try {
			MonClient mc = new MonClient("192.168.1.28",62900);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
