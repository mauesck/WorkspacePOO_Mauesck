package vizualizacao;

import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

import modelo.Carro;

public class EntradaSaida {

	public static int menu() {
		String[] opcoes = { "Fabricar carros", "Vender um carro", "Ver informações dos carros" };
		JComboBox<String> menu = new JComboBox<String>(opcoes);
		int teste = JOptionPane.showConfirmDialog(null, menu, "Selecione a ação desejada:",
				JOptionPane.OK_CANCEL_OPTION);
		/* Validação para encerrar o programa pelo "x = -1" e "Cancel = 2" */
		if (teste == -1 || teste == 2) {
			teste = -1;
			return teste;
		} else {
			return menu.getSelectedIndex();
		}
	}

	public static String solicitaNome(String ordem) {
		return JOptionPane.showInputDialog(null, ordem + "Nome: ");
	}

	public static String solicitaModelo(String ordem) {
		return JOptionPane.showInputDialog(null, ordem + "Modelo: ");
	}

	public static String solocitaCor(String ordem) {
		return JOptionPane.showInputDialog(null, ordem + "Cor:");
	}

	public static void exibeInfoCarro(String informacoes) {
		//if (informacoes.equals("")) {
			//JOptionPane.showMessageDialog(null, "Não há carros em estoque!");
		//} else {
			JOptionPane.showMessageDialog(null, informacoes, "Informações dos carros: ",
					JOptionPane.INFORMATION_MESSAGE);
		//}
	}

	public static int menuVenda(ArrayList<Carro> listaDeCarros) {
		int qtdCarros = listaDeCarros.size();
		String[] carros = new String[qtdCarros];

		for (int i = 0; i < qtdCarros; i++) {
			carros[i] = listaDeCarros.get(i).getNome() + " " + listaDeCarros.get(i).getModelo() + " "
					+ listaDeCarros.get(i).getCor();
		}
		JComboBox menuVenda = new JComboBox(carros);

		int sair = JOptionPane.showConfirmDialog(null, menuVenda, "Selecione o carro a vender.",
				JOptionPane.OK_CANCEL_OPTION);
		if (sair == -1 || sair == 2) {
			sair = -1;
			return sair;
		} else {
			return menuVenda.getSelectedIndex();
		}
	}

}
