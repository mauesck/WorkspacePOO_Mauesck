package modelo;

import java.util.ArrayList;

import javax.swing.JOptionPane;

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

	public void sacar(ArrayList<Movimentacao> listaDeMovimentacao, double saldo) {
		setListaDeMovimentacao(listaDeMovimentacao);
		setSaldo(this.saldo - saldo);
	}

	public String gerarSaldo() {
		String saldo = "Saldo da conta: R$" + this.saldo;
		return saldo;
	}

	public String gerarDadosDaConta() {
		String dados = "Titular: " + this.titularDaConta + "\n Tipo da conta: " + this.tipo + "\n Saldo: R$"
				+ this.saldo;
		return dados;
	}

	public String gerarExtrato() {
		String tipoConta;
		if (this.tipo == 1) {
			tipoConta = "Conta Poupança";
		} else {
			tipoConta = "Conta Corrente";
		}

		String informacoes = titularDaConta + "\n" + tipoConta + "\n" + "\n";
		String tipoMovimentacao;
		for (Movimentacao movimentacao : this.listaDeMovimentacao) {
			if (movimentacao.getTipo() == 1) {
				tipoMovimentacao = "Depósito";
			} else {
				tipoMovimentacao = "Saque";
			}
			informacoes += tipoMovimentacao + " - Data: " + movimentacao.getData() + " - Valor R$: "
					+ movimentacao.getValor() + "\n";
		}
		return informacoes;
	}

	public String gerarExtratoDepositos() {
		String tipoConta;
		if (this.tipo == 1) {
			tipoConta = "Conta Poupança";
		} else {
			tipoConta = "Conta Corrente";
		}

		String informacoes = titularDaConta + "\n" + tipoConta + "\n" + "\n" + "Depósitos: \n" + "\n";
		for (Movimentacao movimentacao : this.listaDeMovimentacao) {
			if (movimentacao.getTipo() == 1) {
				informacoes += "Data: " + movimentacao.getData() + " - Valor R$: " + movimentacao.getValor() + "\n";
			}
		}
		return informacoes;
	}

	public String gerarExtratoSaques() {
		String tipoConta;
		if (this.tipo == 1) {
			tipoConta = "Conta Poupança";
		} else {
			tipoConta = "Conta Corrente";
		}

		String informacoes = titularDaConta + "\n" + tipoConta + "\n" + "\n" + "Saques: \n" + "\n";
		for (Movimentacao movimentacao : this.listaDeMovimentacao) {
			if (movimentacao.getTipo() == 2) {
				informacoes += "Data: " + movimentacao.getData() + " - Valor R$: " + movimentacao.getValor() + "\n";
			}
		}
		return informacoes;
	}
}
