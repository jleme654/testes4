package hr.valleys;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), count = 0, level = 0;
		String str = in.next();
		str = str.toUpperCase();
		if (str.length() == n) {
			for (int i = 0; i < str.length(); i++) {
				char c = str.charAt(i);
				if (c == 'D') {
					level = level - 1;
				} else {
					level = level + 1;
				}

				if (c == 'U' && level == 0) {
					count = count + 1;
				}
			}
		}
		System.out.println(count);
	}
}