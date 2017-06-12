package com.github.awvalenti.materialdidatico.java.exemploswing;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ItemAfazer extends JPanel {

	private static final long serialVersionUID = 1L;

	private JButton btnExcluir = new JButton("x");

	public ItemAfazer(String texto, JComponent pai) {
		super(new BorderLayout());

		add(btnExcluir, BorderLayout.WEST);
		add(new JLabel(texto), BorderLayout.CENTER);

		btnExcluir.addActionListener(evento -> {
			pai.remove(this);
			UtilitariosSwing.redesenharAposModificacao(pai);
		});
	}

}
