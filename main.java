package mybook;
public class main {

	public static void main(String[] args) {
		Book discoTitanic = new Book("Disco Titanic");
        Author autorulCartii = new Author("Radu Pavel Gheo");

        discoTitanic.addAuthor(autorulCartii);
        int indexulPrimuluiCapitol = discoTitanic.createChapter("Capitolul 1");
        Chapter primulCapitol = discoTitanic.getChapter(indexulPrimuluiCapitol);
        int indexulPrimuluiSubCapitol = primulCapitol.createSubChapter("Subcapitolul 1.1");
        SubChapter primulSubCapitol = primulCapitol.getSubChapter(indexulPrimuluiSubCapitol);

        primulSubCapitol.createNewParagraph("Paragraph 1");
        primulSubCapitol.createNewParagraph("Paragraph 2");
        primulSubCapitol.createNewParagraph("Paragraph 3");
        primulSubCapitol.createNewParagraph("Paragraph 4");
        primulSubCapitol.createNewImage("Image 1");
        primulSubCapitol.createNewTable("Table 1");
        primulSubCapitol.createNewParagraph("Paragraph 5");

        primulSubCapitol.print();
	}

}
