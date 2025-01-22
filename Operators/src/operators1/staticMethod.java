package operators1;
public class staticMethod
{
static void add()
{
int a=100; 
int b=200;
int sum =a+b;
System.out.println(sum);
}
void add1()
{
float a=123.45f;
float b=234.45f;
float sub =a-b;
System.out.println(sub);
}
void fun2(int a,int b) {
	int sum=a+b;
	System.out.println(sum);
}
void fun3(float c,float s) {
float sub=c-s;
System.out.println(sub);
}
public static void main(String[] args)
{	
add();
staticMethod n1=new staticMethod();
n1.add1();
n1.fun2(10, 20);

}
}
