package hr.codesprintapril2016.triplets;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution2 {

	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
		//int n = in.nextInt(),d=in.nextInt(),
				int n=7,d=3, count=0, i=0, j=0, k=0;
				System.out.println(n+ " "+d);
//		int[] arrN = new int[n];
				int[] a = new int[]{1, 2, 4, 5, 7, 8 ,10};
				
		for (i = 0; i < n; i++) {
			//arrN[i] = in.nextInt();
			System.out.print(a[i]+ " ");
		}
		System.out.println("\n-------------------------");
		i=0;
		for (j = n-1; j >= (n-d) ; j--) {
//			System.out.println("*****"+ (n-d));
			i = j-(d-1);
			k = i-(d-1);
			if (a[j]-a[i]==d ) {
				count++;
			}
			
			
//			count++;
		}
		System.out.println(count);
		
		
	}

}
