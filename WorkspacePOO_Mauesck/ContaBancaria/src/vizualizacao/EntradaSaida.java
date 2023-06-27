package vizualizacao;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

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
		String[] opcoes = { "Deposito", "Saque", "Dados da Conta", "Saldo", "Extrato Completo", "Extrato de Depositos",
				"Extrato de Saques" };
		JComboBox<String> menu = new JComboBox<>(opcoes);
		int opcao = JOptionPane.showConfirmDialog(null, menu, "Escolha a operação:", JOptionPane.OK_CANCEL_OPTION);
		if (opcao == -1 || opcao == 2) {
			opcao = -1;
			return opcao;
		} else {
			return menu.getSelectedIndex();
		}
	}

	public static Double solicitarInformacoesDeposito() {
		return Double.parseDouble(JOptionPane.showInputDialog(null, "Valor a ser depositado: "));
	}

	public static Double solicitarInformacoesSaque() {
		return Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do saque:"));
	}

	public static void exibirSaldo(String saldo) {
		JOptionPane.showMessageDialog(null, saldo);
	}

	public static void exibirDadosDaConta(String dados) { // exibir nome do titular, tipo e saldo
		JOptionPane.showMessageDialog(null, dados);
	}

	public static void exibirExtratoCompleto(String informacoes) {
		if (informacoes.equals("")) {
			JOptionPane.showMessageDialog(null, "Não há movimentações!");
		} else {
			JOptionPane.showMessageDialog(null, informacoes);
		}
	}

	public static void exibirExtratoDeDepositos() {

	}

	public static void exibirExtratoDeSaques() {

	}

	public static String getDate() {
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		return dateFormat.format(date);
	}
}
