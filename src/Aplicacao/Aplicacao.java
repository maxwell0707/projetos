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
		System.out.print("Digite a Data do chek-in(dd/MM/yyyy):  ");
		Date checkin = sdf.parse(sc.next());
		System.out.println("Digite a Data de Check-out: ");
		Date checkout = sdf.parse(sc.next());

		if (!checkout.after(checkin)) {

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
			Date now = new Date();
			if (checkin.before(now) || checkout.before(now)) {
				// ATUALIZAÇÃO DA RESERVA
				System.out.println("a atualização de Datas deve conter datas futuras.");

			} else if (!checkout.after(checkin)) {

				System.out.println("Erro de reserva , a data do check-in nao pode ser posterior ao check-out");
			} else {
				reserva.atualizarData(checkin, checkout);
				System.out.println(reserva);

			}

		}

	}

}
