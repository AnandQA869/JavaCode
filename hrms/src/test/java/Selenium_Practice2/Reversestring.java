package Selenium_Practice2;

public class Reversestring {

	public static void main(String[] args) {

		
		
		
		String a="MADAM";
		String b="";
		for(int i=a.length()-1; i>=0;i--) {
			char c1=a.charAt(i);
			b =b+c1;
			
		}
		System.out.println(b);
		boolean b1=a.equals(b);
		if(b1==true) {
			System.out.println("palindrom ");
		}else {
			System.out.println("Not palindrom ");

		}
	}	


}
