package Model.exceptions;

public class DominioException  extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	
	// Classe RuntimeExcption: o compilador nao obriga vc a tratar( try catch).
	//Classe Exception: o compilador obriga a tratar.
	
	
	
	public DominioException(String msg) {
		
		super( msg);
	}
	
	
	
	
	
	

}
