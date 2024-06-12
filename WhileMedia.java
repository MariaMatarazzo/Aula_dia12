package Aula_12_06;

import java.util.Scanner;

public class WhileMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner ler = new Scanner(System.in);
		
		double numero, soma=0, media;
		int i = 1;
		

		while(i <=20) {
			System.out.print(">>>> Insira a idade: ");
			numero = ler.nextInt();
			
			soma= soma+numero;
			i ++;
		}
			System.out.println("As somas das idades são:  " + soma);
			System.out.println(" ");
		

		media = (soma)/20;
		System.out.println("A media das idades é de: " + media);

		ler.close();

	}

}
