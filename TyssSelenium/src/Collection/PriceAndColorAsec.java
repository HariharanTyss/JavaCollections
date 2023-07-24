package Collection;

import java.util.Comparator;

public class PriceAndColorAsec implements Comparator<Pens>
{
	@Override
	public int compare(Pens o1, Pens o2) {
		int res=o1.price=o2.price;
		if(res==0) {
			res=o1.color.compareTo(o2.color);
		}
			
		return res;
	}

}
