package operators1;

public class CountString {

	public static void main(String[] args) {
String s="Anand ";
int count=0;
for(int i=0;i<s.length();i++)
{
	if(s.charAt(i)!=' ') {
		count++;
	}
	
}
System.out.println(count);
	}

}
