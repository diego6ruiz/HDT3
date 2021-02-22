/*
 * Diego Ruiz
 * Javier Alvarez
 * 
*/

import java.util.ArrayList;

public class ConvertIntegers {
	public ConvertIntegers() {
	}
	
	
	public int[] convertIntegers(ArrayList<Integer> integers)
	{
	    int[] ret = new int[integers.size()];
	    for (int i=0; i < ret.length; i++)
	    {
	        ret[i] = integers.get(i).intValue();
	    }
	    return ret;
	}

}
