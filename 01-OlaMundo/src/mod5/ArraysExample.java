package mod5;
import java.util.Scanner;

public class ArraysExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Exemplo de array primitivo
		Scanner sc = new Scanner(System.in);
		float notas[] = new float[10];
		for (int i = 0; i < 10; i++) {
		  System.out.println("Digite a nota do aluno");
		  notas[i] = sc.nextFloat();
		}
		sc.close();
		
		// Calculara média dos alunos
		float totalNotas = 0;
		for (int i = 0; i < notas.length; i++) {
		  totalNotas = totalNotas + notas[i];
		}
		float mediaNotas = totalNotas/notas.length;
		System.out.println("A média dos alunos é " + mediaNotas);
		
		//Exemplo de array com objetos 
		//Carro[] carros = new Carro[5];
		//Carro carro = new Carro();
		//carro.setModelo("Gol");
		//carros[0] = carro;
		
		//Exemplo de array multidimensional
		int[][] notas2 = new int[9][40];
		notas2[0][0] = 10;
		notas2[0][1] = 9;
		System.out.println(notas2[0][0]);
		System.out.println(notas2[0][1]);
		
	}

}
