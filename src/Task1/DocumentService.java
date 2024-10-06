package Task1;

public class DocumentService {
    private Document doc;
    public DocumentService(Document doc){
        this.doc = doc;
    }
    public void createDocument(){
        doc.create();
    }
}
