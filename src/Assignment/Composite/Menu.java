package Assignment.Composite;

import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuComponent {

    private String name;

    private List<MenuComponent> items =
            new ArrayList<>();

    public Menu(String name) {
        this.name = name;
    }

    public void add(MenuComponent component) {
        items.add(component);
    }

    @Override
    public void display() {

        System.out.println("\nMenu Category: " + name);

        for(MenuComponent item : items) {
            item.display();
        }
    }
}
