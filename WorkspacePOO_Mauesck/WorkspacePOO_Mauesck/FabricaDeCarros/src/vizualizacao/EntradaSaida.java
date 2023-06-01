package vizualizacao;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class EntradaSaida {

	public static int menu() {
		String[] opcoes = {"Fabricar carros","Vender um carro","Ver informações dos carros","Sair"};
		JComboBox<String> menu = new JComboBox<String>(opcoes);
		JOptionPane.showConfirmDialog(null, menu,"Selecione a ação desejada:", JOptionPane.OK_CANCEL_OPTION);
		return menu.getSelectedIndex();
	}
}
