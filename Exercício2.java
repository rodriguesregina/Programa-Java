package Turma28;

import java.util.Scanner;

public class Exercício2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int totald,anos,meses,dias;;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com os dias contados");
		totald = leia.nextInt();
		anos = (totald / 365);
		meses = (totald % 365) / 30;
		dias = (totald % 365) / 30;
		
		System.out.println("\nVivi: "+anos+" anos(s), "+meses+" mes(es), "+dias+" dia(s) de vida..");
		
		
		
				
		
		
	}

}
