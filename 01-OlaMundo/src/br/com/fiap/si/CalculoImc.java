package br.com.fiap.si;

import java.util.Scanner;

public class CalculoImc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a altura: ");
		double altura = sc.nextDouble();
		
		System.out.print("Digite o peso: ");
		double peso = sc.nextDouble();
		
		double imc = peso/(altura*altura);
		
		if(imc > 18.5 && imc < 25) {
			System.out.print("O peso é ideal");
		}else {
			System.out.print("O peso não é ideal");
		}
		
		sc.close();
		
	}

}
