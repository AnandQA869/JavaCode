package operators1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Vowel_Consent_Characters_String
{
	public static void main(String[] args) {
		String s="welcome";
		int count=0;
		int Ccount=0;
		int Vcount=0;
		System.out.println("Number of Count string");

		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				count++;
			}

			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='i') {
				Vcount++;
			}
			else if(s.charAt(i)>'a'&&s.charAt(i)<'z') {
				Ccount++;
			}
		}
		System.out.println(count);
		System.out.println(Vcount);
		System.out.println(Ccount);

	}
}