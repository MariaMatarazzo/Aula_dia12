package Aula_12_06;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner ler = new Scanner (System.in);
		
		int soma=0, media=0;
		for (int i = 1; i <=20; i++) {
			double numero;
			
			System.out.print("informe a idade :");
			
			numero = ler.nextDouble();
			soma += numero;

			
			System.out.println("A soma é "+ soma);
	

		}
		media = (soma)/20;

		System.out.println("| A soma das idades é "+ soma + " |");
		System.out.println("|A media das idades é de: " + media+ "|");





	}

}
