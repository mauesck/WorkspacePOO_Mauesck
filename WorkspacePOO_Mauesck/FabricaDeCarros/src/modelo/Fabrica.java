package modelo;

import java.util.ArrayList;

public class Fabrica {

	private ArrayList<Carro> listaDeCarros = new ArrayList<Carro>();

	public ArrayList<Carro> getListaDeCarros() {
		return listaDeCarros;
	}

	public void setListaDeCarros(ArrayList<Carro> listaDeCarros) {
		this.listaDeCarros = listaDeCarros;
	}

	public void venderCarro(int posicao, ArrayList<Carro> listaDeCarros) {
		if (posicao != -1) {
			listaDeCarros.remove(posicao);
			setListaDeCarros(listaDeCarros);
		}
	}

	public void fabricarCarro(ArrayList<Carro> listaDeCarros, ArrayList<Carro> teste) {
		setListaDeCarros(listaDeCarros);
	}

	public String geraInfoCarros() {
		String informacoes = "";
		if (this.listaDeCarros != null) {
			for (Carro carro : this.listaDeCarros) {
				informacoes += carro.getNome() + " " + carro.getModelo() + " " + carro.getCor() + "\n";
			}
		}
		return informacoes;
	}

}
