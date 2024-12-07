import java.util.Scanner;
import java.util.Arrays;

public class Solution{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String nums = sc.nextLine();
		int k = sc.nextInt();
		int[] numbers = Arrays.stream(nums.split(" ")).mapToInt(Integer::parseInt).toArray();

		System.out.println(linearFinder(numbers, k, 0));
	}

	private static int linearFinder(int[] numbers, int k, int i){
		if (numbers == null) return -1;
		if (i >= numbers.length) return -1;
		if (numbers[i] == k) return i;
		i++;
		return linearFinder(numbers, k, i + 1);
	}
}
