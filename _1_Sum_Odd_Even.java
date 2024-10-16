import java.util.*;

public class _1_Sum_Odd_Even {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // Take input n
		int index = 1; // it's indexing of n
		int evenSum = 0; // store the sum of evenPlaces
		int oddSum = 0; // store the sum of oddPlaces
		// loop trough all n
		while (n > 0) {

			int rem = n % 10; // extract the last digit of n
			n = n / 10; // remove the last digit from n

			// check if the current index digit is even or odd
			if (index % 2 == 0) {
				evenSum = evenSum + rem;
			} else {
				oddSum = oddSum + rem;
			}
			index++;
		}
		System.out.println(evenSum);
		System.out.println(oddSum);
	}
}
