package mod5;
import java.util.Scanner;

public class LoopsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Exemplo da repetição While 
		int numero = 0;
			
			while (numero < 10) {
				numero = numero + 1;
				System.out.println(numero);
			}
			
		//Exemplo de Do-While
		Scanner sc = new Scanner(System.in);
		String opcao;
		do {
			System.out.println("Digite um número");
			int n1 = sc.nextInt();
			System.out.println("Digite outro número");
			int n2 = sc.nextInt();
			int soma = n1 + n2;
			System.out.println("A soma é " + soma);
			System.out.println("Deseja somar outro número? (S/N)");
			opcao = sc.next();
			
		}while(opcao.equals("S"));
		sc.close();
		
		//Exemplo de for 
		for (int i=0; i <=10; i++) {
			System.out.println(i);
		}
	}

}
