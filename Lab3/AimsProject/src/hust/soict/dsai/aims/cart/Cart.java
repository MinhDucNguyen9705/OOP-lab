package hust.soict.dsai.aims.cart;

import java.util.ArrayList;
import java.util.List;

import hust.soict.dsai.aims.media.Media;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private List<Media> itemsOrdered = new ArrayList<Media>(); 
	
	private void addMedia(Media item) {
		itemsOrdered.add(item);
	}
	
	private void removeMedia(Media item) {
		for (Media currItem: itemsOrdered) {
			if (item.equals(currItem)) {
				itemsOrdered.remove(item);
			}
		}
	}
	
	public float totalCost() {
		float sum = 0;
		for (Media item: itemsOrdered) {
			if (item!=null) {
				sum += item.getCost();
			}
		}
		return sum;
	}
	
	public void getAllTitles() {
		for (Media item: itemsOrdered) {
			System.out.println(item.getTitle());
		}
	}
	
	public void print() {
		System.out.println("***********************CART***********************");
		System.out.println("Ordered Items: ");
		for (Media item: itemsOrdered) {
			System.out.println(item.toString());
		}
		System.out.println("Total cost: " + this.totalCost());
		System.out.println("***************************************************");
	}
	
	public void search(int id) {
		boolean found = false;
		for (Media item: itemsOrdered) {
			if (item.isMatch(id)) {
				System.out.println(item.toString());
				found = true;
			}
		}
		if (found == false) {
			System.out.println("No match is found");
		}
	}
	
	public void search(String title) {
		boolean found = false;
		for (Media item: itemsOrdered) {
			if (item.isMatch(title)) {
				System.out.println(item.toString());
				found = true;
			}
		}
		if (found == false) {
			System.out.println("No match is found");
		}
	}
}
