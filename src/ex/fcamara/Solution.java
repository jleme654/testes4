package ex.fcamara;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[] { 0, 0, 0 };
		String test = sc.nextLine();
		test = test.toUpperCase();
		int count0 = 0, count1 = 0, count2 = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int i2 = 0; i2 < test.length(); i2++) {
				char c = test.charAt(i2);
				if (c == 'L') {
					arr[0] = count0++;
					i2++;
				}
				if (c == 'R') {
					count1 = count0;
					arr[1] = count1++;
					i2++;
				}
				if (c == 'D') {
					arr[2] = count2--;
					i2++;
				}
			}
		}
		if (test.contains("U")) {
			System.out.print((arr[0] - 1) + "\t" + (arr[1] - 1) + "\t" + (arr[2] + 1) + "\t" + "NORTE");
		} else {
			System.out.print((arr[0] - (arr[1] - 1)) + "\t" + (arr[1] - 1) + "\t" + (arr[2]) + "\t" + "SUL");
		}
	}

}
