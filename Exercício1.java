package Turma28;

import java.util.Scanner;

public class Exercício1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int anos,meses,dias,totald;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite sua idade");
		anos = leia.nextInt();
		System.out.println("Digite sua idade");
		meses = leia.nextInt();
		System.out.println("Digite sua idade");
		dias = leia.nextInt();
		
		totald = (dias+(anos*365)+meses+30);
		
		System.out.println("O total de dias é: "+totald);
				
		
		 
		
	}

}
