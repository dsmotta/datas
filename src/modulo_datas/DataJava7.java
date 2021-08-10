package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DataJava7 {
	
	public static void main(String[] args) throws ParseException {
		
		/* Criando parcelas mensais e suas respectivas datas */
		
		Date dataInicial = new SimpleDateFormat("dd/MM/yyyy").parse("08/04/2021"); //cria uma data ja formatada
		
		Calendar calendar = Calendar.getInstance();
		
		calendar.setTime(dataInicial); // seta a variavel calendar do tipo Calendar com o valor da data inicial e já formatada
		
		for (int parcela=1; parcela <= 12; parcela++) {
			
			calendar.add(Calendar.MONTH, 1);
			
			System.out.println("Parcela " + parcela + " vencimento " + new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));
		}
		
		
	}

}
