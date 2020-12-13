package Array1;

import java.util.Arrays;

public class midThree {
/*
* Given an array of ints of odd length, return a new array length 3 containing
* the elements from the middle of the array. The array length will be at least 3.

* midThree([1, 2, 3, 4, 5]) → [2, 3, 4]
* midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]
* midThree([1, 2, 3]) → [1, 2, 3]
*/
    public static void main(String[] args) {
        int [] nums = {1, 2, 3, 4, 5};
int [] result = midThree(nums);
        System.out.println(Arrays.toString(result)); //formaterer int array via Arrays.toString()
    }

    public static int[] midThree(int[] nums) {
        int [] retVal = null;
        //Finder de forskellige værdier og sætter dem ind i nyt int array.
        int midten = nums[nums.length/2];
        int midtenPlusEn = nums [nums.length/2+1];
        int midtenMinusEn = nums [nums.length/2-1];

        retVal = new int[]{midtenMinusEn, midten, midtenPlusEn};

        return retVal;
    }
}
