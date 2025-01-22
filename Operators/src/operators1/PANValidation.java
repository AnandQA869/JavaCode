package operators1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PANValidation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter valid PAN Number");
String pan =sc.nextLine();
int length=pan.length();

if(length==10) {
	Pattern pattern=Pattern.compile("[A-Z]{5}[0-9]{4}[A-Z]");
Matcher 	matcher =pattern.matcher(pan);
if(matcher.matches()) {
	System.out.println("valid PAN Number");
}
	
}
else {
	 System.out.println("Invalid PAN no");
}

	}
	 
	{
		
	}

}
