package Aula_12_06;
import java.util.Scanner;
public class NumerosWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
		
		double numero, X=1;
		int soma=0;
		
		while (X <= 10) {
			X++;
			System.out.print("informe o numero :");
			numero = ler.nextDouble();
			
			soma += numero;
			
			System.out.println("A soma é "+ soma);
		}
		System.out.println("| A soma dos numeros é "+ soma + " |");

	}

}
