package tp7;

import java.net.InetAddress;

/**
 * L'interface Routable garantit aux classes qui l'implémentent que l'on 
 * pourra trouver le saut suivant pour atteindre un réseau de destination
 * @author mnv
 */
public interface Routable {
	/**
	 * @param reseau le réseau de destination que l'on veut atteindre
	 * @return l'adresse ip du saut suivant pour atteindre ce réseau
	 */
	public InetAddress trouveNextHop(InetAddress reseau);
}

