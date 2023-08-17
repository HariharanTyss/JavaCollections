package Cart;

public class Item {
	private int itemid;
	private String itemname;
	private double itemprice;
	public double getItemprice() {
		return itemprice;
	}
	public void setItemprice(double itemprice) {
		this.itemprice = itemprice;
	}
	public Item(int itemid, String itemname, double itemprice) {
		super();
		this.itemid = itemid;
		this.itemname = itemname;
		this.itemprice = itemprice;
	}
	@Override
	public String toString() {
		return "("+itemid+","+itemname+","+itemprice+")";
	}
	@Override
	public int hashCode() {
		return itemid;
	}
	@Override
	public boolean equals(Object obj) {
		return itemid==((Item)obj).itemid;
	}

}
