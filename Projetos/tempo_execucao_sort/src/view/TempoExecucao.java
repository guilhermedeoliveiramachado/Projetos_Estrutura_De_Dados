package view;

import controller.TempoController;
import java.util.Random;

public class TempoExecucao{
	public static void main(String[] args){
		TempoController tempo = new TempoController();
		Random random = new Random();
		int[] vetor = new int[1500];
		long tempoMerge, tempoBubble, tempoQuick;

		for(int i = 0; i < vetor.length; i++){
			vetor[i] = random.nextInt(1500);
		}

		tempoMerge = tempo.calcular_tempo_merge(vetor);
		tempoBubble = tempo.calcular_tempo_bubble(vetor);
		tempoQuick = tempo.calcular_tempo_quick(vetor);

		System.out.println("Tempo de execução do Merge: "+tempoMerge+" ms");
		System.out.println("Tempo de execução do Bubble: "+tempoBubble+" ms");
		System.out.println("Tempo de execução do Quick: "+tempoQuick+" ms");
		
	}
}