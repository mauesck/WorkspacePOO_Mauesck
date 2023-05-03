package visualizacao;

import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

import modelo.Aberturas;

public class EntradaSaida {

	public static int solicitaOpcao() {
		String[] opcoes = {"Construir casa","Movimentar portas ou janelas","Ver informacoes da casa","Sair do programa"};
		JComboBox<String> menu = new JComboBox<String>(opcoes);
		JOptionPane.showConfirmDialog(null, menu, "Selecione a opcao desejada",JOptionPane.OK_CANCEL_OPTION);
		return menu.getSelectedIndex();
	}
	
	public static void exibeMsgEncerraPrograma() {
		JOptionPane.showMessageDialog(null, "O programa será encerrado!");
	}
	
	public static String solicitaDescricao(String descricao, int ordem) {
		if(ordem==0) {
			return JOptionPane.showInputDialog("Informe a descricao da "+descricao);
		}else {
			return JOptionPane.showInputDialog("Informe a descricao da "+ordem+" "+descricao);	
		}
	}
	
	public static String solicitaCor() {
		return JOptionPane.showInputDialog("Informe a cor da casa");
	}
	
	public static int solicitaQtdeAberturas(String abertura) {
		return Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de "+abertura));
	}
	
	public static int solicitaEstado(String tipoAbertura) {
		String[] opcoes = {"Fechada","Aberta","teste"};
		
		return JOptionPane.showOptionDialog(null, "Informe o estado da "+tipoAbertura, 
				"Estado", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[1]);
	}
	
	public static String solicitaTipoAbertura() {
		String[] opcoes = {"Porta","Janela"};
		
		int tipoAbertura = JOptionPane.showOptionDialog(null, "Informe qual tipo de abertura deseja mover", 
				"Mover abertura", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, 
				null, opcoes, opcoes[0]);

		if(tipoAbertura==0) {
			return "porta";
		}else {
			return "janela";
		}
	}
	
	public static int solicitaAberturaMover(ArrayList<Aberturas> listaDeAberturas) {
		String tipoAbertura = listaDeAberturas.get(0).getClass().getName();
		tipoAbertura = tipoAbertura.replaceAll("modelo.", "");
		int qtdeAbertura = listaDeAberturas.size();
		String[] descricoesAberturas = new String[qtdeAbertura];
		
		for(int i=0; i<qtdeAbertura; i++) {
			descricoesAberturas[i]=listaDeAberturas.get(i).getDescricao();
		}
		
		String msg = "Escolha a "+tipoAbertura
		
	}
}
