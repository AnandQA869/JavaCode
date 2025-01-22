package operators1;

import java.util.Scanner;

public class Palindrom_Number {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n,rev=0,z=0;
int n1=sc.nextInt();
int original=n1;
int rev1=0;
while(n1>0) {
	rev1=(rev1*10)+n1%10;
	n1=n1/10;
}
if(rev1==original) {
	System.out.println(" number is palindrom");
}else {
	System.out.println(" number not  is palindrom");

}
}
}
