package operators1;

public class skipOutput {

	public static void main(String[] args) {
String s="abcdefghijk";


StringBuilder a=new StringBuilder();

for(int i=0;i<a.length();i+=3) {
	a.append(a.length());
}
System.out.println("Output: " + a.toString());
	}

}
