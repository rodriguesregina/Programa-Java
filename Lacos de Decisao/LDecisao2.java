package Turma28;

import java.util.Scanner;

public class LDecisao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		int a,b,c;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("\nEntre com o valor a: ");
		a= leia.nextInt();
		System.out.print("\nEntre com o valor b: ");
		b= leia.nextInt();
		System.out.print("\nEntre com o valor c: ");
		c= leia.nextInt();
		
		if(a>b && a>c)
		{
			System.out.print("\n"+a+" é o maior valor");
		}
		else if(b>a && b>c) 
		{
			System.out.print("\n"+b+" é o maior valor");
		}
		
		else
		{
			System.out.print("\nO maior valor é " +c);
		}
	}

}
