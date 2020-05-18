package main;

/**
 * AUTOR: GABRIEL GAMELEIRA DOS SANTOS
 * DATA: 17/05/2020
 * HORA: 23:14
 * FINALIDADE DO PROGRAMA: TRABALHAR COM CONDICIONAIS
 */

public class TestaCondicional {
	
	public static void main(String[] args) {
		
		System.out.println("Testando condicionais");
		
		int idade = 20;
		
		int quantidadePessoas = 3;
		
		if (idade >= 18) {
			
			System.out.println("Voc� t�m mais de 18 anos.");
			
			System.out.println("Seja bem vindo.");
			
		} else if (quantidadePessoas >= 2) {
			
			System.out.println("Voc� pode entrar pois est� acompanhado!");
			
		} else {
			
			System.out.println("Infelizmente voc� n�o pode entrar.");
			
		}
		
	}

}
