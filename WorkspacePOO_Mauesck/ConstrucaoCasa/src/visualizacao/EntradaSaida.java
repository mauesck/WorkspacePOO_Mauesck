package visualizacao;

import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

import modelo.Aberturas;

public class EntradaSaida {

	// OT8.3
	public static int solicitaOpcao() {
		String[] opcoes = { "Construir casa", "Movimentar portas ou janelas", "Ver informacoes da casa",
				"Sair do programa" };
		JComboBox<String> menu = new JComboBox<String>(opcoes);
		JOptionPane.showConfirmDialog(null, menu, "Selecione a opcao desejada", JOptionPane.OK_CANCEL_OPTION);
		return menu.getSelectedIndex();
	}

	// OT8.4
	public static void exibeMsgEncerraPrograma() {
		JOptionPane.showMessageDialog(null, "O programa será encerrado!");
	}

	// OT9.5
	public static String solicitaDescricao(String descricao, int ordem) {
		if (ordem == 0) {
			return JOptionPane.showInputDialog("Informe a descricao da " + descricao);
		} else {
			return JOptionPane.showInputDialog("Informe a descricao da " + ordem + " " + descricao);
		}
	}

	public static String solicitaCor() {
		return JOptionPane.showInputDialog("Informe a cor da casa");
	}

	public static int solicitaQtdeAberturas(String abertura) {
		int valor = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de " + abertura));
		//VALIDAÇÃO PARA NÃO SER INFORMADO VALOR IGUAL OU MENOR QUE ZERO.
		while (valor <= 0) {
			JOptionPane.showMessageDialog(null, "Informe uma quantidade de "+abertura+" maior que 0!");
			valor = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de " + abertura));
		}
		return valor;
	}

	// OT9.7
	public static int solicitaEstado(String tipoAbertura) {
		String[] opcoes = { "Fechada", "Aberta"};

		return JOptionPane.showOptionDialog(null, "Informe o estado da " + tipoAbertura, "Estado",
				JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[1]);
	}

	// OT10.2
	public static String solicitaTipoAbertura() {
		// Vetor opcoes de 2 posições.
		String[] opcoes = { "Porta", "Janela" };

		// Var tipoAbertura recebendo a abertura a ser movida.
		int tipoAbertura = JOptionPane.showOptionDialog(null, "Informe qual tipo de abertura deseja mover",
				"Mover abertura", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);

		// Validação para definir oque o metódo irá retornar. "opcoes" retorna "porta",
		// "opcoes[0]" retorna "janela".
		if (tipoAbertura == 0) {
			return "porta";
		} else {
			return "janela";
		}
	}

	// OT10.4
	public static int solicitaAberturaMover(ArrayList<Aberturas> listaDeAberturas) {
		// Descobrindo se na posição há uma porta ou janela.
		String tipoAbertura = listaDeAberturas.get(0).getClass().getName();
		/*
		 * Acima o metodo getName() traz a ocorrencia completa da posição em
		 * listaDeAbertura, usamos então replaceAll para substituir "modelo." por "",
		 * ficando apenas "porta" ou "janela" e atribuindo a tipoAbertura
		 */
		tipoAbertura = tipoAbertura.replaceAll("modelo.", "");
		// Descobrindo quantos elemento a lista possui através de size().
		int qtdeAbertura = listaDeAberturas.size();
		/*
		 * Vetor criado com a quantidade de elementos em listaDeAberturas, repare que o
		 * método construtor que determina o tamanho do vetor é qtdeAbertura
		 */
		String[] descricoesAberturas = new String[qtdeAbertura];
		// For que tera como base de repetição qtdeAbertura.
		for (int i = 0; i < qtdeAbertura; i++) {
			descricoesAberturas[i] = listaDeAberturas.get(i).getDescricao();
		}
		// msg recebe a porta ou janela a ser movimentada.
		String msg = "Escolha a " + tipoAbertura + "a ser movimentada";
		// Objeto exibicaoAberturas irá receber os dados de descricoesAberturas.
		JComboBox exibicaoAberturas = new JComboBox(descricoesAberturas);
		int confirmacao = JOptionPane.showConfirmDialog(null, exibicaoAberturas, msg, JOptionPane.OK_CANCEL_OPTION);

		if (confirmacao == 0) {
			return exibicaoAberturas.getSelectedIndex();
		} else {
			return -1;
		}

	}

	// OT10.7
	public static void exibeMsgAbertura() {
		JOptionPane.showMessageDialog(null, "Nenhuma abertura será movimentada");
	}

	// OT11.3
	public static void exibeInfoCasa(String informacoes) {
		JOptionPane.showMessageDialog(null, informacoes, "Informações da casa", JOptionPane.INFORMATION_MESSAGE);
	}
}
