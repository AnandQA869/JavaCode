package operators1;

import java.util.LinkedList;

public class ArryaList {

	public static void main(String[] args) {
		LinkedList<Integer> l1=new LinkedList();
		 l1.add(12);
		 l1.add(21);
		 l1.add(321);
		 l1.add(22);
		 System.out.println(l1.getFirst());//getting first object
		 System.out.println(l1.getLast());//getting last object
		System.out.println(l1.peekFirst());//same as getfirst
	System.out.println(l1.peekLast());//same as getlast
	l1.addFirst(11);//add these elements on top of your array
System.out.println(l1);
	l1.addLast(222);//add this object on last of your array
	System.out.println(l1);
	System.out.println(l1.offerFirst(111));//same as addfirst
 System.out.println(l1.offerLast(1111));//same as addlast
 System.out.println("Poll First "+l1.pollFirst());//same as remove first
 System.out.println("Poll Last "+l1.pollLast());//same as removeLast()
	System.out.println(l1.removeFirst());
	 System.out.println(l1);
 
	

	}

}
