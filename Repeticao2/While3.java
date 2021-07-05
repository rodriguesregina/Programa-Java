package Turma28;

import java.util.Scanner;

public class While3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int y=0, id, idmaior=0, contmaior=0, contmenor=0;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("\nInsira a idade: ");
	     id = ler.nextInt();
		 
		 while(id!= -99) {
			 
		 
			 System.out.print("\nInsira a idade: ");
	     id = ler.nextInt();
		 
		     
		     if(id<21) 
		     {
		    	 contmenor++;
		     }
		     else if(id>50) 
		     {
		    	 contmaior++;
		     }
		     
		     else 
		     {
		    	 idmaior++;
		     }
		 }
		
		     System.out.print("\nTotal com menos de 21 anos : "+contmaior);
		 	System.out.print("\nTotal com mais de 50 anos : "+contmenor);
	}

}
