package operators1;

import java.util.Scanner;

public class Palindrom2way {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Given number is palindrom");
      String a=  sc.next();
        String rev="";
        for(int i=0;i<a.length();i++) {
        	rev=a.charAt(i)+rev;
        }
        	if(a.equalsIgnoreCase(rev)) {
            	System.out.println("Palindrom string ");
        	}else {
        
        	
                System.out.println(" number is not a palindrome");
        	}
        	
        

        

        } 
	}


