package FactoryDp;

public class PdfDocument implements Document {
    public void open() {
        System.out.println("Opening PDF document …");
    }
    public void save() {
        System.out.println("Saving PDF document …");
    }
}
