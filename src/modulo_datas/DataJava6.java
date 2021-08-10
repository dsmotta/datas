package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DataJava6 {
	
	public static void main(String[] args) throws ParseException {
		
		/* Faixa de tempo com ChronoUnit */
		
		long dias = ChronoUnit.DAYS.between(LocalDate.parse("2020-02-01"), LocalDate.now()); //total de dias entre a data e a data atual
		
		System.out.println("Possui " + dias + " dias entre a faixa de data");
		
		long mes = ChronoUnit.MONTHS.between(LocalDate.parse("2020-02-01"), LocalDate.now());// total de Meses entre a data e a data atual
		
		System.out.println("Possui " + mes + " meses entre a faixa de data");
		
		long decadas = ChronoUnit.DECADES.between(LocalDate.parse("2020-02-01"), LocalDate.now());// total de Meses entre a data e a data atual
		
		System.out.println("Possui " + decadas + " decadas entre a faixa de data");
		
		
		
	}

}
