package hust.soict.dsai.aims.store;

import java.util.ArrayList;
import java.util.List;

import hust.soict.dsai.aims.media.Media;

public class Store {
	private List<Media> itemsInStore = new ArrayList<Media>();
	
	public void addMedia(Media item) {
		itemsInStore.add(item);
	}
	
	private void removeMedia(Media item) {
		for (Media currItem: itemsInStore) {
			if (item.equals(currItem)) {
				itemsInStore.remove(item);
			}
		}
	}
	
}
