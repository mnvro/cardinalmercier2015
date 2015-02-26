package interro1;
public class Date {
	private int jj;
	private int mm;
	private int aaaa;
	public Date(int jj, int mm, int aaaa) {
		super();
		this.jj = jj;
		this.mm = mm;
		this.aaaa = aaaa;
	}
	public String toString() {
		return jj + "/" + mm + "/" + aaaa ;
	}
}
