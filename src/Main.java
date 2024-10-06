import Task1.*;
import Task2.*;

public class Main {
    public static void main(String[] args) {
        Document doc = new PDFdocument();
        DocumentService docService = new DocumentService(doc);
        docService.createDocument();
    }
}