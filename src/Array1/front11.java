package Array1;

import java.util.Arrays;

public class front11 {
/*
Given 2 int arrays, a and b, of any length, return a new array with the first element of each array.
If either array is length 0, ignore that array.

front11([1, 2, 3], [7, 9, 8]) → [1, 7]
front11([1], [2]) → [1, 2]
front11([1, 7], []) → [1]
 */
    public static void main(String[] args) {
        int [] a = {};
        int [] b = {};
        int [] result = front11(a,b);
        System.out.println(Arrays.toString(result));

    }
    public static int[] front11(int[] a, int[] b) {
        int [] retVal = null;
        if (a.length == 0 && b.length == 0 ){
            return a;
        } else if (a.length == 0 && b.length > 0){
            retVal = new int[]{b[0]};
            return retVal;
        } else if (b.length == 0 && a.length > 0){
            retVal = new int []{a[0]};
            return retVal;
        }else if (b.length > 0 && a.length > 0){
            retVal = new int [] {a[0],b[0]};
        }

        return retVal;
    }
}
