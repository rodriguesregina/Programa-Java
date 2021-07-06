package Turma28;

import java.util.Scanner;

public class Array1 {
	 /*Faça um programa que receba 6 números inteiros e mostre: 
	 • Os números pares digitados;  
	 • A soma dos números pares digitados; 
	 • Os números ímpares digitados; 
	 • A quantidade de números ímpares digitados.*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int [] numero = new int[6];
	      int y, somap=0;
	     
	      Scanner leia = new Scanner(System.in);
	      
	      for(y=0;y<6;y++) 
	      {
	    	  System.out.println("\nDigite um número :");
	    	  numero[y] = leia.nextInt();
	      }
	       for(y=0;y<6;y++) 
	       {
	    	   if(numero[y] % 2 == 0) 
	    	   {
	    		   System.out.println("\n"+numero[y]+" par..");
	    		   somap = somap + numero[y];
	    	   }
	       
	    	   else 
	    	   {
	    		   System.out.println("\n"+numero[y]+" ímpar..");
	    	   }
	       }
	      System.out.println("\nA soma dos pares digitados é: "+somap); 
	      System.out.println("\nA quantidade dos ímpares é: "+y);    
	       
	      
	       
	}
	

}
