import java.util.Scanner;
import java.util.Arrays;

public class Solution {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String nums = sc.nextLine();
		int [] numbers = Arrays.stream(nums.split(" ")).mapToInt(Integer::parseInt).toArray();

		System.out.println(finder(numbers, 0));
	}

	public static String finder(int[] numbers, int i){
		if (i >= numbers.length) return "-";
		if (numbers[i] < 0) return String.valueOf(numbers[i]);
		return finder(numbers, i + 1);
	}
}
