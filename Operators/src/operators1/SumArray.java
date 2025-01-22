package operators1;

public class SumArray {

	public static void main(String[] args) {
int a[]= {10,2,3,4,4};
int sum=a[0];
for(int i=0;i<a.length;i++) {
	sum=sum+a[i];
	System.out.println(sum);
}
System.out.println("sum:"+sum);

	}

}
