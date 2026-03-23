package AbstractFactory;

public class LightThemeFactory implements GUIFactory{
    public Button createButton(){
        return new LightButton();
    }

    public CheckBox createCheckBox(){
        return new LightCheckBox(); 
    }

    public TextBox createTextBox(){
        return new LightTextBox();
    }
}
