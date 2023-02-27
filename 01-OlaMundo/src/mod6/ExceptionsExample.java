package mod6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		try {
			int div = n1/n2;
			
			System.out.println("O resultado da divisão é: " + div);
			
		} catch(ArithmeticException e) {
			System.err.println("Erro ao dividir!");
		} catch (InputMismatchException e) {
			System.err.println("Erro de entrada de dados");
		} finally {
			System.out.println("Finalizando a execução do programa!");
			sc.close();
		}
		
		int[] array = new int[2];
		
		try {
			array[2] = 10;
		} catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("Mensagem de erro: " + e.getMessage());
			e.printStackTrace();
		}

	}

}
