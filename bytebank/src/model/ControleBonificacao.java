package model;

public class ControleBonificacao {

	private double soma;
	
	public void registra(Funcionario funcionario) {
		
		double bonificacao = funcionario.calcularBonificacao();
		
		this.soma += bonificacao;
		
	}
	
	public double getSoma() {
	
		return soma;
	
	}
}
