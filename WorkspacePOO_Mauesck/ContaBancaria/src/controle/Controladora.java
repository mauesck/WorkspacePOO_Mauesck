package controle;

import java.util.ArrayList;

import modelo.Conta;
import modelo.Movimentacao;
import vizualizacao.EntradaSaida;

public class Controladora {

	Conta conta = new Conta();
	Movimentacao movimentacao = new Movimentacao();

	public void exibirMenu() {

		int opcao = 0;
		Double saldo = null;

		conta.setTitularDaConta(EntradaSaida.solicitaTitular());
		conta.setTipo(EntradaSaida.solicitaTipoConta());

		ArrayList<Movimentacao> listaDeMovimentacao = new ArrayList<Movimentacao>();

		do {
			opcao = EntradaSaida.menu();

			switch (opcao) {
			case 0:
				movimentacao.setTipo(1);
				movimentacao.setData(EntradaSaida.getDate());
				movimentacao.setValor(EntradaSaida.solicitarInformacoesDeposito());
				listaDeMovimentacao.add(movimentacao);
				saldo = movimentacao.getValor();
				this.conta.depositar(listaDeMovimentacao, saldo);
				break;
			case 1:
				movimentacao.setTipo(2);
				movimentacao.setData(EntradaSaida.getDate());
				movimentacao.setValor(EntradaSaida.solicitarInformacoesSaque());
				listaDeMovimentacao.add(movimentacao);
				saldo = movimentacao.getValor();
				this.conta.sacar(listaDeMovimentacao, saldo);
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
			}
		} while (opcao != -1);

		System.exit(0);
	}
}
