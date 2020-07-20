package entities;

import java.util.ArrayList;
import java.util.List;

public class Colection {
	
	private Item item;
	
	private List<Item> items = new ArrayList<>();
	
	public Colection() {
	}
	
	public Colection(Item item) {
		this.item = item;
	}
	
	public Item getItem() {
		return item;
	}
	public void setClient(Item item) {
		this.item = item;
	}
	
	public List<Item> getItems() {
		return items;
	}

	public void addItems(Item item){						//em listas é preciso fazer add e remove, pois o metodo set trocaria toda a lista
		items.add(item);
	}	
	public void removeItems(Item item) {
		items.remove(item);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Item item : items) {
			sb.append(item + "\n");
		}
		return sb.toString();
	}
	
}
