package model.estrutura;

public class NoPessoa<T>{
	private String valor;
	private NoPessoa<T> proximo;

	public NoPessoa(String valor){
		this.valor = valor;
		this.proximo = null;
	}

	public void setValor(String valor){
		this.valor = valor;
	}

	public String getValor(){
		return this.valor;
	}

	public void setProximo(NoPessoa<T> proximo){
		this.proximo = proximo;
	}

	public NoPessoa<T> getProximo(){
		return this.proximo;
	}

	@Override
	public String toString(){
		return this.valor.toString();
	}
}