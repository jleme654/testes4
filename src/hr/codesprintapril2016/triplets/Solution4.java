package hr.codesprintapril2016.triplets;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt(),d=in.nextInt(),i=0,j=0;
		int[] arrN = new int[n];
		for (i = 0; i < n; i++) {
			arrN[i] = in.nextInt();
		}
		ArrayList<ArrayList<Integer>> listaLista = new ArrayList<ArrayList<Integer>>();
		for (j = n-1; j >= (n-d) ; j--) {
			ArrayList<Integer> lista = new ArrayList<Integer>(3);
			lista.add(arrN[j]);
			lista.add(arrN[j-(d-1)]);
			lista.add(arrN[(j-(d-1))-(d-1)]);
			listaLista.add(lista);
		}
		System.out.println(listaLista.size());		
	}

}
