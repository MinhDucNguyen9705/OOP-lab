package hust.soict.dsai.aims.media;

import java.util.List;
import java.util.ArrayList;

public class Book extends Media{
	
	private List<String> authors = new ArrayList<String>();
	
	public Book(int id, String title, String category, float cost, List<String> authors) {
		super(id, title, category, cost);
		this.authors = authors;
	}

	public List<String> getAuthors() {
		return authors;
	}
	
	public void addAuthor(String authorName) {
		boolean added = false;
		for (String author: authors) {
			if (authorName == author) {
				added = true;
			}
		}
		if (added == false) {
			authors.add(authorName);
		}
	}
	
	public void removeAuthor(String authorName) {
		for (String author: authors) {
			if (authorName == author) {
				authors.remove(author);
			}
		}
	}
	
}
