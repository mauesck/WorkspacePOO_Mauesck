package controle;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import visualizacao.EntradaSaida;
import modelo.*;

public class Controladora {

	// OT8.2
	// obejo casa do tipo Casa sendo isntânciado vazio.
	private Casa casa = null;

	public void exibeMenu() {
		int opcao;
		do {
			opcao = EntradaSaida.solicitaOpcao();

			switch (opcao) {
			case 0:

				// OT9.4
				// objeto casa recebendo o construtor Casa().
				this.casa = new Casa();

				// Variáveis recebendo o retorno de métodos.
				String descricao = EntradaSaida.solicitaDescricao("casa", 0);
				String cor = EntradaSaida.solicitaCor();
				int qtdePortas = EntradaSaida.solicitaQtdeAberturas("portas");
				int qtdeJanelas = EntradaSaida.solicitaQtdeAberturas("janelas");

				// OT9.6
				// *1* > Declaração de um ArrayList do tipo Aberturas, que receberá cada uma das
				// portas cadastradas.
				ArrayList<Aberturas> listaDePortas = new ArrayList<Aberturas>();
				// Este for é necessário para inserir a quantidade de descrições e estados para
				// a quantidade de portas.
				for (int i = 0; i < qtdePortas; i++) {
					// Objeto porta do tipo Porta de construtor Porta().
					Porta porta = new Porta();
					// Objeto porta acessando o método setDescricao() da classe Aberturas que está
					// capturando o retorno do método solicitaDescricao() da classe EntradaSaida.
					porta.setDescricao(EntradaSaida.solicitaDescricao("porta", (i + 1)));
					porta.setEstado(EntradaSaida.solicitaEstado("porta"));
					//Objeto listaDePortas recebendo uma das portas pelo objeto porta.
					listaDePortas.add(porta);
					System.out.print(listaDePortas);
				}

				// *2* > Os mesmos eventos de *1* ocorrerão aqui.
				ArrayList<Aberturas> listaDeJanelas = new ArrayList<Aberturas>();
				for (int i = 0; i < qtdeJanelas; i++) {
					Janela janela = new Janela();
					janela.setDescricao(EntradaSaida.solicitaDescricao("janela", (i + 1)));
					janela.setEstado(EntradaSaida.solicitaEstado("janela"));
					listaDeJanelas.add(janela);
				}

				// OT9.8
				// Objeto casa acessando o metodo constroiCasa().
				this.casa.constroiCasa(descricao, cor, listaDePortas, listaDeJanelas);

				// OT9.10
				// Mostra valores dos métodos.
				System.out.print("Descrição da casa: " + casa.getDescricao() + "\n");
				System.out.print("Cor da casa: " + casa.getCor() + "\n");

				for (Aberturas porta : casa.getListaDePortas()) {
					System.out.print("Descricao da porta: " + porta.getDescricao() + "\n");
					if (porta.getEstado() == 0) {
						System.out.print("Estado da porta: Fechada \n");
					} else {
						System.out.print("Estado da porta: Aberta \n");
					}
				}

				for (Aberturas janela : casa.getListaDeJanelas()) {
					System.out.print("Descricao da janela: " + janela.getDescricao() + "\n");
					if (janela.getEstado() == 0) {
						System.out.print("Estado da janela: Fechada \n");
					} else {
						System.out.print("Estado da janela: Aberta \n");
					}
				}
				break;

			case 1:
				// Validação de casa construida.
				if (this.casa!=null) {
					// OT10.1 Variável recebendo o retorno do médoto.
					String tipoAbertura = EntradaSaida.solicitaTipoAbertura();

					// OT10.2
					ArrayList<Aberturas> listaDeAberturas = new ArrayList<Aberturas>();

					// Validando o retorno do método solicitaTipoAbertura().
					if (tipoAbertura.equals("porta")) {
						/*
						 * Objeto casa acessando getListaDePortas() enviando o retorno a var
						 * ListaDeAberturas do tipo ArrayList
						 */
						listaDeAberturas = this.casa.getListaDePortas();
					} else {
						listaDeAberturas = this.casa.getListaDeJanelas();
					}

					// OT10.3
					// Var posicao recebendo o retorno do método que tem como parametro a var
					// listaDeAberturas.
					int posicao = EntradaSaida.solicitaAberturaMover(listaDeAberturas);
					int novoEstado = 0;

					// OT10.5
					if (posicao != -1) {
						novoEstado = EntradaSaida.solicitaEstado(tipoAbertura);
						Aberturas abertura = this.casa.retornaAbertura(posicao, tipoAbertura);
						this.casa.moverAbertura(abertura, novoEstado);
						System.out.print("Novo estado da " + tipoAbertura + ": " + abertura.getEstado());
					} else {
						EntradaSaida.exibeMsgEncerraPrograma();
					}
				} else {
					JOptionPane.showMessageDialog(null, "Não há casa para movimentar portas ou janelas!");
				}
				break;

			case 2:
				// Validação de casa construida.
				if (this.casa!=null) {
					// OT11.2
					String informacoes = this.casa.geraInfoCasa();
					// OT11.4
					EntradaSaida.exibeInfoCasa(informacoes);
				} else {
					JOptionPane.showMessageDialog(null, "Não há casa construida!");
				}
				break;
			}
		} while (opcao != 3);

		EntradaSaida.exibeMsgEncerraPrograma();

		System.exit(0);
	}
}
