package model;

/**
 * AUTOR: GABRIEL GAMELEIRA DOS SANTOS
 * DATA: 20/05/2020
 * HORA: 11:30
 * FINALIDE DO PROGRAMA: DEFINE A ENTIDADE GERENTE
 */

public class Gerente extends Funcionario {
	
	private int senha;
	
	public void setSenha(int senha) {
	
		this.senha = senha;
	
	}
	
	public boolean autentica(int senha) {
		
		if(this.senha == senha) {
			
			return true;
			
		} else {
			
			return false;
			
		}
		
	}
	
	public double calcularBonificacao() {
		
		return super.getSalario();
		
	}
	

}
