package CalculadoraV6;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		int continuar;
		double resultado = 0;
		
		//Objeto oper sendo iniciado (instânciado) nullo.
		Operacoes oper = null;
		
		// Repetir até a condição ser atendida.
		do {
			// Solicitar números.
			double num1 = EntradaSaida.solicitaNumero("1°");
			double num2 = EntradaSaida.solicitaNumero("2º");
			// Solicitar operação.
			int operacao = EntradaSaida.solicitaOperacao();

			// Case de operações.
			switch (operacao) {
			case 1:
				// Instância de Operacões com o metodo construtor da operação em questão. Objeto assumindo uma forma.
				oper = new Soma();
				break;
			case 2:
				oper = new Subtracao();
				break;
			case 3:
				oper = new Multiplicacao();
				break;
			case 4:
				while (num2 == 0) {
					num2 = EntradaSaida.solicitaNumero("2º");
				}
				oper = new Divisao();
				break;
			default:
				JOptionPane.showMessageDialog(null, "Operação inválida! A calculadora será encerrada");
				System.exit(0);
			}
			
			oper.setNum1(num1);
			oper.setNum2(num2);
			resultado = oper.calcula();
			
			EntradaSaida.mostraResultado(resultado, operacao);
			continuar = Integer.parseInt(JOptionPane.showInputDialog("Deseja coninuar calculando? 1-Sim | 2-Nao"));

		} while (continuar == 1);
	}
}
