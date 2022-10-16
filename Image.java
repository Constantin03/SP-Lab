package mybook;

public class Image extends Element {
    private final String numeleImaginii;

    public Image(String numeleImaginii) {
        this.numeleImaginii = numeleImaginii;
    }

    @Override
    public void print() {
        System.out.println("Image with name: " + numeleImaginii);
    }
}