package model.estrutura;

import model.estrutura.No;
import java.lang.Exception;

public class ListaEncadeadaSimples<T>{
	private No<T> inicio = null;
		
	public void append(int num){
		No<T> buffer = new No(num);
		
		if(this.inicio == null){
			this.inicio = buffer;
		}else{
			this.last().setProximo(buffer);
		}
	}
	
	
	public int getElemento(int num)throws IllegalArgumentException{
		int index = 0;
		
		if(this.inicio == null){
			throw new IllegalArgumentException("Não há números nessa lista");
		}
		
		No<T> buffer = this.inicio;
		
		while(buffer != null){
			if(buffer.getNum() == num){
				return index;
			}
			index++;
			buffer = buffer.getProximo();
		}
		
		throw new IllegalArgumentException("Nao elementos com esse valor!");
	}
	
	public No<T> get(int index) throws IllegalArgumentException{
		int i = 0;

		if(this.inicio == null){
			throw new IllegalArgumentException("Não existe item na lista.");
		}

		No<T> buffer = this.inicio;
		
		for(i = 0; i < index; i++){
			if(buffer.getProximo() == null){
				break;
			}
			buffer = buffer.getProximo();
		}

		if(i < index){
			throw new IllegalArgumentException("O índice informado não existe");

		
		}
		return buffer;
	}
	
	public No<T> last() throws IllegalArgumentException{
		if(this.inicio == null){
			throw new IllegalArgumentException("Não existe itens na lista.");
		}

		No<T> buffer = this.inicio;
		while(buffer.getProximo() != null){
			buffer = buffer.getProximo();
		}

		return buffer;
	}

	public void inserirOrdenado(int num){
		No<T> novoNo = new No(num);

		if(this.inicio == null){
			this.inicio = novoNo;
			return;
		}
		
		if(num < this.inicio.getNum()){
			novoNo.setProximo(this.inicio);
			this.inicio = novoNo;
			return;
		}
		
		No<T> bufferAtual = this.inicio;

		while(bufferAtual.getProximo() != null && bufferAtual.getProximo().getNum() < num){
			bufferAtual = bufferAtual.getProximo();
		}

		novoNo.setProximo(bufferAtual.getProximo());
		bufferAtual.setProximo(novoNo);

	}

	public void remove(int index){
		if(index == 0){
			
			if(this.inicio.getProximo() == null){
				this.inicio = null;
			}else{
				No<T> buffer = this.inicio.getProximo();
				this.inicio.setProximo(null);
				this.inicio = buffer;
			}

			return;
		}
		No<T> buffer_anterior = this.get(index - 1);
		No<T> item = buffer_anterior.getProximo();
		No<T> buffer_proximo = item.getProximo();
		buffer_anterior.setProximo(buffer_proximo);
		item.setProximo(null);
	}

	public int total(){
		if(this.inicio == null){
			return 0;
		}

		No<T> buffer = this.inicio;
		int total_elementos = 0;

		do{
			total_elementos++;
			buffer = buffer.getProximo();
		}while(buffer != null);
		
		return total_elementos;
	}

	public int[] toArray()throws IllegalArgumentException{
		if(this.inicio == null){
			throw new IllegalArgumentException("Não há elementos na lista!");
		}

		int[] arrayLista = new int[total()];

		No<T> bufferAtual = this.inicio;
		int i = 0;

		while(bufferAtual != null){
			arrayLista[i] = bufferAtual.getNum();
			i++;
			bufferAtual = bufferAtual.getProximo();
		}

		return arrayLista;
	}

	@Override
	public String toString(){
		if(this.inicio == null){
			return "[]";
		}

		StringBuilder builder = new StringBuilder("[");
		No<T> buffer = this.inicio;
		builder.append(buffer.getNum());
		while(buffer.getProximo() != null){
			builder.append(",");
			buffer = buffer.getProximo();
			builder.append(buffer.getNum());
		}
		builder.append("]");
		return builder.toString();
	}
}