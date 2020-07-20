//sistema que le o nome e a coleçao enquanto continuar adicionando novos itens

package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Colection;
import entities.Item;

public class Program {
	
	public static void main (String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy"); 
		
		Scanner sc = new Scanner(System.in);
		
		boolean keepRunning = true;
		
		System.out.println("adicione itens a colecao: ");
		System.out.print("Informe seu nome: ");
		String name = sc.nextLine();
		
		Colection col = new Colection();
		
		do {
		System.out.print("Informe o nome do item a ser adicionado: ");
		String itemName = sc.nextLine();
		if (itemName.isEmpty()) {
			keepRunning = false;
		}
		else {
			System.out.print("Informe o ano do item: ");
			Date itemYear = sdf.parse(sc.next());
			sc.nextLine();
		
			Item item = new Item(itemName, itemYear);
			col.addItems(item);
			
			}
		}
		while (keepRunning == true);
		
		System.out.println(name + "'s colection: \n" + col);
		
		sc.close();

	}
}