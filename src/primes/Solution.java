package primes;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt(), count=0;
		for (int i = 1; i <= input; i++) {
			if (input%i==0) {
				count++;
				boolean primo = false;
				primo = count > 2 ? false: true;
				if (!primo) {
					System.out.println(input + " não é primo");
					return;
				}
			}
		}
		System.out.println(input + " é primo");
	}

}
