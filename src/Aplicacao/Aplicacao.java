package Aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import Model.entidades.Reservas;
import Model.exceptions.DominioException;

public class Aplicacao {

	public static void main(String[] args)  {

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		try {
				System.out.print("Digite o numero do quarto: ");
				int num = sc.nextInt();
				System.out.print("Digite a Data do Check-in(dd/MM/yyyy):  ");
				Date checkin = sdf.parse(sc.next());
				System.out.println("Digite a Data de Check-out: ");
				Date checkout = sdf.parse(sc.next());
				Reservas reserva = new Reservas(num, checkin, checkout);
				System.out.println("RESERVA:\n" + reserva);
				
				System.out.println("\nEntre com a atualização do checkin e checkout: ");
				System.out.print("Digite a Data do chek-in(dd/MM/yyyy):  ");
				checkin = sdf.parse(sc.next());
				System.out.println("Digite a Data de Check-out: ");
				checkout = sdf.parse(sc.next());
				reserva.atualizarData(checkin, checkout);
				System.out.println("RESERVA:\n" + reserva);
		}
		catch(ParseException e) {
			System.out.println("Formato de Data invalida");
		}
		catch(DominioException e) {
			System.out.println("Error na Reserva: "+ e.getMessage());
		}
		catch(RuntimeException e) {
			System.out.println("Erro inesperado!");
		}
		
		sc.close();
		
	}

}
