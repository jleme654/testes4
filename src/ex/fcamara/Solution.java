package ex.fcamara;

import java.util.Scanner;

/**
 * 
 * @author Julio Leme
 * @since 2016-07-28
 */
public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		str = str.toUpperCase();
		int[] posicoes = new int[3];
		
		//posicoes iniciais x=0, y=0, z=1; e contadores de subidas e descidas
		int countX = 0, countY=0, countZ = 0, countD=0, countU=0;
		
		for (int i = 1; i < str.length()-1; i++) {
			char cAnterior = str.charAt(i-1);
			char cPosterior = str.charAt(i);
			//char cPosteriorPost = str.charAt(i+1);
			
			//eixo X-------------------------------
			if (cAnterior == 'L' && cPosterior == 'M') {
				posicoes[0] = countX++;
				//posicoes[1] = countY--;
				//posicoes[2]--;
			}
			else if (cAnterior == 'M'){
				posicoes[0] = countX++;
			}
			//eixo Y--------------------------------
			if (cAnterior == 'L' && cPosterior == 'M') {
				//posicoes[0]--;
				posicoes[1] = countY++;
				//posicoes[2]--;
			}
			else if (cAnterior == 'M'){
				posicoes[0]--;
				posicoes[1] = countY++;
				//posicoes[2]--;
			}
			//eixo Z---------------------------------
			if (cPosterior == 'D') {
				posicoes[0]--;
				posicoes[1]--;
				countZ = countZ -1;
				posicoes[2] = countZ;
				//conta a qtde de descidas do helicoptero
				countD++;
			}
			if (cPosterior == 'U') {
				posicoes[0]--;
				posicoes[1]--;
				countZ = countZ + 1;
				posicoes[2] = countZ;
				//conta a qtde de subidas do helicoptero
				countU++;
			}	
		}
		
		for (int i = 0; i < posicoes.length; i++) {
			System.out.print(posicoes[i] + "\t");
		}

		//ultimo elemento da string
		String s = str.substring(str.length()-1, str.length());
		if (s.equals("U")) 
			countU++;
		else
		    countD++;
		
		if (countU >= countD) 
			System.out.println("NORTE");
		else
			System.out.println("SUL");
		
	}
	
	
}
