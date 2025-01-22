package operators1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Practiceset4 {
public static void main(String[] args)
{
	String a="ram";
	String b="arm";
	
	
	char []c1=a.toCharArray();
	char[]c2=b.toCharArray();
	Arrays.sort(c1);
	Arrays.sort(c2);
	
		if(Arrays.equals(c1, c2)) {
			System.out.println("this is Anagram");
		}
		else {
			System.out.println("this  not is Anagram");

		}
	
	
}
}