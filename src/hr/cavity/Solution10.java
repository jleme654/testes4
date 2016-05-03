package hr.cavity;

import java.util.Scanner;

public class Solution10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), i=0, j=0,k=0,m=0,p=0,q=0, maior=0;
		String[] arr = new String[n];
		for (i = 0; i < n; i++) {
			String str = sc.next();
			arr[i] = str;
			maior = Integer.valueOf(String.valueOf(arr[0].charAt(0)));
		}
		for (i = 0; i < arr.length; i++) {
			String s = arr[i];
			for (j = 0; j < s.length(); j++) {
				char c = s.charAt(j);
			    k = Integer.valueOf(String.valueOf(c));
				if (k>maior) { maior = k; }
			}
		}
		for (m = 0; m < arr.length; m++) {
			String s = String.valueOf(arr[m]);
			for (p = 0; p < s.length(); p++) {
				char c = s.charAt(p);
				q = Integer.valueOf(String.valueOf(c));
				if (q==maior) { s = s.replace(c, 'X'); }
			}
			System.out.println(s);
		}
	}

}
