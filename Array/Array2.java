package Turma28;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Leia uma matriz 3x3, conte e escreva quantos valores maiores que 10 ela possui.//
		
		float [][] valor = new float[3][3];
		int l=0,c=0,contdez=0;
		
		 Scanner leia = new Scanner(System.in);
		 
		 for(l=0;l<3;l++) 
		 {
			 for(c=0;c<3;c++) 
			 {
				 System.out.println("\nInforme um valor: ");
				 valor[l][c] = leia.nextFloat();
				 
				 if(valor[l][c]>10) 
				 {
					 contdez++;
				 }
			 }
		 }
		
		 System.out.println("\nValores maiores que dez são: "+contdez);
	}
	
}

	                      
