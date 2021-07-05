package Turma28;

import java.util.Scanner;

public class DoW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Crie um programa que leia um número do teclado até que encontre um número 
		  igual a zero. No final, mostre a soma dos números digitados*/
		 
			
		        int n=0, soma=0;
		        Scanner ler = new Scanner(System.in);
			
		        do {
		        	System.out.print("\nInforme um número: ");
		        n = ler.nextInt();
		        soma = soma+n;
		        
		        }
		        while(n!=0);
		        
		       System.out.print("\nA soma total dos números informados é:" +soma);
		        
		        
	}

}
