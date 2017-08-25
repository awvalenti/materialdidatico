package com.github.awvalenti.materialdidatico.java.telaoo.parte2.elementosgraficos;

public abstract class Retangulo {

	protected int x;
	protected int y;
	protected int largura;
	protected int altura;

	public Retangulo(int x, int y, int largura, int altura) {
		this.x = x;
		this.y = y;
		this.largura = largura;
		this.altura = altura;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getLargura() {
		return largura;
	}

	public int getAltura() {
		return altura;
	}

	public abstract void atualizarPosicao();

}
