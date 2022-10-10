package mybook;

import java.util.ArrayList;
import java.util.List;

public class Book {
	String name;
	List<String> paragraph= new ArrayList<String>();
	List<String> table= new ArrayList<String>();
	List<String> image= new ArrayList<String>();
	public Book(String name) {
		this.name = name;
	}
	
	public void createNewParagraph(String x) {
		this.paragraph.add(x);
	}

	public void createNewImage(String x) {
		this.image.add(x);
	}
	
	public void createNewTable(String x) {
		this.table.add(x);
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", paragraph=" + paragraph + ", table=" + table + ", image=" + image + "]";
	}
	
	
}