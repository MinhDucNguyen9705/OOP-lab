package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered = 0;
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered < MAX_NUMBERS_ORDERED) {
			itemOrdered[qtyOrdered] = disc;
			qtyOrdered++;
			System.out.println("The disc has been added");
			if (qtyOrdered == MAX_NUMBERS_ORDERED-1) {
				System.out.println("The cart is almost full");
			}
		}else {
			System.out.println("The cart is already full");
		}
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList) {
		for (int i=0; i<dvdList.length; i++) {
			if (qtyOrdered < MAX_NUMBERS_ORDERED) {
				this.addDigitalVideoDisc(dvdList[i]);
			}else {
				System.out.println("The cart is already full");
				break;
			}
		}
	}
	
//	public void addDigitalVideoDisc(DigitalVideoDisc... dvdList) {
//		for (DigitalVideoDisc dvd : dvdList) {
//			if (qtyOrdered < MAX_NUMBERS_ORDERED) {
//				this.addDigitalVideoDisc(dvd);
//			}else {
//				System.out.println("The cart is already full");
//				break;
//			}
//		}
//	}
	
	
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		this.addDigitalVideoDisc(dvd1);
		this.addDigitalVideoDisc(dvd2);
	}
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		boolean removed = false;
		for (int i=0; i<qtyOrdered; i++) {
			if (itemOrdered[i].equals(disc)) {
				itemOrdered[i] = null;
				System.out.println("The DVD has been successfully removed");
				removed = true;
			}
			if (removed) {
				for (int j=i+1; j<qtyOrdered; j++) {
					itemOrdered[j-1] = itemOrdered[j];
				}
				qtyOrdered--;
				break;
			}
			if (i==qtyOrdered-1 && removed==false) {
				System.out.println("Cannot not find this DVD in the cart");
			}
		}
	}
	
	public float totalCost() {
		float sum = 0;
		for (int i=0; i<qtyOrdered; i++) {
			if (itemOrdered[i]!=null) {
				sum += itemOrdered[i].getCost();
			}
		}
		return sum;
	}
	
	public void getAllTitles() {
		for (int i=0; i<qtyOrdered; i++) {
			System.out.println(itemOrdered[i].getTitle());
		}
	}
	
	public void print() {
		float total = 0;
		System.out.println("***********************CART***********************");
		System.out.println("Ordered Items: ");
		for (int i=0; i<qtyOrdered; i++) {
			System.out.println(itemOrdered[i].toString());
			total += itemOrdered[i].getCost();
		}
		System.out.println("Total cost: " + total);
		System.out.println("***************************************************");
	}
	
	public void search(int id) {
		boolean found = false;
		for (int i=0; i<qtyOrdered; i++) {
			if (itemOrdered[i].isMatch(id)) {
				System.out.println(itemOrdered[i].toString());
				found = true;
			}
		}
		if (found == false) {
			System.out.println("No match is found");
		}
	}
	
	public void search(String title) {
		boolean found = false;
		for (int i=0; i<qtyOrdered; i++) {
			if (itemOrdered[i].isMatch(title)) {
				System.out.println(itemOrdered[i].toString());
				found = true;
			}
		}
		if (found == false) {
			System.out.println("No match is found");
		}
	}
}
