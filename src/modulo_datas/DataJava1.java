package modulo_datas;

import java.util.Date;

public class DataJava1 {
	
	public static void main(String[] args) {
		
		/* Usando o objeto Date */
		
		Date date = new Date();
		
		System.out.println("Data em milisegundos: " + date.getTime());
		
		System.out.println("Dia do mês: " + date.getMonth());
		
		System.out.println("Dia da semana: " + date.getDay());
		
		System.out.println("Hora do dia: " + date.getHours());
		
		System.out.println("Minuto da hora: " + date.getMinutes());
		
		System.out.println("Segundos: " + date.getSeconds());
		
		System.out.println("Ano: " + (date.getYear() + 1900)); // subtrai o ano atual de 1900 entao devemos pegar o resultado e somar 1900
		
		
		
		
	}

}
