package modulo_datas;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DataJava4 {
	
	public static void main(String[] args) throws ParseException {
		
		/* Comparando Datas */
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		Date dataVencimento = simpleDateFormat.parse("10/04/2021");
		
		Date dataAtual = simpleDateFormat.parse("07/04/2021");
		
		//after : se data 1 é maior que data 2
		//before : se data 1 é menor que data 2 
		
		if(dataVencimento.after(dataAtual)) { //data de vencimento passou ou é depois ou é maior da data atual
			
			System.out.println("Boleto não vencido!");
			
		}else {
			
			System.out.println("Boleto vencido! URGENTE!");
		}
		
		if(dataVencimento.before(dataAtual)) { //data de vencimento não passou ou é antes ou é menor que a data atual
			
			System.out.println("Boleto vencido! URGENTE!");
			
		}else {
			
			System.out.println("Boleto não vencido!");
		}
		
		
		
	}

}
