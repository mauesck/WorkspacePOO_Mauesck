<<<<<<<< HEAD:WorkspacePOO_Mauesck/CalculadoraV6/src/CalculadoraV6/Principal.java
package CalculadoraV6;
========
package Classes;
>>>>>>>> 64e5328eac68664187289aaad28c6bb3b31670b3:WorkspacePOO_Mauesck/CalculadoraV5/src/Classes/Principal.java

import javax.swing.JOptionPane;

public class Principal {

<<<<<<<< HEAD:WorkspacePOO_Mauesck/CalculadoraV6/src/CalculadoraV6/Principal.java
	public static void main(String[] args) {
		int continuar;
		double resultado = 0;
		
		//Objeto oper sendo iniciado (instânciado) nullo.
		Operacoes oper = null;
		
========
	// private static Operacoes oper = new Operacoes();

	public static void main(String[] args) {
		int continuar;
		double resultado = 0;

>>>>>>>> 64e5328eac68664187289aaad28c6bb3b31670b3:WorkspacePOO_Mauesck/CalculadoraV5/src/Classes/Principal.java
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
<<<<<<<< HEAD:WorkspacePOO_Mauesck/CalculadoraV6/src/CalculadoraV6/Principal.java
				// Instância de Operacões com o metodo construtor da operação em questão. Objeto assumindo uma forma.
				oper = new Soma();
				break;
			case 2:
				oper = new Subtracao();
				break;
			case 3:
				oper = new Multiplicacao();
========
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
>>>>>>>> 64e5328eac68664187289aaad28c6bb3b31670b3:WorkspacePOO_Mauesck/CalculadoraV5/src/Classes/Principal.java
				break;
			case 4:
				while (num2 == 0) {
					num2 = EntradaSaida.solicitaNumero("2º");
				}
<<<<<<<< HEAD:WorkspacePOO_Mauesck/CalculadoraV6/src/CalculadoraV6/Principal.java
				oper = new Divisao();
========
				Divisao divi = new Divisao();
				divi.setNum1(num1);
				divi.setNum2(num2);
				resultado = divi.calcula();
>>>>>>>> 64e5328eac68664187289aaad28c6bb3b31670b3:WorkspacePOO_Mauesck/CalculadoraV5/src/Classes/Principal.java
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
