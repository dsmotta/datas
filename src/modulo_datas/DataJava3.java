package modulo_datas;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DataJava3 {
	
	public static void main(String[] args) {
		
		/* Usando o objeto Calendar */
		
		Calendar calendar = Calendar.getInstance(); //pegando a data atual
		
		System.out.println("Data atual: " + calendar.getTime());
		
		System.out.println("Calendar em milisegundos: " + calendar.get(Calendar.MILLISECOND));
		
		System.out.println("Dia do mês: " + calendar.get(Calendar.DAY_OF_MONTH));
		
		System.out.println("Dia da semana: " + calendar.get(Calendar.DAY_OF_WEEK));
		
		System.out.println("Hora do dia: " + calendar.get(Calendar.HOUR_OF_DAY));
		
		System.out.println("Minuto da hora: " + calendar.get(Calendar.MINUTE));
		
		System.out.println("Segundos da hora: " + calendar.get(Calendar.SECOND));
		
		System.out.println("Ano: " + calendar.get(Calendar.YEAR));
		
		/* Usando Objeto Calendar com formatacao */
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Data atual formatada: " + simpleDateFormat.format(calendar.getTime()));
		
		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("Data atual formatada para Banco Dados: " + simpleDateFormat.format(calendar.getTime()));
				
				
				
	}

}
