package com.github.awvalenti.materialdidatico.java.telaoo.parte2.main;

import com.github.awvalenti.materialdidatico.java.telaoo.parte2.elementosgraficos.RetanguloFixo;
import com.github.awvalenti.materialdidatico.java.telaoo.parte2.elementosgraficos.RetanguloMovel;
import com.github.awvalenti.materialdidatico.java.telaoo.parte2.tela.TelaDeJogo;

public class MainParte2 {

	public static void main(String[] args) {
		TelaDeJogo tela = new TelaDeJogo();

		RetanguloFixo nave = new RetanguloFixo(30, 75, 20, 5);
		RetanguloMovel tiro1 = new RetanguloMovel(40, 75, 1, 3, 0, -3);
		RetanguloMovel tiro2 = new RetanguloMovel(40, 150, 1, 3, 0, -3);

		tela.adicionar(nave);
		tela.adicionar(tiro1);
		tela.adicionar(tiro2);

		tela.iniciarAnimacao();
	}

}
