package operators1;

public class LargestElement {

	public static void main(String[] args) {
int a[]= {10,200,3,3,3};
int max=a[0];

for(int i=1;i<a.length;i++) {
	if(a[i]>max) {
		max=a[i]; 
			
		}
	}
System.out.println("max number"+max);
}
	}
	



