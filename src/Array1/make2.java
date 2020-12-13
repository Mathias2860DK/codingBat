package Array1;

import java.util.Arrays;

public class make2 {
    /*
* Given 2 int arrays, a and b, return a new array length 2 containing,
* as much as will fit, the elements from a followed by the elements from b.
* The arrays may be any length, including 0,
*  but there will be 2 or more elements available between the 2 arrays.

* make2([4, 5], [1, 2, 3]) → [4, 5]
* make2([4], [1, 2, 3]) → [4, 1]
* make2([], [1, 2]) → [1, 2]
     */

    public static void main(String[] args) {
        int [] a = {4,5};
        int [] b = {1,2,3};

        int [] result = make2(a,b);
        System.out.println(Arrays.toString(result)); //formaterer int array via Arrays.toString()

    }
    public static int[] make2(int[] a, int[] b) {
int [] retVal = null;


return retVal;
    }
}
