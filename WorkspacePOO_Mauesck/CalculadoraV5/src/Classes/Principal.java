package Classes;

import javax.swing.JOptionPane;

public class Principal {

	// private static Operacoes oper = new Operacoes();

	public static void main(String[] args) {
		int continuar;
		double resultado = 0;

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
				// Instância da Classe Soma, objeto "soma".
				Soma soma = new Soma();
				// Acessando com o objeto "soma", dentro da Classe "Soma", o método "SetNum1"
				// que está acessando o Método "calculaSoma".
				soma.setNum1(num1);
				// Acessando com o objeto "soma", dentro da Classe "Soma", o método "SetNum2"
				// que está acessando o Método "calculaSoma".
				soma.setNum2(num2);
				// Guardando o resultado do Cálculo.
				resultado = soma.calcula();
				break;
			case 2:
				// Instância da Classe Subtracao, objeto "sub".
				Subtracao sub = new Subtracao();
				// Acessando com o objeto "sub", dentro da Classe "Subtracao", o método
				// "SetNum1" que está acessando o Método "calculaSubtracao".
				sub.setNum1(num1);
				// Acessando com o objeto "sub", dentro da Classe "Subtracao", o método
				// "SetNum2" que está acessando o Método "calculaSubtracao".
				sub.setNum2(num2);
				// Guardando o resultado do Cálculo.
				resultado = sub.calcula();
				break;
			case 3:
				Multiplicacao mult = new Multiplicacao();
				mult.setNum1(num1);
				mult.setNum2(num2);
				resultado = mult.calcula();
				break;
			case 4:
				while (num2 == 0) {
					num2 = EntradaSaida.solicitaNumero("2º");
				}
				Divisao divi = new Divisao();
				divi.setNum1(num1);
				divi.setNum2(num2);
				resultado = divi.calcula();
				break;
			default:
				JOptionPane.showMessageDialog(null, "Operação inválida! A calculadora será encerrada");
				System.exit(0);
			}

			EntradaSaida.mostraResultado(resultado, operacao);
			continuar = Integer.parseInt(JOptionPane.showInputDialog("Deseja coninuar calculando? 1-Sim | 2-Nao"));

		} while (continuar == 1);
	}
}
