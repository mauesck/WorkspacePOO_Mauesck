package CalculadoraV4;

import javax.swing.JOptionPane;

public class Principal {

	
	//private static Operacoes oper = new Operacoes();
	
	public static void main(String[] args) {
		int continuar;
		double resultado = 0;

		do {
			double num1 = EntradaSaida.solicitaNumero("1°");
			double num2 = EntradaSaida.solicitaNumero("2º");
			int operacao = EntradaSaida.solicitaOperacao();

			switch (operacao) {
			case 1:
				Soma soma = new Soma();
				soma.setNum1(num1);
				soma.setNum2(num2);
				resultado = soma.calculaSoma();
				break;
			case 2:
				Subtracao sub = new Subtracao();
				sub.setNum1(num1);
				sub.setNum2(num2);
				resultado = sub.calculaSubtracao();
				break;
			case 3:
				Multiplicacao mult = new Multiplicacao();
				mult.setNum1(num1);
				mult.setNum2(num2);
				resultado = mult.calculaMultiplicacao();
				break;
			case 4:
				while (num2 == 0) {
					num2 = EntradaSaida.solicitaNumero("2º");
				}
				Divisao divi = new Divisao();
				divi.setNum1(num1);
				divi.setNum2(num2);
				resultado = divi.calculaDivisao();
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
