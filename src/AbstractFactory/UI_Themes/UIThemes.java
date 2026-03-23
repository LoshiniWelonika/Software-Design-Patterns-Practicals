package AbstractFactory.UI_Themes;

public class UIThemes {
    public static void main(String[] args) {
        GUIFactory factory;

        //Simulating theme selection
        String theme = "dark";

        if(theme.equalsIgnoreCase("dark")){
            factory = new DarkThemeFactory();
        }
        else{
            factory = new LightThemeFactory();
        }

        //Create UI components using the factory
        Button button = factory.createButton();
        CheckBox checkBox = factory.createCheckBox();
        TextBox textBox = factory.createTextBox();

        //Use the components
        button.paint();
        checkBox.paint();
        textBox.paint();
    }
}
