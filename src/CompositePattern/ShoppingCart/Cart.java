package CompositePattern.ShoppingCart;

import java.util.ArrayList;
import java.util.List;

class Cart implements CartItem {
    private List<CartItem> items = new ArrayList<>();
    
    public void add(CartItem item) {
        items.add(item);
    }
    
    public double getPrice() {
        double total = 0;
        for (CartItem item : items) {
        total += item.getPrice();
        }
        return total;
    }
}
