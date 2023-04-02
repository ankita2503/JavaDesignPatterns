package DecoratorPattern;

public class test {

    public static void main(String[] args) {

        PizzaDecorator veggierPizzaDecorator = new VeggiePizzaDecorator(new PlainPizza());
        veggierPizzaDecorator.bake();


        PizzaDecorator cheesePizzaDecorator = new CheesePizzaDecorator(new PlainPizza());
        cheesePizzaDecorator.bake();
    }
}
