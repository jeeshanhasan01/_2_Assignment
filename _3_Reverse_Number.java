package Assignment;

import java.util.*;

public class Reverse_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rev = 0;
		while (n > 0) {
			int rem = n % 10;
			n = n / 10;
			rev = rem + rev * 10;
		}
		System.out.println(rev);

	}

}
