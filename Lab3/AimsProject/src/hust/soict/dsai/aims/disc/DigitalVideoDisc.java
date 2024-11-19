package hust.soict.dsai.aims.disc;


public class DigitalVideoDisc {
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	private static int nbDigitalVideoDisc = 0;
	private int id;
	
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
		nbDigitalVideoDisc += 1;
		this.id = nbDigitalVideoDisc;
	}
	
	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
		nbDigitalVideoDisc += 1;
		this.id = nbDigitalVideoDisc;
	}
	
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
		nbDigitalVideoDisc += 1;
		this.id = nbDigitalVideoDisc;
	}
	
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
		nbDigitalVideoDisc += 1;
		this.id = nbDigitalVideoDisc;
	}
	
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public float getCost() {
		return cost;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public int getId() {
		return id;
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
