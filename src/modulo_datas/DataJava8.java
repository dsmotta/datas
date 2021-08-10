package modulo_datas;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DataJava8 {
	
	public static void main(String[] args) {
		
		/* Nova API de Data e Hora do Java a partir do Java 8 */
		
		LocalDate dataAtual = LocalDate.now();
		
		System.out.println("Data atual: " + dataAtual);

		LocalTime horaAtual = LocalTime.now();
		
		System.out.println("Hora atual: " + horaAtual);
		
		LocalDateTime dataAtualhoraAtual = LocalDateTime.now();
		
		System.out.println("Data e hora atual: " + dataAtualhoraAtual);
		
		/* Usando formatador */
		
		System.out.println("Data atual: " + dataAtualhoraAtual.format(DateTimeFormatter.ISO_DATE));
		
		System.out.println("Hora atual: " + dataAtualhoraAtual.format(DateTimeFormatter.ISO_TIME));
		
		System.out.println("Data atual formato padrão: " + dataAtualhoraAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println("Data e hora atual formato padrão: " + dataAtualhoraAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm.ss")));
		
		
		
		
	}

}
