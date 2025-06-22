package FactoryDp;

public abstract class DocumentFactory {
    public abstract Document createDocument();

    public Document newDocument() {
        Document doc = createDocument();
        doc.open();
        return doc;
    }
}
