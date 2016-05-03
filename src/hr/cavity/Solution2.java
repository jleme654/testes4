package hr.cavity;

import java.util.Scanner;

public class Solution2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), i=0, j=0;
		String[] arr = new String[n];
		for (i = 0; i < n; i++) {
			String str = sc.next();
			if (str.length()==n) {
				arr[i] = str;
				for (j = 9; j >= 1; j--) {
					String s = String.valueOf(j);
					if (str.contains(s)){				
						str = str.replace(s.charAt(0), 'X');
						System.out.println(str);
					}else{
						System.out.println(str);
					}break;
				}
			}
		}
	}

}
