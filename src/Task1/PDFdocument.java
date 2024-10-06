package Task1;

public class PDFdocument implements Document {
    @Override
    public void create(String name) {
        System.out.println("PDF document, " + name + ", was created!");
    }
}