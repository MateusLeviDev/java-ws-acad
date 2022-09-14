package java_ude_alu;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class java_classes13 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		// lista não aceita tipos primitivos. Vai ter que usar a wrapper class do int.
		// <Integer> => generics. parametrizar a def de um tipo informando um outro tipo.
		
		list.add("Maria"); 
		list.add("Alex");
		list.add("Bob");
		list.add("Ana");
		list.add(2, "Levi"); // add nome em uma determinada posição. 
		
		System.out.println(list.size()); // imprimindo tamanho da lista
		
		
		for (String obj : list) {
			System.out.println(obj);
		} 
		
		System.out.println("------=------"); //removendo elemento 
		
		list.remove("Ana");
		list.remove(0);
		list.removeIf(obj -> obj.charAt(0) == 'A'); // removendo por função lambda. [predicado]
		
		for (String obj : list) {
			System.out.println(obj);
		} 
		
		System.out.println("------=------"); // encontrar posição de um elemento
		
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		
		System.out.println("------=------");
		
		List<String> result = list.stream().filter(obj -> obj.charAt(0) == 'B').collect(Collectors.toList());		
		
		for (String obj : result) {
			System.out.println(obj);
		} 
		
		System.out.println("------=------");
		
		String name = list.stream().filter(obj -> obj.charAt(0) == 'B').findFirst().orElse(null);
		 System.out.println(name);
	} 

}
