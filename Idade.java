package Aula_12_06;
import java.util.Scanner;
public class Idade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner (System.in);
		
		int soma=0;
		for (int i = 1; i <=20; i++) {
			double numero;
			
			System.out.print("informe a idade :");
			
			numero = ler.nextDouble();
			soma += numero;
			
			System.out.println("A soma é "+ soma);
		}

		System.out.println("| A soma das idades é "+ soma + " |");


	}

}
