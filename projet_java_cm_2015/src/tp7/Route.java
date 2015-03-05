package tp7;

import java.net.InetAddress;

public class Route {
	private InetAddress reseauDestination;
	public InetAddress getReseauDestination() {
		return reseauDestination;
	}
	public void setReseauDestination(InetAddress reseauDestination) {
		this.reseauDestination = reseauDestination;
	}
	public InetAddress getNextHop() {
		return nextHop;
	}
	public void setNextHop(InetAddress nextHop) {
		this.nextHop = nextHop;
	}
	public double getCout() {
		return cout;
	}
	public void setCout(double cout) {
		this.cout = cout;
	}
	private InetAddress nextHop;
	private double cout;

}
