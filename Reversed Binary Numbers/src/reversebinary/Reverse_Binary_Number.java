package reversebinary;

import java.util.Scanner;

public class Reverse_Binary_Number {

	public static void main(String[] args) {
		System.currentTimeMillis();

		Scanner scan = new Scanner(System.in);
		String str_rep = scan.toString();
		if (!scan.hasNextInt()) {
			System.exit(0);
		}
		int entered_number = scan.nextInt();
		int desired_number = 0;

		// We need to create Strings for taking the number bits and then
		// reversing those bits
		String bits, rev_bits;
		// The input should be an Integer N, i.e. 1<=N OR N<=1000000000.
		if (entered_number < 1 || entered_number > 1000000000) {
			System.exit(0);
		}
		bits = Integer.toBinaryString(entered_number);

		rev_bits = new StringBuffer(bits).reverse().toString();
		desired_number = Integer.parseInt(rev_bits, 2);
		System.out.println(desired_number);
	}

}
