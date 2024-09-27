package br.edu.fatecpg.calculadora.view;

import java.util.Scanner;

import br.edu.fatecpg.calculadora.model.Calculadora;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número:");
		double n1 = ler.nextDouble();
		
		System.out.println("Digite o segundo número:");
		double n2 = ler.nextDouble();
		
		Calculadora calc = new Calculadora(n1, n2);
		
		System.out.println("Digite a operação desejada: 1- Soma; 2 - Subtração; 3 - Multiplicação; 4 - Divisão.");
		int operacao = ler.nextInt();

		
		
		switch(operacao) {
		case 1: 
			System.out.println(calc.soma());
			break;
		case 2:
			System.out.println(calc.subtracao());
			break;
		case 3:
			System.out.println(calc.multiplicacao());
			break;
		case 4:
			System.out.println(calc.divisao());
			break;
		}

	}

}
