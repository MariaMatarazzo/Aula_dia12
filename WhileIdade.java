package Aula_12_06;

import java.util.Scanner;

public class WhileIdade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner (System.in);

		double numero, X=1;
		int soma=0;

		while (X <= 20) {
			X++;
			System.out.print("informe a idade :");
			numero = ler.nextDouble();

			soma += numero;

			System.out.println("A soma é "+ soma);
		}
		System.out.println("| A soma das idades é "+ soma + " |");


	}

}
