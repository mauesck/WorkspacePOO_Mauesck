package modelo;

import java.util.ArrayList;

public class Conta {
	private String titularDaConta;
	private int tipo; //1-conta poupança, 2-conta corrente
	private double saldo;
	private ArrayList<Movimentacao> listaDeMovimentacao = new ArrayList<Movimentacao>();

	public String getTitularDaConta() {
		return titularDaConta;
	}
	
	public void setTitularDaConta(String titularDaConta) {
		this.titularDaConta = titularDaConta;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public ArrayList<Movimentacao> getListaDeMovimentacao() {
		return listaDeMovimentacao;
	}

	public void setListaDeMovimentacao(ArrayList<Movimentacao> listaDeMovimentacao) {
		this.listaDeMovimentacao = listaDeMovimentacao;
	}

	public double depositar() {
		return 0;

	}

	public double sacar() {
		return 0;

	}

	public double gerarSaldo() {
		return 0;

	}

	public double gerarDadosDaConta() {
		return 0;

	}

	public double gerarExtrato() {
		return 0;

	}

	public double gerarExtratoDepositos() {
		return 0;

	}

	public double gerarExtratoSaques() {
		return 0;

	}
}
