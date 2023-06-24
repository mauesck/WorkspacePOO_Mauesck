package vizualizacao;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class EntradaSaida {
	public static String solicitaTitular() {
		String titular;
		return titular = JOptionPane.showInputDialog("Nome do titular da conta: ");
	}

	public static int solicitaTipoConta() {
		String[] tipoConta = { "Conta Poupança", "Conta Corrente" };
		int tipoContaEscolhido = JOptionPane.showOptionDialog(null, "Escolha o tipo da conta: ", "Atenção!",
				JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, tipoConta, tipoConta[1]);
		if (tipoContaEscolhido == 0) {
			return tipoContaEscolhido = 1;
		} else {
			return tipoContaEscolhido = 2;
		}
	}

	public static int menu() {
		String[] opcoes = { "Deposito", "Saque", "Dados da Conta", "Saldo", "Extrato" };
		JComboBox<String> menu = new JComboBox<>(opcoes);
		int opcao = JOptionPane.showConfirmDialog(null, menu, "Escolha a operação:", JOptionPane.OK_CANCEL_OPTION);
		if (opcao == -1 || opcao == 2) {
			opcao = -1;
			return opcao;
		} else {
			return menu.getSelectedIndex();
		}
	}

	public static double solicitarInformacoesDeposito() {
		return Double.parseDouble((JOptionPane.showInputDialog(null, "Valor a ser depositado: ")));
	}

	public static String solicitarInformacoesSaque() {
		return null;
	}

	public static void exibirSaldo() {

	}

	public static void exibirDadosDaConta() { // exibir nome do titular, tipo e saldo

	}

	public static void exibirExtratoCompleto() {

	}

	public static void exibirExtratoDeDepositos() {

	}

	public static void exibirExtratoDeSaques() {

	}
}
