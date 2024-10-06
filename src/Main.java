import Task1.*;

public class Main {
    public static void main(String[] args) {
        // Task 1
        Document doc = new PDFdocument();
        DocumentService docService = new DocumentService(doc);
        docService.createDocument("PDF file");

        Document doc2 = new WordDocument();
        DocumentService docService2 = new DocumentService(doc2);
        docService2.createDocument("Word file");
        // Task 2

    }
}