package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {
	private DigitalVideoDisc itemInStore[] = new DigitalVideoDisc[10000];
	private int idx = 0;
	
	public void addDigitalVideoDisc(DigitalVideoDisc dvd) {
		itemInStore[idx] = dvd;
		idx++;
	}
	
	public void removeDigitalVideoDisc(DigitalVideoDisc dvd) {
		boolean removed = false;
		for (int i=0; i<idx; i++) {
			if (itemInStore[i].equals(dvd)) {
				itemInStore[i] = null;
				System.out.println("The DVD has been successfully removed");
				removed = true;
			}
			if (removed) {
				for (int j=i+1; j<idx; j++) {
					itemInStore[j-1] = itemInStore[j];
				}
				idx--;
				break;
			}
			if (i==idx-1 && removed==false) {
				System.out.println("Cannot not find this DVD in the cart");
			}
		}
	}
}
