package operators1;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);

System.out.println("Palindrom String ");
String s=sc.next();
String rev="";
for(int i=0;i<s.length();i++) {
	rev=s.charAt(i)+rev;	
}
if(s.equalsIgnoreCase(rev)) {
	System.out.println("Palindrom Number");
}else {
	System.out.println("Not Palindrom String ");

	
	
	
	
	
}


}

}
