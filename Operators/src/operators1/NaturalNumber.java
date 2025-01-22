package operators1;

import java.util.Scanner;

public class NaturalNumber {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Total Number ");
        int a=sc.nextInt();
        System.out.print("Natural numbers up to " + a + ":");
        for (int i = 1; i <= a; i++) {
        	System.out.print(i + " ");
        }
	}

}
