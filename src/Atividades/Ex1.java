package Atividades;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int senha = 2002;
	int senhaDigitada;
	
	
	System.out.println("Digite a senha");
	senhaDigitada = sc.nextInt();
	
	while(senhaDigitada != senha) {
		System.out.println("Senha Invalida!");
		
		System.out.println("Digite a senha");
		senhaDigitada = sc.nextInt();
	}
	System.out.println("Acesso permitido!");
	sc.close();
	}
}
