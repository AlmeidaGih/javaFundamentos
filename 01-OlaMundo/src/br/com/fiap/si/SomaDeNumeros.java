package br.com.fiap.si;

import java.util.Scanner;

public class SomaDeNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		int numero1 = sc.nextInt();
		System.out.print("Digite o segundo número: ");
		int numero2 = sc.nextInt();
		
		int soma = numero1 + numero2;
		System.out.println("A soma é " + soma);
		
		int resto = soma % 2;
		if(resto == 0) {
			System.out.println("A soma é par");
		}else {
			System.out.println("A soma é impar");
		}
		
		sc.close();
		
	}

}
