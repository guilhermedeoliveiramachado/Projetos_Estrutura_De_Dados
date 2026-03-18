package model.estrutura;

import java.lang.Exception;
import model.estrutura.NoPessoa;

public class ListaSimplesEstrutura<T>{
	private NoPessoa<T> inicio = null;

	//Adicionar pessoa
	public void addPessoa(String elemento){
		NoPessoa<T> novaNoPessoa = new NoPessoa(elemento);
		if(inicio == null){
			this.inicio = novaNoPessoa;
		}else{
			ordenar(novaNoPessoa);
		}
	}

	public void ordenar(NoPessoa<T> buffer){
		if(this.inicio.getValor().compareTo(buffer.getValor()) > 0){
			buffer.setProximo(this.inicio);
			this.inicio = buffer;
			return;
		}
		
		NoPessoa<T> bufferAtual = this.inicio;

		while(bufferAtual.getProximo() != null && bufferAtual.getProximo().getValor().compareTo(buffer.getValor()) > 0){
			bufferAtual = bufferAtual.getProximo();
		}
		
		buffer.setProximo(bufferAtual.getProximo());
		bufferAtual.setProximo(buffer);
	}

	public int procurarPessoa(String valor)throws IllegalArgumentException{
		if(this.inicio == null){
			throw new IllegalArgumentException("Não há elementos na lista!");
		}
		
		int index = 0;
		
		if(this.inicio.getValor().equalsIgnoreCase(valor)){
			return index;
		}

		NoPessoa<T> buffer = this.inicio;

		do{
			if(buffer.getValor().equalsIgnoreCase(valor)){
				return index;
			}

			buffer = buffer.getProximo();
			index++;
		}while(buffer != null);
		throw new IllegalArgumentException("Não um elemento com esse nome!");
	}

	public int getTotal(){
		if(this.inicio == null){
			return 0;
		}

		NoPessoa<T> buffer = this.inicio;
		int total_elementos = 0;

		do{
			total_elementos++;
			buffer = buffer.getProximo();
		}while(buffer != null);

		return total_elementos;
	}

	public int getIndex(String valor)throws IllegalArgumentException{
		if(this.inicio == null){
			throw new IllegalArgumentException("Não há nomes nessa lista");
		}

		int index = 0;
		NoPessoa<T> buffer = this.inicio;

		while(buffer !=null){
			if(buffer.getValor().equalsIgnoreCase(valor)){
				return index;
			}
			index++;
			buffer = buffer.getProximo();
		}
		throw new IllegalArgumentException("Item não encontrado");
	}

	public NoPessoa<T> getNo(int index)throws IllegalArgumentException{
		int i = 0;

		if(this.inicio == null){
			throw new IllegalArgumentException("Não existe item na lista.");
		}

		NoPessoa<T> buffer = this.inicio;
		
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

	public void remover(String valor)throws IllegalArgumentException{
		if(getTotal() == 0){
			throw new IllegalArgumentException("Não há elementos na lista para remover!");
		}
	
		while(this.inicio != null && this.inicio.getValor().equalsIgnoreCase(valor)){
			this.inicio = this.inicio.getProximo();
		}

		NoPessoa<T> atual = this.inicio;
		NoPessoa<T> anterior = null;

		while(atual != null){
			if(atual.getValor().equalsIgnoreCase(valor)){
				anterior.setProximo(atual.getProximo());
			}else{
				anterior = atual;
			}

			atual = atual.getProximo();
		}
	}

	public String toString(){
        if(this.inicio == null){
            return "[]";
        }

        StringBuilder builder = new StringBuilder("[");
        NoPessoa<T> buffer = this.inicio;
        
        builder.append(buffer.getValor());
        while(buffer.getProximo() != null){
            builder.append(", ");
            buffer = buffer.getProximo();
            builder.append(buffer.getValor());
        }

        builder.append("]");
        return builder.toString();
    }
	
}