package leetcodealgos;

import java.util.Arrays;

/**
 * Two Sums algorithm from Leetcode - see description below:
 * Given an array of integers 'nums' and an integer 'target', return indices of the two numbers such that they
 * add up to 'target'. You may assume that each input would have exactly one solution, and you may not use the
 * same element twice.
 *
 * You can return the answer in any order.
 */
public class twoSum
{
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        outer: for (int i = 0; i <= nums.length; i++) {
            for (int j = i + 1; j <= nums.length - 1; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    break outer;
                }
            }
        }
        return result;
    }
    public static void main( String[] args )
    {
        System.out.println("\nLeetcode: Two Sums algorithm");
        System.out.println("Runs in O(n^2) time\n");

        System.out.println("Array: [2, 7, 11, 15]\nTarget: 9");
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)) + "\n");

        System.out.println("Array: [3, 2, 4]\nTarget: 6");
        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6)) + "\n");
    }
}
