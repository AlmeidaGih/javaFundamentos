package mod6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class StreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter stream = new FileWriter("D://arquivo.txt");
			PrintWriter print = new PrintWriter(stream);
			
			print.println("Teste");
			print.println("Escrevendo no arquivo");
			
			print.close();
			
			stream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//Exemplo de leitura de arquivo
		try {
			FileReader stream = new FileReader("D://arquivo.txt");
			BufferedReader reader = new BufferedReader(stream);
			
			String linha = reader.readLine();
			while (linha != null) {
				System.out.println(linha);
				
				linha = reader.readLine();
			}
			
			reader.close();
			stream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
