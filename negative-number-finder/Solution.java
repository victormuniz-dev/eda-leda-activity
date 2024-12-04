import java.util.Scanner;
import java.util.Arrays;
import java.lang.String;

public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String[] arr = sc.nextLine();
        int[] nums = Arrays.stream(arr.split(" ")).mapToInt(Integer::parseInt).toArray();
        int i = 0;

        System.out.println(finder(nums, i));
    }

    public static String finder(int[] nums, int i){
        if (i >= nums.length) return "-";
        if (nums[i] < 0) return String.valueof(nums[i]);
        return finder(nums, i + 1);

    }
}
