package model;

/**
 * AUTOR: GABRIEL GAMELEIRA DOS SANTOS DATA: 19/05/2020 HORA: 20:20 FINALIDE DO
 * PROGRAMA: DEFINE A CLASSE CONTA
 */

public class Conta {

	private double saldo;

	private int agencia;

	private int numero;

	private String titular;

	public void deposita(double valor) {

		this.saldo += valor;

	}

	public boolean saca(double valor) {

		if (this.saldo >= valor) {

			this.saldo -= valor;

			return true;

		} else {

			return false;

		}
	
	}
	
	public boolean transfere(double valor, Conta destino) {
		
		if(this.saldo >= valor) {
			
			this.saldo -= valor;
			
			destino.deposita(valor);
			
			return true;
			
		}
		
		return false;
		
	}	
	
}
