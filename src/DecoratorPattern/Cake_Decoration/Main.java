package DecoratorPattern.Cake_Decoration;

public class Main {
    public static void main(String[] args) {
        Cake cake = new Chocolate(new Cream(new PlainCake()));
        System.out.println(cake.getDescription());
    }
}