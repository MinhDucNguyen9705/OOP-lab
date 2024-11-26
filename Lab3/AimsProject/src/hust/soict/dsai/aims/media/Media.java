package hust.soict.dsai.aims.media;

public class Media {
	
	private int id;
	private String title;
	private String category;
	private float cost;
	
	public Media(String title) {
		this.title = title;
	}
	
	public Media(String title, String category, float cost) {
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	
	public Media(int id, String title, String category, float cost) {
		this.id = id;
		this.title = title;
		this.category = category;
		this.cost = cost;
	}

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getCategory() {
		return category;
	}

	public float getCost() {
		return cost;
	}
	
	public boolean isMatch(int id) {
		if (this.getId() == id) {
			return true;
		}
		return false;
	}
	
	public boolean isMatch(String title) {
		if (this.getTitle() == title) {
			return true;
		}
		return false;
	}
	
	public String toString() {
		String str = this.getId() + "." + 
				 this.getTitle() + " - " + 
				 this.getCategory() + " - " + 
				 this.getCost();
		return str;
	}
}
