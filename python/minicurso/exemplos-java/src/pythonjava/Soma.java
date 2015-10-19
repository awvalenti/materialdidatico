package pythonjava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		List<Integer> numeros = new ArrayList<>();

		System.out.println("Digite numeros nao-negativos para somar "
				+ "e um numero negativo para encerrar");

		int n = scanner.nextInt();
		while (n >= 0) {
			numeros.add(n);
			n = scanner.nextInt();
		}

		int soma = 0;
		for (int numero : numeros) {
			soma += numero;
		}
		System.out.println("Soma: " + soma);

		scanner.close();
	}
}
