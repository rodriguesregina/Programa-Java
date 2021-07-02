package Turma28;
 
import java.util.Scanner;

public class LDecisao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		/* Faça um programa que leia a idade de uma pessoa e mostre na saída em qual categoria
	    ela se encontra:
	    10-14 infantil
	    15-17 juvenil
	    18-25 adulto*/
		
		int idade;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("\nInforme a idade: ");
		idade = leia.nextInt();
		
		if(idade>=10 && idade<=14 )
		{
			System.out.print("\nSua categoria é infantil");
		}
		else if(idade>=15 && idade <=17 )
		{
			System.out.print("\nSua categoria é juvenil");
		}
		else if(idade>=18 && idade<=25 ) 
		{
			System.out.print("\nSua categoria é Adulto ");
		}
		else 
		{
			System.out.print("\nNão existe categoria para a idade inserida ");
		}
		
		
			
	}
	
	
	
	
	
	
          
	    
	    
	    
	  
	    

}
