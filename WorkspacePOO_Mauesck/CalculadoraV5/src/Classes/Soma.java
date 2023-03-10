package Classes;

import Interfaces.IOperacao;

public class Soma implements IOperacao {

	// Atributos privados da Classe.
	private double num1;
	private double num2;

	// Getter para acessar e guardar o atributo.
	public double getNum1() {
		return num1;
	}

	// Setter para definir os valores.
	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}

	public double calcula() {
		double soma = num1 + num2;
		return soma;
	}
}
