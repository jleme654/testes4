package hr.cavity;

import java.util.Scanner;

public class Solution9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), i = 0, j = 0;
		String[] arr = new String[n];
		for (i = 0; i < n; i++) {
			String str = sc.next();
			if (str.length() == n) {
				arr[i] = str;
				str = str.replace('9', 'X');
				System.out.println(str);
			}
		}
	}

}
