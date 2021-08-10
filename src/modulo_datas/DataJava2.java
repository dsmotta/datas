package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataJava2 {
	
	public static void main(String[] args) throws ParseException {
		
		/* Formatando datas com SimpleDateFormat */
		
		Date data = new Date();
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy"); // para banao cde Dados usa "yyyy-MM-dd"
		System.out.println("Data em formato padrão em String: " + simpleDateFormat.format(data));
		
		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("Data em formato para Banco Dados: " + simpleDateFormat.format(data));
		
		simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm.ss");
		System.out.println("Data em formato padrão em String com hora min e seg: " + simpleDateFormat.format(data));
		
		simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Converte String em objeto Date: " + simpleDateFormat.parse("05/08/1980"));
		
		
		
		
		
	}

}
