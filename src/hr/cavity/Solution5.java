package hr.cavity;

import java.util.Scanner;

public class Solution5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), i = 0, j = 0, k=0,x=0, maior=0;
		int[] arr = new int[n];
		for (i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		for (j = 0; j < arr.length; j++) {
			String s = String.valueOf(arr[j]);
			char c = s.charAt(0);
			maior = Integer.valueOf(String.valueOf(c));
			for (k = 0; k < s.length(); k++) {
				char c2 = s.charAt(k);
				x = Integer.valueOf(String.valueOf(c2));
				System.out.print(x+" ");
				if (x>maior) {
					maior = x;
				}
			}
			System.out.println();
		}
		System.out.println("maior: "+maior);
		System.out.println("----------------------------");
		
		x=0;
		for (j = 0; j < arr.length; j++) {
			String s = String.valueOf(arr[j]);
			for (int l = 0; l < s.length(); l++) {
				char c = s.charAt(l);
				x = Integer.valueOf(String.valueOf(c));
				if (x==maior) {
					s = s.replace(c, 'X');
				}
			}
			System.out.println(s);
		}
	}

}
