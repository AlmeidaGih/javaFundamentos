package mod5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CollectionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Exemplo do List com seus métodos
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("LTP");
		lista.add("Web");
		lista.set(2, "Algoritmos");
		lista.remove(2);
		System.out.println(lista.get(1));
		
		//Exemplo de Set
		HashSet<Object> cursos = new HashSet<>();

		cursos.add("Java");
		cursos.add(".NET");
		cursos.add("Android");

		cursos.add("Java"); //Repetido!

		//Imprime todos os elementos
		System.out.println(cursos);
		
		//Exemplo de Map 
		HashMap<String, String> mapa = new HashMap<String, String>();

		mapa.put("RM1234", "Thiago");
		mapa.put("RM4321", "João");

		System.out.println(mapa);
	}

}
