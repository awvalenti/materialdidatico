package com.github.awvalenti.materialdidatico.java.telaoo.parte2.tela;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.github.awvalenti.materialdidatico.java.telaoo.parte2.elementosgraficos.Retangulo;

public class TelaDeJogo {

	private final JFrame frame = new JFrame();
	private final JLabel[][] quadrados = new JLabel[80][80];
	private final JLabel lblContador = new JLabel();

	private List<Retangulo> elementos = new ArrayList<>();

	public TelaDeJogo() {
		JPanel pnlDosQuadrados = new JPanel();
		pnlDosQuadrados.setLayout(new GridLayout(quadrados.length, quadrados[0].length));
		pnlDosQuadrados.setPreferredSize(new Dimension(800, 800));

		for (int i = 0; i < quadrados.length; ++i) {
			for (int j = 0; j < quadrados[i].length; ++j) {
				JLabel l = new JLabel();
				l.setOpaque(true);
				pnlDosQuadrados.add(l);
				quadrados[i][j] = l;
			}
		}

		lblContador.setFont(new Font("Arial", Font.PLAIN, 26));

		frame.setLayout(new BorderLayout());
		frame.add(pnlDosQuadrados, BorderLayout.CENTER);
		frame.add(lblContador, BorderLayout.SOUTH);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	public void adicionar(Retangulo r) {
		elementos.add(r);
	}

	public void iniciarAnimacao() {
		for (int contador = 1; ; ++contador) {

			lblContador.setText("Quadro: " + contador);

			for (int i = 0; i < quadrados.length; ++i) {
				for (int j = 0; j < quadrados[i].length; ++j) {
					quadrados[i][j].setBackground(Color.BLACK);
				}
			}

			for (Retangulo e : elementos) {
				for (int x = e.getX(); x < e.getX() + e.getLargura(); ++x) {
					for (int y = e.getY(); y < e.getY() + e.getAltura(); ++y) {
						if (y >= 0 && y < quadrados.length && x >= 0 && x < quadrados[y].length) {
							quadrados[y][x].setBackground(Color.WHITE);
						}
					}
				}
			}

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			}

			for (Retangulo e : elementos) {
				e.atualizarPosicao();
			}
		}
	}

}
