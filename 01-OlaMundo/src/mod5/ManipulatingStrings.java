package mod5;

public class ManipulatingStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome = new String();
		nome = "FIAP";
		
		//Ocorrerá um erro pois a variável nome2 não tem valor
		//String nome2 = null;
		//System.out.println(nome2.length());
		
		//Correção do erro acima
		String nome3 = new String();
		System.out.println(nome3.length());
		
		//Exemplo de caracteres de escape
		String nome4 = "FIAP \nA melhor faculdade de tecnologia";
		System.out.println(nome4);
		
		//Exemplo de concatenação 
		String nome5 = "FIAP";
		String slogan = " A melhor faculdade de tecnologia";
		String faculdade = nome5 + slogan;
		System.out.println(faculdade);
		//Também pode ser utilizado += e o método concat()
		
		//As strings são diferentes pois estão alocadas em endereços distintos. Para comparar o conteúdo devemos usar métodos no lugar do operador ==
		//Operador == só funciona se as strings iniciarem sem instância.
		String nome6 = new String("FIAP");
		String nome7 = new String("FIAP");
		if (nome6 == nome7){
		    System.out.println("As Strings são iguais");
		}else{
		    System.out.println("As Strings são diferentes");
		}
		
		//método equals (leva em consideração maiúsculas e minúsculas
		String nome8 = "FIAP";
		String nome9 = new String("FIAP");
		if (nome8.equals(nome9)){
		    System.out.println("As Strings são iguais");
		}else{
		    System.out.println("As Strings são diferentes");
		}
		
		//método equalsIgnoreCase, ignora as maiúsculas e minúsculas
		String nome10 = "fiap";
		String nome11 = new String("FIAP");
		if (nome10.equalsIgnoreCase(nome11)){
		    System.out.println("As Strings são iguais");
		}else{
		    System.out.println("As Strings são diferentes ");
		}
		
		//método startsWith verifica se a string inicia com o valor passado
		String facu = "FIAP - A Melhor Faculdade de Tecnologia";
		if (facu.startsWith("FIAP")){
		    System.out.println("A string começa com FIAP");
		}else{
		    System.out.println("A string não começa com FIAP");
		}
		
		//endsWith tem o mesmo conceito do anterior mas pega o fim da string 
		String facu1 = "FIAP - A Melhor Faculdade de Tecnologia";
		if (facu1.endsWith("gia")){
		    System.out.println("A string termina com gia");
		}else{
		    System.out.println("A string não termina com gia");
		}
		
		//length pega o tamanho da string 
		String facu2 = "FIAP - A Melhor Faculdade de Tecnologia";
		int caracteres = facu2.length();
		System.out.println("A string possui " + caracteres + " caracteres");
		
		//Pega um caractére na posição passada
		String facu3 = "FIAP - A Melhor Faculdade de Tecnologia";
		char caracter = facu3.charAt(1);
		System.out.println("O segundo caracter da string é " + caracter);
		
		//Pegar a primeira vez que o valor passado aparece na string 
		String facu4 = "FIAP - A Melhor Faculdade de Tecnologia";
		int posicao = facu4.indexOf('a');
		System.out.println("O índice do caracter 'a' na string é " + posicao);
	
		//pega a última ocorrência do valor passado
		String facu5 = "FIAP - A Melhor Faculdade de Tecnologia";
		int posicao1 = facu5.lastIndexOf('a');
		System.out.println("O índice do último caracter 'a' na string é " + posicao);
		
		//Substring pega trechos da string
		String facu6 = "FIAP - A Melhor Faculdade de Tecnologia";
		String nova = facu6.substring(16, 25);
		System.out.println("A nova string é: " + nova);
		
		//toUpperCase deixa a string inteira em maiúscula
		String facu7 = "FIAP - A Melhor Faculdade de Tecnologia";
		String nova1 = facu7.toUpperCase();
		System.out.println("A nova string é: " + nova);
		
		//toLowerCase deixa a string inteira em minúscula
		String facu8 = "FIAP - A Melhor Faculdade de Tecnologia";
		String nova2 = facu8.toLowerCase();
		System.out.println("A nova string é: " + nova);
		
		//replace trocam caracteres/palavras pelas passadas no segundo argumento do método
		String facu9 = "FIAP - A Melhor Faculdade de Tecnologia";
		String nova3 = facu9.replace('a', 'x');
		System.out.println("A nova string é: " + nova);
		
		//split separa a string 
		String facu10 = "FIAP - A Melhor Faculdade de Tecnologia";
		String[] palavras = facu10.split(" ");
		for (String p : palavras) {
		    System.out.println(p);
		}
	}

}
