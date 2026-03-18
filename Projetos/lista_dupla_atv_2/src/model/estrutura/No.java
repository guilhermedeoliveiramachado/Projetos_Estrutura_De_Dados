package model.estrutura;

public class No<T>{
	private String valor;
	private No<T> proximo;
	private No<T> anterior;

	public No(String valor){
		this.valor = valor;
		this.proximo = null;
		this.anterior = null;
	}

	public String getValor(){
		return this.valor;
	}

	public void setValor(String valor){
		this.valor = valor;
	}

	public No<T> getProximo(){
		return this.proximo;
	}

	public void setProximo(No<T> proximo){
		this.proximo = proximo;
	}

	public No<T> getAnterior(){
		return this.anterior;
	}

	public void setAnterior(No<T> anterior){
		this.anterior = anterior;
	}

	@Override
	public String toString(){
		return this.valor.toString();
	}
}