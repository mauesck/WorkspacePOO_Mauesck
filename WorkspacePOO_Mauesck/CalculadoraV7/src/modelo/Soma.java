package modelo;

//"extends" significa que a classe Soma está herdando da classe Operacoes
public class Soma extends Operacoes {

	public double calcula() {
		double soma = num1 + num2;
		return soma;
	}
}
