package main;

/**
 * AUTOR: GABRIEL GAMELEIRA DOS SANTOS
 * DATA: 17/05/2020
 * HORA: 00:28
 * FINALIDADE DO PROGRAMA: TRABALHAR COM CONDICIONAIS
 */

public class TestaCondicionais2 {

	public static void main(String[] args) {
			
		System.out.println("Testando condicionais");
		
		int idade = 20;
		
		int quantidadePessoas = 2;
		
		boolean acompanhado = quantidadePessoas >= 3;
		
		if (idade >= 18 && acompanhado) {
			
			System.out.println("Você têm mais de 18 anos.");
			
			System.out.println("Seja bem vindo.");
			
		} else {
			
			System.out.println("Infelizmente você não pode entrar.");
			
		}
		
	}

}

