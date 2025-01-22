package operators1;

public class Frequenyarray {

	public static void main(String[] args) {
int a[]= {10,10,2,3,4,5,4,5,5,6,10};
int n=a.length;
	countfre(a,n);
	

	}

	private static void countfre(int[] a, int n) {
boolean b[]=new boolean[n];
for(int i=0;i<n;i++) {
	if(b[i]==true)
	continue;
	
	int count=1;
	for(int j=i+1;j<n;j++) {
		if(a[i]==a[j]) {
			b[j]=true;
			count++;
			
		}
	}
	System.out.println(a[i]+" "+count);
	
}

	}

}
