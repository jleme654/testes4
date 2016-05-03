package hr.cavity;

import java.util.Scanner;

public class Solution6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), i = 0, j = 0, k=0,x=0, maior=0;
		String[] arr = new String[n];
		for (i = 0; i < n; i++) {
			arr[i] = sc.next();
			maior = Integer.valueOf(String.valueOf(arr[i].charAt(0)));
		}
		System.out.println("aqui nene: "+maior);
		
		for (j = 0; j < n; j++) {
			String s = String.valueOf(arr[j]);
			for (k = 0; k < s.length(); k++) {
				char c = s.charAt(k);
				x = Integer.valueOf(String.valueOf(c));
				System.out.println("x: "+x+"|maior: "+maior);
				if (x>maior) {
					maior = x;
					System.out.println(maior);
				}
			}
		}
		System.out.println("---------------------");
		System.out.println("maior: "+maior);
//		x=0;
		for (j = 0; j < arr.length; j++) {
//			String s = String.valueOf(arr[j]);
			System.out.println(arr[j]);
//			for (int l = 0; l < s.length(); l++) {
//				char c = s.charAt(l);
//				x = Integer.valueOf(String.valueOf(c));
//				if (x==maior) {
//					s = s.replace(c, 'X');
//				}
//			}
//			System.out.println(s);
		}
	}

}
