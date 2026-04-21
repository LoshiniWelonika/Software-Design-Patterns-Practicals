package FactoryPattern.DocumentGenerator;

class PDFDocument implements Document{
    public void create(){
        System.out.println("Creating PDF Document");
    }
}
