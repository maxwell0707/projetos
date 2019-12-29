package Aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import Model.entidades.Reservas;

public class Aplicacao {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Digite o numero do quarto: ");
		int num = sc.nextInt();
		System.out.print("Digite a Data do Check-in(dd/MM/yyyy):  ");
		Date checkin = sdf.parse(sc.next());
		System.out.println("Digite a Data de Check-out: ");
		Date checkout = sdf.parse(sc.next());

		if (checkout.before(checkin)) { //after(depois) before(antes)

			System.out.println("Erro, a data do check-in nao pode ser posterior ao check-out");
		} else {
			Reservas reserva = new Reservas(num, checkin, checkout);
			System.out.println("RESERVA:\n" + reserva);
			System.out.println("\nEntre com a atualização do checkin e checkout: ");

			System.out.print("Digite a Data do chek-in(dd/MM/yyyy):  ");
			checkin = sdf.parse(sc.next());
			System.out.println("Digite a Data de Check-out: ");
			checkout = sdf.parse(sc.next());
			// *****************************************************************************************************************************
		String error=  reserva.atualizarData(checkin, checkout);
		if(error!= null) {
			System.out.println("Error na reseva: "+ error);
			
		}else {
			System.out.println("reserva:\n "+ reserva);
		}
			
		}

	}

}
