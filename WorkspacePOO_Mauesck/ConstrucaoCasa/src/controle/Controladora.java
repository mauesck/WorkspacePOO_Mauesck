package controle;

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
				this.casa = new casa();
				
				String descricao = EntradaSaida.solicitaDescricao("casa",0);
				String cor = EntradaSaida.solicitaCor();
				int qtdePortas = EntradaSaida.solicitaQtdeAberturas("portas");
				int qtdeJanelas = EntradaSaida.solicitaQtdeAberturas("janelas");
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
