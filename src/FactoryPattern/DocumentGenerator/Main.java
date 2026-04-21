package FactoryPattern.DocumentGenerator;

public class Main {
    public static void main(String[] args) {
        DocumentFactory factory = new PDFFactory(); 
        Document doc = factory.createDocument(); 
        doc.create();
    }
}
