package operators1;

public class SecondLargetsNumber {

	public static void main(String[] args) 
	{
		int temp;
int a[]= {2,50,5,10,5};


for(int i=0;i<a.length;i++) {
	for(int j=i+1;j<a.length;j++) {
		if(a[i]<a[j])
		{
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
	}
}
System.out.println("Second Largest Value" +a[1]);

	}

}
