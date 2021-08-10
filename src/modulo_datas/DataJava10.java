package modulo_datas;

import java.time.Duration;
import java.time.Instant;

public class DataJava10 {
	
	public static void main(String[] args) throws InterruptedException {
		
		/* Tempo que um processo leva para ser executado usnado o Instant */
		
		Instant inicio = Instant.now();
		
		Thread.sleep(2000);
		
		Instant ifinal = Instant.now();
		
		Duration duracao = Duration.between(inicio, ifinal);
		
		System.out.println("Duração em nano segundos: " + duracao.toNanos());
		
		System.out.println("Duração em minutos: " + duracao.toMinutes());
		
		System.out.println("Duração em horas: " + duracao.toHours());
		
		System.out.println("Duração em milisegundos: " + duracao.toMillis());
		
		
	}

}
