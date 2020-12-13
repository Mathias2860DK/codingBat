package Array1;

import java.util.Arrays;

public class makeMiddle {
/*
* Given an array of ints of even length,
* return a new array length 2 containing the middle two elements from the original array.
* The original array will be length 2 or more.

* makeMiddle([1, 2, 3, 4]) → [2, 3]
* makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
* makeMiddle([1, 2]) → [1, 2]
 */
    public static void main(String[] args) {
        int [] nums = {7, 1, 2, 3, 4, 9 }; // int array vi bruge som eksempel
        int [] result = makeMiddle(nums); // gemmer resultatet i et intarray
        System.out.println(Arrays.toString(result)); // bruger Arrays.toString() til at få det formateret.
        System.out.println(nums.length); // nums length tæller som mennesker (starter ikke på 0)


    }
    public static int[] makeMiddle(int[] nums) {
        // laver et nyt intarray som fanger de 2 mellemste værdier fra nums arrayet.
        int [] middle = {nums[(nums.length/2)-1],nums[(nums.length/2)]}; //instantierer int arrayet.
        return middle;
    }
    }

