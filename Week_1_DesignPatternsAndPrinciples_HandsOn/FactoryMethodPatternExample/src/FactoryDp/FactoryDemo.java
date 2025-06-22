package FactoryDp;

public class FactoryDemo {
    public static void main(String[] args) {
        DocumentFactory wordFactory  = new WordDocumentFactory();
        DocumentFactory pdfFactory   = new PdfDocumentFactory();
        DocumentFactory excelFactory = new ExcelDocumentFactory();

        Document word  = wordFactory.newDocument();
        Document pdf   = pdfFactory.newDocument();
        Document excel = excelFactory.newDocument();

        word.save();
        pdf.save();
        excel.save();
    }
}
