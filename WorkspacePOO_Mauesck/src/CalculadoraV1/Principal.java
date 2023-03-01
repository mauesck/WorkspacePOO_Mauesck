package CalculadoraV1;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		int continuar;

		do {
			double num1 = solicitaNumero("1º");
			double num2 = solicitaNumero("2º");
			int operacao = solicitaOperacao();

			continuar = Integer.parseInt(JOptionPane.showInputDialog("Deseja continuar calculando? 1- Sim | 2- Não"));

		} while (continuar == 1);

	}

}
