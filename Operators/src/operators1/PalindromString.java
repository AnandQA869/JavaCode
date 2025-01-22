package operators1;

public class PalindromString {
public static void main(String[] args) {
	String s="OYO";
	String rev="";
	for(int i=s.length()-1;i>=0;i--)
	{
		rev=rev+s.charAt(i);
	}
	if(s.equals(rev)) {
	System.out.println("Palindrom string");	
	}
	else {
		System.out.println("Not Palindrom String");
	
	}
}
}
