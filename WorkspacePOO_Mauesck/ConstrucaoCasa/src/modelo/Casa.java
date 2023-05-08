package modelo;

import java.util.ArrayList;

/*Diferentemente das classes Porta e Janela a classe Casa possui atributos 
especificos dos quais não partilham outras classes tornando inviável a herança.*/
public class Casa {
	
	//OT9.3
	private String descricao;
	private String cor;
	//Atributo: Modificador > Tipo > Nome-Atributo = Construtor
	private ArrayList<Aberturas> listaDePortas = new ArrayList<Aberturas>();
	private ArrayList<Aberturas> listaDeJanelas = new ArrayList<Aberturas>();
	
	//Há um getter e um setter para cada um dos atributos acima.
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public ArrayList<Aberturas> getListaDePortas(){
		return listaDePortas;
	}
	public void setListaDePortas(ArrayList<Aberturas> listaDePortas) {
		this.listaDePortas = listaDePortas;
	}
	public ArrayList<Aberturas> getListaDeJanelas(){
		return listaDeJanelas;
	}
	public void setListaDeJanelas(ArrayList<Aberturas> listaDeJanelas) {
		this.listaDeJanelas = listaDeJanelas;
	}
	
	//OT9.9
	public void constroiCasa(String descricao, String cor, ArrayList<Aberturas> listaDePortas,
			ArrayList<Aberturas> listaDeJanelas) {
		setDescricao(descricao);
		setCor(cor);
		setListaDePortas(listaDePortas);
		setListaDeJanelas(listaDeJanelas);
	}
	
	//OT10.5
	public Aberturas retornaAbertura(int posicao, String tipoAbertura) {
		if(tipoAbertura.equals("porta")) {
			return this.listaDePortas.get(posicao);
		}else {
			return this.listaDeJanelas.get(posicao);
		}
	}
	
	//OT10.6
	public void moverAbertura(Aberturas abertura, int novoEstado) {
		abertura.setEstado(novoEstado);
	}
}
