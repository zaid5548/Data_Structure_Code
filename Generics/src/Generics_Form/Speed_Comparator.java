package Generics_Form;

import java.util.Comparator;

public class Speed_Comparator implements Comparator<car>{

	public int compare(car o1,car o2)
	{
		return o1.speed-o2.speed;
	}

}
