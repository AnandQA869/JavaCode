package operators1;
class GrandFather{
	GrandFather(){
		System.out.println(1);

	}
}
class ParentClass {
	ParentClass(){
		System.out.println(2);

	}
}
public class ContructorNot_Inheritance extends GrandFather {
	ContructorNot_Inheritance(){
		System.out.println(3);
	}
	public static void main(String[] args) {
System.out.println("Contrutcor");
//new ContructorNot_Inheritance();
//new ParentClass();
//new GrandFather();

	}

}
