/**
 * 
 */
package com.migue.matrices;
import java.util.Random;
import java.util.Scanner;

public class Matrices {

	public static void RellenaMatriz (int[][] matriz) {	
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.println("Dime un valor: ");
				matriz[i][j] = sc.nextInt();
			}
		}
	}
	
	public static void RellenaMatrizCeros (int[][] matriz) {		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = 0;
			}
		}
	}
	
	public static void RellenaMatrizRNG (int[][] matriz) {		
		Random rng = new Random();
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.println("Dime un valor: ");
				matriz[i][j] = rng.nextInt(100);
			}
		}
	}
	
	public static void ImprimeMatriz (int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
				if (j == matriz[i].length-1) {
					System.out.println();
				}
			}
		}
	}
	
	
}
