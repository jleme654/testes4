package hr.cavity;

import java.util.Scanner;

public class Solution7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), i = 0, j = 0, k=0,x=0,l=0, maior=0;
		String[] arr = new String[n];
		for (i = 0; i < n; i++) {
			arr[i] = sc.next();
			maior = Integer.valueOf(String.valueOf(arr[i].charAt(0)));
		}
		for (j = 0; j < n; j++) {
			String s = String.valueOf(arr[j]);
			for (k = 0; k < s.length(); k++) {
				char c = s.charAt(k);
				x = Integer.valueOf(String.valueOf(c));
				if (x>maior) {
					maior = x;
				}
			}
		}
		System.out.println("---------------------");
		System.out.println("maior: "+maior);
		for (k = 0; k < arr.length; k++) {
			String s = String.valueOf(arr[k]);
			for (l = 0; l < s.length(); l++) {
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
