package com.github.awvalenti.materialdidatico.java.exemploswing;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.Enumeration;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

public class Janela extends JFrame implements Runnable {

	private static final long serialVersionUID = 1L;

	private JPanel pnlCentro = new JPanel(new GridLayout(8, 1));
	private JPanel pnlSul = new JPanel(new BorderLayout());;
	private JTextField txtTarefa = new JTextField();
	private JButton btnAdicionar = new JButton("+");

	static {
		// Isto e' um bloco inicializador estatico. Ele e' executado apenas
		// uma vez, quando a classe e' referenciada pela primeira vez
		// no programa.
		aumentarFontePadraoDoSwing();
	}

	public Janela() {
		super("Afazeres");
		definirPropriedades();
		configurarEAdicionarPaineis();
		configurarAcoes();
	}

	private void definirPropriedades() {
		setLayout(new BorderLayout());
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}

	private void configurarEAdicionarPaineis() {
		pnlSul.add(txtTarefa, BorderLayout.CENTER);
		pnlSul.add(btnAdicionar, BorderLayout.EAST);
		add(pnlSul, BorderLayout.SOUTH);
		add(pnlCentro, BorderLayout.CENTER);
	}

	private void configurarAcoes() {
		ActionListener listener = evento -> {
			pnlCentro.add(new ItemAfazer(txtTarefa.getText(), pnlCentro));
			UtilitariosSwing.redesenharAposModificacao(Janela.this);
		};

		btnAdicionar.addActionListener(listener);
	}

	@Override
	public void run() {
		setVisible(true);
	}

	private static void aumentarFontePadraoDoSwing() {
		// Trecho baseado em:
		// - https://stackoverflow.com/questions/1434201/how-do-i-get-the-default-font-for-swing-jtabbedpane-labels#1434503
		// - https://stackoverflow.com/questions/7434845/setting-the-default-font-of-swing-program#7434935

		float novoTamanho = 18;

		Enumeration<Object> keys = UIManager.getDefaults().keys();
		while (keys.hasMoreElements()) {
			Object key = keys.nextElement();
			if (UIManager.get(key) instanceof FontUIResource) {
				UIManager.put(key, new FontUIResource(UIManager.getDefaults()
						.getFont("TabbedPane.font").deriveFont(novoTamanho)));
			}
		}
	}

}
