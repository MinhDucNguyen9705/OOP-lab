package hust.soict.dsai.aims.store;

import java.util.ArrayList;
import java.util.List;

import hust.soict.dsai.aims.media.Media;

public class Store {
	private List<Media> itemsInStore = new ArrayList<Media>();
	
	public void addMedia(Media item) {
		if (itemsInStore.contains(item)==false) {
			itemsInStore.add(item);
		}
	}
	
	public void removeMedia(Media item) {
		if (itemsInStore.contains(item)) {
			itemsInStore.remove(item);
		}
	}
	
}
