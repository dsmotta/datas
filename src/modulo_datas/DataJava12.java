package modulo_datas;

import java.time.LocalDate;

public class DataJava12 {
	
	public static void main(String[] args) {
		
		/* Data, Anos, Dias, Meses e Parcelas usando API do Java LocalDate */
		
		LocalDate dataBase = LocalDate.parse("2019-10-05");
		
		System.out.println("Adcionando + 5 dias: " + (dataBase = dataBase.plusDays(5)));
		
		System.out.println("Adcionando + 5 semanas: " + (dataBase = dataBase.plusWeeks(5)));
		
		System.out.println("Adcionando + 5 anos: " + (dataBase = dataBase.plusYears(5)));
		
		System.out.println("Adcionando + 2 meses: " + (dataBase =dataBase.plusYears(2)));
		
		System.out.println("Subtraindo -1 ano: " + (dataBase = dataBase.minusYears(1))); //podemos subtrair meio mais ultilizado
		//System.out.println("Subtraindo -1 ano: " + (dataBase = dataBase.plusYears(-1))); //tambem pode ser usado 
		
		System.out.println("Subtraindo -1 mes: " + (dataBase = dataBase.minusMonths(1))); //podemos subtrair 
		
		System.out.println("Subtraindo -1 dia: " + (dataBase = dataBase.minusDays(1))); //podemos subtrair 
		
		System.out.println("Subtraindo -1 semana: " + (dataBase = dataBase.minusWeeks(1))); //podemos subtrair 
		
		
		// Simulação de Geração de Parcelas vencimento de duplicatas, boletos , parcelas
		
		for(int data = 1; data <= 12; data++) {
			
			dataBase = dataBase.plusMonths(1);
			
			System.out.println("Parcela " + data + " vencimento: " + dataBase);
		}
		
	}

}
