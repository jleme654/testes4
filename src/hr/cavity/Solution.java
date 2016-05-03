package hr.cavity;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		char[][] charArray = new char[n][n];

		for (int i = 0; i < n; i++) {
			String lines = in.next();
			charArray[i] = lines.toCharArray();
		}

		for (int i = 1; i < n - 1; i++) {
			for (int j = 1; j < n - 1; j++) {
				if ((charArray[i][j] > charArray[i - 1][j]) && (charArray[i][j] > charArray[i + 1][j])
						&& (charArray[i][j] > charArray[i][j - 1]) && (charArray[i][j] > charArray[i][j + 1])) 
					charArray[i][j] = 'X';
			}
		}
		for (int i = 0; i < charArray.length; i++) {
			System.out.println(charArray[i]);
		}

	}

}
