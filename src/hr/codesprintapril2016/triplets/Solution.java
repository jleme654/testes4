package hr.codesprintapril2016.triplets;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt(),d=in.nextInt(),i=0,j=0,k=0,count=0;
		int[] a = new int[n];
		for (i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		for (j = n-1; j >= (n-d) ; j--) {
			i = j-(d-1);
			k = i-(d-1);
			if (a[j]-a[i]==d && a[i]-a[k]==d) {
				count++;
			}
		}
		System.out.println(count);		
	}

}
