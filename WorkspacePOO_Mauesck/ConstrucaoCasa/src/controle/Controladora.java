package controle;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import visualizacao.EntradaSaida;
import modelo.*;

public class Controladora {

	private Casa casa = null;

	public void exibeMenu() {
		int opcao;
		do {
			opcao = EntradaSaida.solicitaOpcao();
			
			switch(opcao) {
			case 0:
				this.casa = new Casa();
				
				String descricao = EntradaSaida.solicitaDescricao("casa",0);
				String cor = EntradaSaida.solicitaCor();
				int qtdePortas = EntradaSaida.solicitaQtdeAberturas("portas");
				int qtdeJanelas = EntradaSaida.solicitaQtdeAberturas("janelas");
				
				//Declaração de um ArrayList do tipo Aberturas, que receberá cada uma das portas cadastradas.
				ArrayList<Aberturas> listaDePortas = new ArrayList<Aberturas>();
				
				for(int i=0; i<qtdePortas; i++) {
					Porta porta = new Porta();
					porta.setDescricao(EntradaSaida.solicitaDescricao("porta", (i+1)));
					porta.setEstado(EntradaSaida.solicitaEstado("porta"));
					listaDePortas.add(porta);
				}
				
				//Declaração de um ArrayList do tipo Aberturas, que receberá cada uma das janelas cadastradas.
				ArrayList<Aberturas> listaDeJanelas = new ArrayList<Aberturas>();
				
				for(int i=0; i<qtdeJanelas; i++) {
					Janela janela = new Janela();
					janela.setDescricao(EntradaSaida.solicitaDescricao("janela", (i+1)));
					janela.setEstado(EntradaSaida.solicitaEstado("janela"));
					listaDeJanelas.add(janela);
				}
				
				this.casa.constroiCasa(descricao,cor,listaDePortas,listaDeJanelas);
				
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
