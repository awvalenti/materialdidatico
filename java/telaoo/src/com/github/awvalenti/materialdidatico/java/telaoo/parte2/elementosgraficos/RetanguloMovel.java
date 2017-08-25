package com.github.awvalenti.materialdidatico.java.telaoo.parte2.elementosgraficos;

public class RetanguloMovel extends Retangulo {

	private int velocidadeX;
	private int velocidadeY;

	public RetanguloMovel(int x, int y, int largura, int altura,
			int velocidadeX, int velocidadeY) {
		super(x, y, largura, altura);
		this.velocidadeX = velocidadeX;
		this.velocidadeY = velocidadeY;
	}

	@Override
	public void atualizarPosicao() {
		x += velocidadeX;
		y += velocidadeY;
	}

}
