package operators1;

import java.util.Arrays;
import java.util.Collections;

public class Ascending_DescendingArray
{

public static void main(String[] args)
{
int a[]= {10,2,4,3,1,60,50};
System.out.println("Arrays Element before Ascending order "+Arrays.toString(a));
Arrays.parallelSort(a);
System.out.println("Arrays Element After Ascending order "+Arrays.toString(a));
Integer abc[]= {10,2,4,3,1,60,50};
Arrays.sort(abc,Collections.reverseOrder());
System.out.println("Arrays Element After Descending order "+Arrays.toString(abc));


}
}