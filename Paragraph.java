package mybook;

public class Paragraph extends Element {
    private final String continutParagraf;

    public Paragraph(String continutParagraf) {
        this.continutParagraf = continutParagraf;
    }

    @Override
    public void print() {
        System.out.println("Paragraph: " + continutParagraf);
    }
}
