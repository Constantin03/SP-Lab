package mybook;

import java.util.ArrayList;
import java.util.List;

public class Book {
	 private final String titlulCartii;
	    private Author autorulCartii;
	    private List<Chapter> listaCapitole;

	    public Book(String titlulCartii) {
	        this.titlulCartii = titlulCartii;
	        this.listaCapitole = new ArrayList<>();
	    }

	    public void addAuthor(Author autorulCartii) {
	        this.autorulCartii = autorulCartii;
	    }

	    public int createChapter(String titlulCapitolului) {
	        listaCapitole.add(new Chapter(titlulCapitolului));
	        return listaCapitole.size() - 1;
	    }

	    public Chapter getChapter(int indexulCapitolului) {
	        return listaCapitole.get(indexulCapitolului);
	    }
}