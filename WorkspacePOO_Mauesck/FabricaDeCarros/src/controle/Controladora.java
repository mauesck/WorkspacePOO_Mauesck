package controle;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import modelo.Carro;
import modelo.Fabrica;
import vizualizacao.EntradaSaida;

public class Controladora {

	private Fabrica fabrica = new Fabrica();

	public void exibeMenu() {
		int opcao;

		do {
			opcao = EntradaSaida.menu();

			switch (opcao) {
			case 0:
				int qtdFabricar = Integer
						.parseInt(JOptionPane.showInputDialog(null, "Quantos carros serão fabricados? "));

				ArrayList<Carro> ListaDeCarros = new ArrayList<Carro>();

				for (int i = 0; i < qtdFabricar; i++) {
					Carro carro = new Carro();
					carro.setNome(EntradaSaida.solicitaNome((i + 1) + "º Carro "));
					carro.setModelo(EntradaSaida.solicitaModelo((i + 1) + "º Carro "));
					carro.setCor(EntradaSaida.solocitaCor((i + 1) + "º Carro "));
					ListaDeCarros.add(carro);
				}
				this.fabrica.fabricarCarro(ListaDeCarros);
				break;
			case 1:
				if (this.fabrica != null) {
					ListaDeCarros = fabrica.getListaDeCarros();
					int posicao = EntradaSaida.menuVenda(ListaDeCarros);
					this.fabrica.venderCarro(posicao, ListaDeCarros);
				} else {
					JOptionPane.showMessageDialog(null, "Não há carros em estoque!");
				}
				break;
			case 2:
				String informacoes = this.fabrica.geraInfoCarros();
				EntradaSaida.exibeInfoCarro(informacoes);
				break;
			}
		} while (opcao != -1);

		System.exit(0);
	}
}