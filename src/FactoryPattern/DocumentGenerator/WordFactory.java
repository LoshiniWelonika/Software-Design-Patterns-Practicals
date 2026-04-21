package FactoryPattern.DocumentGenerator;

public class WordFactory extends DocumentFactory{
    Document createDocument(){
        return new WordDocument();
    }
}
