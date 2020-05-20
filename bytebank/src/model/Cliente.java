package model;

/**
 * AUTOR: GABRIEL GAMELEIRA DOS SANTOS
 * DATA: 19/05/2020
 * HORA: 20:20
 * FINALIDE DO PROGRAMA: DEFINE A ENTIDADE CLIENTE
 */

public class Cliente {

	private String nome;
	
	private String cpf;
	
	private String profissao;
	
	private Conta conta;
	
	private static int total = 1;
	
	public Cliente(String nome, String cpf, String profissao, Conta conta){
		
		System.out.println("Total de contas: " + this.total);
		
		this.nome = nome;
		
		this.cpf = cpf;
		
		this.profissao = profissao;
		
		this.conta = conta;
		
		total++;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}
	
}
