import java.util.Scanner;
import java.util.Arrays;

public class Solution{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = sc.nextInt();

		System.out.println(power(i, j));

	}

	private static int power(int i, int j){
		if (j == 1) return i;
		return i * power(i, j - 1);
	}
}
