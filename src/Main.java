import Task1.*;
import Task2.Buttons.*;
import Task2.Checkboxes.*;
import Task2.ThemeFactory.*;

public class Main {
    public static void main(String[] args) {
        // Task 1
        Document doc = new PDFdocument();
        DocumentService docService = new DocumentService(doc);
        docService.createDocument("PDF file");

        Document doc2 = new WordDocument();
        DocumentService docService2 = new DocumentService(doc2);
        docService2.createDocument("Word file");
        // Task 23
        ThemeFactory lightThemeFactory = new LightThemeFactory();
        Button lightButton = lightThemeFactory.createButton();
        Checkbox lightCheckbox = lightThemeFactory.createCheckbox();
        lightButton.display();
        lightCheckbox.display();

        ThemeFactory darkThemeFactory = new DarkThemeFactory();
        Button darkButton = darkThemeFactory.createButton();
        Checkbox darkCheckbox = darkThemeFactory.createCheckbox();
        darkButton.display();
        darkCheckbox.display();
    }
}