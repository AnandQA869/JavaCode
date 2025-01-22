package operators1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set s1=new HashSet();
		s1.add(66);
		s1.add(12);
		s1.add(23);
		s1.add(23);
		s1.add(23);
		s1.add(null);
		s1.add(23);
		s1.add(null);
		s1.add("anand");
		
		System.out.println(s1);
	Iterator l1	=s1.iterator();
	while(l1.hasNext()) {
		System.out.println(l1.next());
	}
	
		
	}

}
