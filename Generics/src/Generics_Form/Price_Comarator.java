package Generics_Form;

import java.util.Comparator;

public class Price_Comarator implements Comparator<car> {
	public int compare(car o1,car o2)
	{
		return o2.price-o1.price;
	}
}
