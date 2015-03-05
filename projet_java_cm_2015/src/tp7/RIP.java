package tp7;

import java.net.InetAddress;
import java.util.ArrayList;

public class RIP implements Routable {
	private static ArrayList<Route> tableDeRoutage = new ArrayList<Route>();
	public void recevoirUneNouvelleRoute(Route r){
		tableDeRoutage.add(r);
	}
	public InetAddress trouveNextHop(InetAddress reseau) {
		for (Route route : tableDeRoutage) {
			if (reseau == route.getReseauDestination()){
				return route.getNextHop();
			}	
		}
		return null;
	}
}

