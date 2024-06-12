package Aula_12_06;
import java.util.Scanner;
public class WhileUsuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		String nome;
		int i=0;
		System.out.println( "Informe o nome:");
		nome= ler.next();
		while ( i<10) {
		System.out.println( "O resultado é: " + nome);
		System.out.println(i++);

	}

}
}
