package pythonjava;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.JOptionPane;

public class ContarLetras {

	public static void main(String[] args) {
		String frase = JOptionPane.showInputDialog("Digite uma frase");

		Map<Character, Integer> contador = new HashMap<>();

		for (int i = 0; i < frase.length(); ++i) {
			contador.put(frase.charAt(i), 0);
		}

		for (int i = 0; i < frase.length(); ++i) {
			char c = frase.charAt(i);
			contador.put(c, contador.get(c) + 1);
		}

		for (Entry<Character, Integer> entry : contador.entrySet()) {
			System.out.printf("Caractere %c apareceu %d vez(es)\n",
					entry.getKey(), entry.getValue());
		}

	}

}
