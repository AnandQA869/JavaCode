package operators1;

public class Maxmin_MinimumNumber {

	public static void main(String[] args) {
int a[]= {10,2,-2,4,50};
int min=a[0];

for(int i=1;i<a.length;i++) {
	if(a[i]<min) {
		min=a[i];
	}
}
System.out.println("minimum element :"+min);
	}
}


