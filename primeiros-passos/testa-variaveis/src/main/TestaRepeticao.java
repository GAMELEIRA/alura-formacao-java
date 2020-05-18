package main;

/**
 * AUTOR: GABRIEL GAMELEIRA DOS SANTOS
 * DATA: 17/05/2020
 * HORA: 23:14
 * FINALIDADE DO PROGRAMA: TRABALHAR COM O WHILE
 */

//APLICAR LOGICA 12345 1234 123 12 1
public class TestaRepeticao {

	public static void main(String[] args) {
	
		byte contador = 0;
		
		while(contador <= 10) {
			
			System.out.println(contador);
			
			contador++;
			
		}
		
		for (int cont = 0; cont <= 10; cont++) {

			System.out.println(cont);
			
		}
		
	}

}
