package AbstractFactory.UI_Themes;

public class DarkThemeFactory implements GUIFactory{
    public Button createButton(){
        return new DarkButton();
    }

    public CheckBox createCheckBox(){
        return new DarkCheckBox();
    }

    public TextBox createTextBox(){
        return new DarkTextBox();
    }
}

