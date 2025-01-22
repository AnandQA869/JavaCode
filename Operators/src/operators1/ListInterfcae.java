package operators1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListInterfcae {

	public static void main(String[] args) {
          List l1 = new  ArrayList();
          
          l1.add(78.00);
         //l1.add("ttue");
         //l1.add("true");
         l1.add(876);
         //l1.add("manais");
         //l1.add("sorry for this ");
         l1.add(78.00);
         //l1.add("ttue");
         //l1.add("true");
         l1.add(876);
         //l1.add("manais");
         //l1.add("sorry for this ");
         //l1.add(null);
         //l1.add(null);
         Iterator m2=l1.iterator();
         while(m2.hasNext()) {
    		 System.out.print(m2.next());

         }
         
	}



}
