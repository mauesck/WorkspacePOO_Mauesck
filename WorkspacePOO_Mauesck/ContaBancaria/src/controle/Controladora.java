package controle;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import modelo.Conta;
import modelo.Movimentacao;
import vizualizacao.EntradaSaida;

public class Controladora {

	Conta conta = new Conta();

	public void exibirMenu() {

		int opcao = 0;

		conta.setTitularDaConta(EntradaSaida.solicitaTitular());
		conta.setTipo(EntradaSaida.solicitaTipoConta());
		ArrayList<Movimentacao> listaDeMovimentacao = new ArrayList<Movimentacao>();

		do {
			opcao = EntradaSaida.menu();
			double saldo;

			switch (opcao) {
			case 0:
				Movimentacao movimentacaoDeposito = new Movimentacao();
				movimentacaoDeposito.setTipo(1);
				movimentacaoDeposito.setData(EntradaSaida.getDate());
				movimentacaoDeposito.setValor(EntradaSaida.solicitarInformacoesDeposito());
				listaDeMovimentacao.add(movimentacaoDeposito);
				this.conta.depositar(listaDeMovimentacao, movimentacaoDeposito.getValor());
				break;
			case 1:
				Movimentacao movimentacaoSaque = new Movimentacao();
				movimentacaoSaque.setTipo(2);
				movimentacaoSaque.setData(EntradaSaida.getDate());
				movimentacaoSaque.setValor(EntradaSaida.solicitarInformacoesSaque());
				if (this.conta.getSaldo() > -1000 & (this.conta.getSaldo() - movimentacaoSaque.getValor()) > -1001) {
					listaDeMovimentacao.add(movimentacaoSaque);
					this.conta.sacar(listaDeMovimentacao, movimentacaoSaque.getValor());
				} else {
					JOptionPane.showMessageDialog(null,
							"Transação não realizada: \n"
							+ "\n"
							+ "Possíveis motivos: \n"
							+ "\n"
							+ "1. Sua conta está negativada em R$-1000,00 \n"
							+ "2. O saque deixará sua conta com mais de R$-1000,00 negativos.");
				}
				break;
			case 2:
				EntradaSaida.exibirDadosDaConta(conta.gerarDadosDaConta());
				break;
			case 3:
				EntradaSaida.exibirSaldo(conta.gerarSaldo());
				break;
			case 4:
				EntradaSaida.exibirExtratoCompleto(conta.gerarExtrato());
				break;
			case 5:
				EntradaSaida.exibirExtratoDeDepositos(conta.gerarExtratoDepositos());
				break;
			case 6:
				EntradaSaida.exibirExtratoDeSaques(conta.gerarExtratoSaques());
				break;
			}
		} while (opcao != -1);

		System.exit(0);
	}
}
