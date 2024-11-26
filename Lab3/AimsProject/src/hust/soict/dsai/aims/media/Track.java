package hust.soict.dsai.aims.media;

public class Track {
	
	private String title;
	private int length;
	
	public Track(String title, int length) {
		this.title = title;
		this.length = length;
	}

	public String getTitle() {
		return title;
	}

	public int getLength() {
		return length;
	}
	
	public boolean equals(Track newTrack) {
		if ((newTrack.getLength() == this.getLength()) && (newTrack.getTitle()==this.getTitle())) {
			return true;
		}
		return false;
	}
	
}