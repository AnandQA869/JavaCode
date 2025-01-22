package operators1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class Interview2 {

	public static void main(String[] args) {
int a[]= {10,2,3,};

System.out.println("Before Accending order:"+Arrays.toString(a));
Arrays.parallelSort(a);
System.out.println("After Accending order:"+Arrays.toString(a))
;
int b[]= {10,2,3,};
Arrays.sort(b);
Arrays.sort(b);

System.out.println("After decending order:"+Arrays.toString(b));

}
}