package model;

public class ContaCorrente extends Conta {
	
	public ContaCorrente() {
		super();
	}
	
	//SOBREESCRITA
	@Override
	public boolean saca(double valor) {
		
		double valorASacar = valor + 0.2;
		
		return super.saca(valorASacar);
		
	}
	
}
