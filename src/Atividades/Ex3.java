package Atividades;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//int combustivel = 0;
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		int tipo;

		System.out.println("Digite o produto");
		System.out.println("1. Alcool 2. Gasolina 3. Diesel 4.Fim");
		tipo = sc.nextInt();

		while (tipo != 4) {

			if (tipo  == 1) {
				alcool = alcool + 1;

			} else if (tipo == 2) {
				gasolina = gasolina + 1;

			} else if (tipo == 3) {
				diesel = diesel + 1;

			} tipo = sc.nextInt();
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		sc.close();
	}

}
