package Atividades;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double x, y;

		System.out.println("Digite o primeiro numero");
		x = sc.nextDouble();

		System.out.println("Digite o segundo numero");
		y = sc.nextDouble();

		while (x != 0 && y != 0) {

			if (x > 0 && y > 0) {
				System.out.println("Primeiro quadrante");
				break;

			} else if (x < 0 && y > 0) {
				System.out.println("Segundo quadrante");
				break;
			} else if (x < 0 && y < 0) {
				System.out.println("terceiro quadrante");
				break;
			} else
				System.out.println("Quarto quadrante");
			break;
		}
		
		x = sc.nextDouble();
		y = sc.nextDouble();
		
		sc.close();
	}
	
}
