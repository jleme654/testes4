package hr.candles;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int height[] = new int[n];
		for (int height_i = 0; height_i < n; height_i++) {
			height[height_i] = in.nextInt();
		}
		int count = 0, maior = 0;
		for (int i = 0; i < height.length; i++) {
			if (height[i] > maior) {
				maior = height[i];
				count = 1;
			}else if (height[i] == maior){
				count++;
			}
		}
		System.out.println(count);
	}
}