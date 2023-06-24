package controle;

import modelo.Conta;
import vizualizacao.EntradaSaida;

public class Controladora {

	Conta conta = new Conta();

	public void exibirMenu() {

		int opcao = 0;

		conta.setTitularDaConta(EntradaSaida.solicitaTitular());
		conta.setTipo(EntradaSaida.solicitaTipoConta());
		
		do {
			opcao = EntradaSaida.menu();
			switch (opcao) {
			case 0:
				EntradaSaida.solicitarInformacoesDeposito();
				break;
			}
		} while (opcao != -1);
		
		System.exit(0);
	}
}
