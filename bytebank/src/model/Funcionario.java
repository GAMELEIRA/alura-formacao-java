package model;

/**
 * AUTOR: GABRIEL GAMELEIRA DOS SANTOS DATA: 19/05/2020 HORA: 20:20 FINALIDE DO
 * PROGRAMA: DEFINE A ENTIDADE FUNCIONARIO
 */

public abstract class Funcionario {

	private String nome;

	private String cpf;

	private double salario;

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

	public double getSalario() {

		return salario;

	}

	public void setSalario(double salario) {

		this.salario = salario;

	}

	public abstract double calcularBonificacao();

}
