package interro2;
public class Date implements Comparable<Date> {
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
	@Override
	public int compareTo(Date o) {
		return -( ( this.aaaa - o.aaaa ) * 10000 + ( this.mm - o.mm ) * 100 + ( this.jj - o.jj ) );
	}
}

