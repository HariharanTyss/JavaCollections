package Collection;

import java.util.LinkedList;


public class Linkedlist {
	public static void main(String[] args) {
		int start = 1;
		int end = 10;

		System.out.println("Prime numbers in the range from " + start + " to " + end + " are:");
		for (int number = start; number <= end; number++) {
			if (isPrime(number)) {
				System.out.println(number);
			}
		}
	}

	public static boolean isPrime(int num) {
		if (num < 2) {
			return false;
		}
		for (int i = 2; i <= num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}


