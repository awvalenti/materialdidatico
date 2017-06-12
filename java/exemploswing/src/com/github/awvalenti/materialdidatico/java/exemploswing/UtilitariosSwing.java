package com.github.awvalenti.materialdidatico.java.exemploswing;

import java.awt.Component;

public class UtilitariosSwing {

	public static void redesenharAposModificacao(Component componente) {
		componente.revalidate();
		componente.repaint();
	}

}
