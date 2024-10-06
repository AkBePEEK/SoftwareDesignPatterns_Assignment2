package Task1;

public class DocumentService {
    private final Document doc;
    public DocumentService(Document doc){
        this.doc = doc;
    }
    public void createDocument(String name){
        doc.create(name);
    }
}