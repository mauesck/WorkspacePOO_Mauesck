package modelo;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Conta {
	private String titularDaConta;
	private int tipo; // 1-conta poupança, 2-conta corrente
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

	public void depositar(ArrayList<Movimentacao> listaDeMovimentacao, double saldo) {
		setListaDeMovimentacao(listaDeMovimentacao);
		setSaldo(this.saldo + saldo);
	}

	public void sacar(ArrayList<Movimentacao> listaDeMovimentacao, double saque) {
		setListaDeMovimentacao(listaDeMovimentacao);
		setSaldo(this.saldo - saque);
	}

	public String gerarSaldo() {
		String saldo = "Saldo da conta: " + this.saldo;
		return saldo;
	}

	public String gerarDadosDaConta() {
		String dados = "Titular: " + this.titularDaConta + "\n Tipo da conta: " + this.tipo + "\n Saldo: " + this.saldo;
		return dados;
	}

	public String gerarExtrato() {
		String informacoes = "";
		if (this.listaDeMovimentacao != null) {
			Movimentacao movimentacao = new Movimentacao();
			for (int i = 0; i<listaDeMovimentacao.size(); i++) {
				informacoes += "Tipo: " + movimentacao.getTipo() + " Data: " + movimentacao.getData() + " Valor: "
						+ movimentacao.getValor() + "\n";
			}
		}
		return informacoes;
	}

	public double gerarExtratoDepositos() {
		return 0;

	}

	public double gerarExtratoSaques() {
		return 0;

	}
}
