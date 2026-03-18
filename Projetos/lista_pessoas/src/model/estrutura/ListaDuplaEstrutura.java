package model.estrutura;

import model.estrutura.NoLetras;
import model.estrutura.NoPessoa;
import model.estrutura.ListaSimplesEstrutura;


public class ListaDuplaEstrutura<T>{
    private NoLetras<T> inicio = null;
    private NoLetras<T> fim = null;

    //Adicionar letra
    public void addLetra(String letra){
        NoLetras<T> buffer = new NoLetras<>(letra);

        if(this.inicio == null){
            this.fim = buffer;
            this.inicio = buffer;
        }else{
            ordenar(buffer);
        }
    }

    public void ordenar(NoLetras<T> buffer){
        if(this.inicio.getLetra().compareTo(buffer.getLetra()) > 0){
            buffer.setProximo(this.inicio);
            this.inicio = buffer;
            return;
        }
        NoLetras<T> bufferAtual = this.inicio;

        while(bufferAtual != null){
            if(bufferAtual.getProximo() != null && bufferAtual.getProximo().getLetra().compareTo(buffer.getLetra())>0){
                NoLetras<T> ex_inicio = bufferAtual;
                NoLetras<T> ex_ultimo = bufferAtual.getProximo();
                ex_inicio.setProximo(buffer);
                buffer.setProximo(ex_ultimo);
                ex_ultimo.setAnterior(buffer);
                buffer.setAnterior(ex_inicio);

                if(bufferAtual.getAnterior() == null){
                    this.inicio = ex_inicio;
                }

                break;
            }

            if(bufferAtual.getProximo() == null){
                bufferAtual.setProximo(buffer);
                buffer.setAnterior(bufferAtual);
                this.fim = buffer;
                break;
            }

            bufferAtual = bufferAtual.getProximo();
        }
    }

    public int index(String letra)throws IllegalArgumentException{
        if(this.inicio == null){
            throw new IllegalArgumentException("Não há elementos na lista");
        }
        int index = 0;

        if(this.inicio.getLetra().equalsIgnoreCase(letra)){
            return index;
        }

        NoLetras<T> buffer = this.inicio;

        do{
            if(buffer.getLetra().equalsIgnoreCase(letra)){
                return index;
            }
            buffer = buffer.getProximo();
            index++;
        }while(buffer != null);

        throw new IllegalArgumentException("Elemento não econtrado");

    }

    public NoLetras<T> getNo(int index){
        int i = 0;

        if(this.inicio == null){
            throw new IllegalArgumentException("Não há elementos na lista");
        }

        NoLetras<T> buffer = this.inicio;
        for(i=0; i < index; i++){
            if(buffer.getProximo() == null){
                break;
            }
            buffer = buffer.getProximo();
        }

        if(i < index){
            throw new IllegalArgumentException("Índice não encontrado!");
        }

		return buffer;
    }
    //Adicionar a lista de nomes
    public void addPessoa(String nome){
        String letra = nome.substring(0, 1).toUpperCase();
        NoLetras<T> atual = inicio;

        while(atual != null && !atual.getLetra().equalsIgnoreCase(letra)){
                atual = atual.getProximo();
        }

        if(atual == null){
            addLetra(letra);
            int index = index(letra);
            atual = getNo(index);
        }

        atual.getValor().addPessoa(nome);
    }

    public int getTotal(){
		if(this.inicio == null){
			return 0;
		}

		NoLetras<T> buffer = this.inicio;
		int total_elementos = 0;
		
		do{
			total_elementos++;
			buffer = buffer.getProximo();
		}while(buffer != null);

		return total_elementos;
	}

    //Remover o nó
    public void remove(String letra)throws IllegalArgumentException{
		if(getTotal() == 0){
			throw new IllegalArgumentException("Não há elementos na lista para remover!");
		}

		if(this.inicio.getLetra().equalsIgnoreCase(letra)){
            this.inicio.setValor(null);
            this.inicio.setAnterior(null);
            if(this.inicio.getProximo() == null){
                this.inicio = null;
                this.fim = null;
            }else{
                NoLetras<T> buffer = this.inicio.getProximo();
                NoLetras<T> anterior = this.inicio.getAnterior();
                this.inicio.setProximo(null);
                this.inicio = buffer;
            }
            return;
		}

        int index = index(letra);
        NoLetras<T> anterior = getNo(index-1);
        NoLetras<T> item = anterior.getProximo();
        NoLetras<T> proximo = item.getProximo();
        anterior.setProximo(proximo);
        item.setProximo(null);
        item.setValor(null);
        
    }

    public void removerElementoLista(String nome)throws IllegalArgumentException{
        if(getTotal() == 0){
			throw new IllegalArgumentException("Não há elementos na lista para remover!");
		}

        String letra = nome.substring(0, 1).toUpperCase();
        NoLetras<T> atual = this.inicio;

        while(atual != null && !atual.getLetra().equalsIgnoreCase(letra)){
                atual = atual.getProximo();
        }

        if(atual == null){
            throw new IllegalArgumentException("Não existe nenhum elemento com essa letra!");
        }else{
            atual.getValor().remover(nome);
        
            if(atual.getValor().getTotal()==0){
                remove(letra);
            }
        }
        
        
    }

    public String toString(){
        if(this.inicio == null){
            return "[]";
        }

        StringBuilder builder = new StringBuilder("[");
        NoLetras<T> buffer = this.inicio;
        
        builder.append(buffer.getLetra()+" - "+buffer.getValor().toString());
        while(buffer.getProximo() != null){
            builder.append("\n");
            buffer = buffer.getProximo();
            builder.append(buffer.getLetra()+" - "+buffer.getValor().toString());
        }
        builder.append("\n]");
        return builder.toString();
    }
}