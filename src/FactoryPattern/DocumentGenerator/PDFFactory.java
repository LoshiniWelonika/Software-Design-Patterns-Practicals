package FactoryPattern.DocumentGenerator;

public class PDFFactory extends DocumentFactory {
    Document createDocument(){
        return new PDFDocument();
    }
}
