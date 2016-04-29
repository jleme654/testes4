package hr.codesprintapril2016.jumpingtheclouds;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), count=0;
		int c[] = new int[n];
		for (int c_i = 0; c_i < n; c_i++) {
			c[c_i] = in.nextInt();
    	}
		int last = c[n-2];
		for (int i = 0; i < c.length-1; i++) {
			if (c[i]==0 && c[i+1]==0){ count++;	}
			if(c[i]==1){ count++; }
		}
		System.out.println(count);
	}

}
