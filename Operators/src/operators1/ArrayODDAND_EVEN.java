package operators1;

public class ArrayODDAND_EVEN {
public static void main(String[] args) {
	int a[]= {2,3,4,5,6,8};	System.out.println("Given number is even number");
	for(int i=0;i<a.length;i++) {
		if(a[i]%2==0) {
			System.out.println(a[i]);
		}
		System.out.println("Given number is odd");
		for(int i1=0;i<a.length;i++) {
			if(a[i]%2!=0) {
				System.out.println(a[i]);
	
			}
		}
	}
}
}
