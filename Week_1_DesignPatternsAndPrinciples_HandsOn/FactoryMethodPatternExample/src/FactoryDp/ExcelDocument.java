package FactoryDp;

public class ExcelDocument implements Document {
    public void open() {
        System.out.println("Opening Excel spreadsheet …");
    }
    public void save() {
        System.out.println("Saving Excel spreadsheet …");
    }
}
