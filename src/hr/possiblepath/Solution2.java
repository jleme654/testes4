package hr.possiblepath;

import java.util.Scanner;

public class Solution2 {

	static int gcd(int x, int y) {
		int r = 0, a, b;
		a = (x > y) ? x : y; // a is greater number
		b = (x < y) ? x : y; // b is smaller number

		r = b;
		while (a % b != 0) {
			r = a % b;
			a = b;
			b = r;
		}
		return r;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt(), b = sc.nextInt(), x = sc.nextInt(), y = sc.nextInt();
			if (gcd(a, b) == gcd(x, y))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}

}
