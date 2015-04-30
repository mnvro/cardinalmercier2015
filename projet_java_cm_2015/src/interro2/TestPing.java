package interro2;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
public class TestPing {
	public static void main(String[] args) {
		try {
			InetAddress ia = InetAddress.getByName("192.168.1.52");
			System.out.println(ia.isReachable(3000));
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
