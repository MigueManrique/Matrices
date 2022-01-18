package com.migue.matrices;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int valor;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime el valor al que quieres iniciar la matriz.");
		valor = sc.nextInt();
		
		int matriz[][] = new int[4][3];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = valor;
			}
		}
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
				if (j == matriz[i].length-1) {
					System.out.println();
				}
			}
		}
		sc.close();
	}

}
