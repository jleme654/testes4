package hr.findpoint;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int px = sc.nextInt(), py = sc.nextInt(),
			qx = sc.nextInt(), qy = sc.nextInt(),
			pe = 2*qx - px, pe2 = 2*qy - py;
			System.out.println(pe + "\t" +pe2);
		}		
	}

}
