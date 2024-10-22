
public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 3;
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
			removed = false;
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
}
