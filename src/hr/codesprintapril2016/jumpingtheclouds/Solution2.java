package hr.codesprintapril2016.jumpingtheclouds;

import java.util.Scanner;

public class Solution2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), count=0;
		int c[] = new int[n];
		for (int c_i = 0; c_i < n; c_i++) {
			c[c_i] = in.nextInt();
    	}
		int last = c[n-1], plast=c[n-2], pplast=c[n-3];
		for (int i = 0; i < c.length-1; i++) {
			System.out.println(c[i] +" "+c[i+1]);
			if (c[i]==0 && c[i+1]==0){ count++;	}
			if(c[i]==1 && c[i+1]==0){ count++; }
			System.out.println("count: "+count);
		}
		if (last==0&&plast==0&&pplast==1) {
			System.out.println(count-1);return;
		}
		System.out.println(count);
	}

}
