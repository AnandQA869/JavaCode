package operators1;
import java.util.*;
import java.util.regex.*;
import java.util.Scanner;

public class Validated_PAN {
public static void main(String[] args) {

Scanner sc=new Scanner(System.in);

System.out.println("Enter the PAN no:");
String pan = sc.nextLine();

int length=pan.length();
if(length==10 ) {
	Pattern pattern=Pattern.compile("[A-Z]{5}[0-9]{4}[A-Z]");
	Matcher matcher = pattern.matcher(pan);
	if(matcher.matches())
    {
       System.out.println("Valid PAN no"); 
    }
    else
    {
        System.out.println("Invalid PAN no");
    }
    
}
else
{
    System.out.println("Invalid PAN no.");
}
}


}


