package modulo_datas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataJava9 {
	
	public static void main(String[] args) {
		
		/* Descobrindo Dia, Meses, Anos e Semanas usando a nova API do Java */
		
		LocalDate localDate = LocalDate.now();
		
		System.out.println("Data atual :" + localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println("Dia da semana :" + localDate.getDayOfWeek()); // retorna o nome do dia da semana
		
		System.out.println("Dia da semana :" + localDate.getDayOfWeek().ordinal()); // retorna o numero de referência do dia da semana começãndo no zero
		
		System.out.println("Dia do mês :" + localDate.getDayOfMonth()); // retorna  dia do mês
		
		System.out.println("Dia do ano :" + localDate.getDayOfYear()); // retorna  dia do ano
		
		System.out.println("Valor do Mês :" + localDate.getMonthValue()); 
		
		System.out.println("Mês :" + localDate.getMonth()); 
		
		System.out.println("Ano :" + localDate.getYear()); 
		
		
		
		
	}

}
