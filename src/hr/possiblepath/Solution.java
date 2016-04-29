package hr.possiblepath;

import java.util.Scanner;

public class Solution {

	static String getAnswer(long a, long b, long x, long y) {
		long resto;
		while (x!=0) {
			resto = a % x;
			a = x;
			x = resto;
		}
		return "";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		for (int i = 0; i < n; i++) {
			long a = sc.nextInt(), b = sc.nextInt(), x = sc.nextInt(), y = sc.nextInt();
			System.out.println(getAnswer(a,b,x,y));
		}
	}

}
