package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DataJava5 {
	
	public static void main(String[] args) throws ParseException {
		
		/* Calculo de Dia, Ano e Mês com o objeto Calendar */
		
		Calendar calendar = Calendar.getInstance(); /* Pega a data atual */
		
		/*Simulando que a data vem do banco de dados */
		
		calendar.setTime(new SimpleDateFormat("dd-MM-yyyy").parse("10-03-2021")); /* Definindo uma data qualquer */
		
		calendar.add(Calendar.DAY_OF_MONTH, 5); //aumentando dias do mes
		
		System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
		calendar.add(Calendar.DAY_OF_WEEK, 3); //aumentando dias da semana
		
		System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
		calendar.add(Calendar.DAY_OF_MONTH, 40); //Data de hoje mais 40 dias
		
		System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
		calendar.add(Calendar.MONTH, 1); //Somando mês
		
		System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
		calendar.add(Calendar.DAY_OF_MONTH, -40); //Subtraindo 40 dias do mês
		
		System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
		calendar.add(Calendar.YEAR, 1); //Somando ano
		
		System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
		
		
		
		
	}

}
