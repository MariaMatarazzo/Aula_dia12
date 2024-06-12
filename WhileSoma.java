package Aula_12_06;
import java.util.Scanner;
public class WhileSoma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
		double numero, soma=0;
		int i = 1;
		

		while(i <=20) {
			System.out.print(">>>> Insira o numero: ");
			numero = ler.nextInt();
			
			soma= soma+numero;
			i ++;
		}
			System.out.println("As somas dos numeros são:  " + soma);

	}

}
