package pythonjava;

class Pessoa {

	private String nome;
	private int idade;

	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public boolean maiorDeIdade() {
		return idade >= 18;
	}

	public String getNome() {
		return nome;
	}

}

public class Maioridade {

	public static void main(String[] args) {
		Pessoa[] pessoas = new Pessoa[] {
				new Pessoa("Joana", 29),
				new Pessoa("Joao", 34),
				new Pessoa("Joaozinho", 0),
		};

		System.out.println("Maiores de idade:");

		for (Pessoa p : pessoas) {
			if (p.maiorDeIdade()) {
				System.out.println(p.getNome());
			}
		}
	}
}
