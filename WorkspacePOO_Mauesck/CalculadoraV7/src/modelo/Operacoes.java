package modelo;


/*	Informação: O comando "implements" está implementando a interface "IOperacao" como as classes de operacões faziam na V5. Como a classe "Operacoes" é 
abstrata, não há a necessidade de que ela contenha todos s metodos da interface. Como o metodo "Calcula()" terá uma implementação diferente para cada
classe, ele será implementado em cada uma das classes de operações */

public abstract class Operacoes implements IOperacao {
	
	protected double num1;
	protected double num2;
	
	public double getNum1() {
		return this.num1;
	}
	
	public void setNum1(double num1) {
		this.num1=num1;
	}
	
	public double getNum2() {
		return this.num2;
	}

	public void setNum2(double num2) {
		this.num2=num2;
	}
}