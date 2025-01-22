package operators1;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// Anagram is Both string same length
		Scanner sc=new Scanner(System.in);
		String s="ramaa";
		String  a="anand";
		
		char b[]=s.toCharArray();
		char c[]= a.toCharArray();
		Arrays.sort(c);
		Arrays.sort(b);
		boolean result=Arrays.equals(c, b);
		if(result) {
			System.out.println("anangram checked");
		}else {
			System.out.println("anangram not  checked");

		}
	}

}
