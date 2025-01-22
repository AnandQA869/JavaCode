package operators1;

import java.util.Enumeration;
import java.util.Vector;

public class EnumentorCursor {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(10);
		
		v.add(15.2);
		v.add("anand");
		Enumeration e= v.elements();
		while(e.hasMoreElements())
		{
		System.out.println(e.nextElement());
		}
		}
		

	}


