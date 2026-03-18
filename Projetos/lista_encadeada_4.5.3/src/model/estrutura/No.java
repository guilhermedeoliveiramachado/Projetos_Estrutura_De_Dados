package model.estrutura;

public class No<T> {
	private int num;
	private No<T> proximo;

	public No(int num){
		this.proximo = null;
		this.num = num;
	}
	
	public No(int num, No<T> proximo){
		this.proximo = proximo;
		this.num = num;
	}
	
	public int getNum(){
		return this.num;
	}

	public void setNum(int num){
		this.num = num;
	}

	public No<T> getProximo(){
		return this.proximo;
	}

	public void setProximo(No<T> proximo){
		this.proximo = proximo;
	}
}