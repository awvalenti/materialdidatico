package com.github.awvalenti.materialdidatico.java.telaoo.parte1.tela;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TelaDePintura {

	private final JFrame frame = new JFrame();
	private final JLabel[][] quadrados = new JLabel[80][80];

	public TelaDePintura() {
		JPanel pnlDosQuadrados = new JPanel();
		pnlDosQuadrados.setLayout(new GridLayout(quadrados.length, quadrados[0].length));
		pnlDosQuadrados.setPreferredSize(new Dimension(800, 800));

		for (int i = 0; i < quadrados.length; ++i) {
			for (int j = 0; j < quadrados[i].length; ++j) {
				JLabel l = new JLabel();
				l.setBackground(Color.BLACK);
				l.setOpaque(true);
				pnlDosQuadrados.add(l);
				quadrados[i][j] = l;
			}
		}

		frame.setLayout(new BorderLayout());
		frame.add(pnlDosQuadrados, BorderLayout.CENTER);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	public void pintar(int x, int y) {
		efetuarPintura(x, y, Color.WHITE);
	}

	public void apagar(int x, int y) {
		efetuarPintura(x, y, Color.BLACK);
	}

	public void pausar(long milissegundos) {
		try {
			Thread.sleep(milissegundos);
		} catch (InterruptedException e) {
		}
	}

	private void efetuarPintura(int x, int y, Color cor) {
		if (y >= 0 && y < quadrados.length &&
				x >= 0 && x < quadrados[y].length) {
			quadrados[y][x].setBackground(cor);
		}
	}

}
