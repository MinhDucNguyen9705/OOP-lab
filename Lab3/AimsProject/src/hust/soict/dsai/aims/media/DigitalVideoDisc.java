package hust.soict.dsai.aims.media;


public class DigitalVideoDisc extends Disc{
	private static int nbDigitalVideoDisc = 0;
	private int id;
	
	public DigitalVideoDisc(String title) {
		super(title);
		nbDigitalVideoDisc += 1;
		this.id = nbDigitalVideoDisc;
	}
	
	public DigitalVideoDisc(String title, String category, float cost) {
		super(title, category, cost);
		nbDigitalVideoDisc += 1;
		this.id = nbDigitalVideoDisc;
	}
	
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super(title, category, director, cost);
		nbDigitalVideoDisc += 1;
		this.id = nbDigitalVideoDisc;
	}
	
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(title, category, director, length, cost);
		nbDigitalVideoDisc += 1;
		this.id = nbDigitalVideoDisc;
	}
	
	public String toString() {
		String str = this.getId() + "." + "DVD" + " - " + 
				 this.getTitle() + " - " + 
				 this.getCategory() + " - " + 
				 this.getDirector() + " - " +
				 this.getLength() + ": " + 
				 this.getCost();
		return str;
	}
	
	public boolean isMatch(String title) {
		if (this.getTitle() == title) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean isMatch(int id) {
		if (this.getId() == id) {
			return true;
		}else {
			return false;
		}
	}
	
}