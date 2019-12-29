package Model.entidades;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservas {

	private Integer numQuarto;
	private Date checkin;
	private Date checkout;
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	// Construtores
	public Reservas(Integer numQuarto, Date checkin, Date checkout) {
		this.numQuarto = numQuarto;
		this.checkin = checkin;
		this.checkout = checkout;
	}

	public Integer getNumQuarto() {
		return numQuarto;
	}

	public void setNumQuarto(Integer numQuarto) {
		this.numQuarto = numQuarto;
	}

	public Date getCheckin() {
		return checkin;
	}

	public Date getCheckout() {
		return checkout;
	}

	
	public long duracao() {
		long diff = checkout.getTime()- checkin.getTime();
		
		return TimeUnit.DAYS.convert(diff,TimeUnit.MILLISECONDS);
	}
	
	public String atualizarData(Date checkIn, Date checkOut) {
		
		Date now = new Date();
		if (checkIn.before(now) || checkOut.before(now)) {
			// ATUALIZAÇÃO DA RESERVA
			return "ERRO, a atualização de Datas deve conter datas futuras.";

		} 
		else if (checkOut.before(checkIn)) {

			return "Erro de reserva , a data do check-in nao pode ser posterior DEPOIS ao check-out";
		} 
			
			this.checkin = checkIn;
			this.checkout = checkOut;
			return null;
		}
		
		
		
		
		
		
	
	@Override
	
	public String toString() {
		
		return  "Numero do Quarto " + numQuarto+
					 ", CheckIn: "+sdf.format( checkin)+
					 ", CheckOut "+ sdf.format(checkout)+
					 ","+
					 + duracao() +" Noites:  ";
					 
		
		
	}
	
	
	
	
}
