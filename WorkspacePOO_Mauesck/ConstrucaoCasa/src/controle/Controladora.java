package controle;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import visualizacao.EntradaSaida;
import modelo.*;

public class Controladora {

	//obejo casa do tipo Casa sendo isntânciado vazio.
	private Casa casa = null;

	public void exibeMenu() {
		int opcao;
		do {
			opcao = EntradaSaida.solicitaOpcao();
			
			switch(opcao) {
			case 0:
				//objeto casa recebendo o construtor Casa().
				this.casa = new Casa();
				
				//Variáveis recebendo o retorno de métodos.
				String descricao = EntradaSaida.solicitaDescricao("casa",0);
				String cor = EntradaSaida.solicitaCor();
				int qtdePortas = EntradaSaida.solicitaQtdeAberturas("portas");
				int qtdeJanelas = EntradaSaida.solicitaQtdeAberturas("janelas");
				
				//*1* > Declaração de um ArrayList do tipo Aberturas, que receberá cada uma das portas cadastradas.
				ArrayList<Aberturas> listaDePortas = new ArrayList<Aberturas>();
				//Este for é necessário para inserir a quantidade de descrições e estados para a quantidade de portas.
				for(int i=0; i<qtdePortas; i++) {
					//Objeto porta do tipo Porta de construtor Porta().
					Porta porta = new Porta();
					//Objeto porta acessando o método setDescricao() da classe Aberturas que está capturando o retorno do método solicitaDescricao() da classe EntradaSaida.
					porta.setDescricao(EntradaSaida.solicitaDescricao("porta", (i+1)));
					porta.setEstado(EntradaSaida.solicitaEstado("porta"));
					listaDePortas.add(porta);
				}
				
				//*2* > Os mesmos eventos de *1* ocorrerão aqui.
				ArrayList<Aberturas> listaDeJanelas = new ArrayList<Aberturas>();
				for(int i=0; i<qtdeJanelas; i++) {
					Janela janela = new Janela();
					janela.setDescricao(EntradaSaida.solicitaDescricao("janela", (i+1)));
					janela.setEstado(EntradaSaida.solicitaEstado("janela"));
					listaDeJanelas.add(janela);
				}
				
				//Objeto casa acessando o metodo constroiCasa().
				this.casa.constroiCasa(descricao,cor,listaDePortas,listaDeJanelas);
				
				//Mostra valores dos métodos.
				System.out.print("Descrição da casa: "+ casa.getDescricao()+"\n");
				System.out.print("Cor da casa: "+casa.getCor()+"\n");
				
				for(Aberturas porta : casa.getListaDePortas()) {
					System.out.print("Descricao da porta: "+porta.getDescricao()+"\n");
					System.out.print("Estado da porta: "+porta.getEstado()+"\n");
				}
				
				for(Aberturas janela : casa.getListaDeJanelas()) {
					System.out.print("Descricao da janela: "+janela.getDescricao()+"\n");
					System.out.print("Estado da janela: "+janela.getEstado()+"\n");
				}
				
				JOptionPane.showMessageDialog(null, "Construir casa");
			break;
			
			case 1:
				JOptionPane.showConfirmDialog(null, "Movimentar portas ou janelas");
			break;
			
			case 2:
				JOptionPane.showConfirmDialog(null, "Ver informações da casa");
			break;
			}
		}while(opcao!=3);
		
		EntradaSaida.exibeMsgEncerraPrograma();
		
		System.exit(0);
	}
}
