package modulo_datas;

import java.time.LocalDate;
import java.time.Period;

public class DataJava11 {
	
	public static void main(String[] args) {
		
		/* Comparando datas usando API do Java */
		
		LocalDate dataAntiga = LocalDate.of(2019, 2, 7);
		//LocalDate dataAntiga = LocalDate.parse("2019-2-7"); // mais usado em forma de String
		
		LocalDate dataNova = LocalDate.of(2021, 7, 4);
		//LocalDate dataNova = LocalDate.parse("2021-7-4"); // mais usado em forma de String
		
		System.out.println("Data antiga é posterior (maior) que a data nova: " + dataAntiga.isAfter(dataNova));
		
		System.out.println("Data antiga é anterior (menor) que a data nova " + dataAntiga.isBefore(dataNova));
		
		System.out.println("Datas são iguais: " + dataAntiga.isEqual(dataNova));
		
		
		/* Faixa de tempo com Objeto Period */
		
		Period periodo = Period.between(dataAntiga, dataNova);
		
		System.out.println("Quantos dias: " + periodo.getDays()); //são necessários dias, meses e anos para montar o periodo
		
		System.out.println("Quantos meses: " + periodo.getMonths()); //são necessários dias, meses e anos para montar o periodo
		
		System.out.println("Quantos anos: " + periodo.getYears()); //são necessários dias, meses e anos para montar o periodo
		
		//obtendo dias, meses e anos entre as datas podemos montar o periodo
		System.out.println("Período entre as datas: " + periodo.getYears() + " Anos " + periodo.getMonths() + " Meses " + periodo.getDays() + " Dias" );
		
		//soma dos ttais entre as datas 
		System.out.println("Total de meses: " + periodo.toTotalMonths()); //soma o total de meses no periodo 
		
		
		
	}

}
