package model;

public class SistemaInterno {
	
	private int senha = 2222;
	
	public void autentica(Gerente gerente) {
		
		gerente.autentica(this.senha);
		
	}

}
