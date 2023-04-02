package Factory;

public class CheesePizza implements Pizza {

    @Override
    public String prepare() {
        return "Preparing cheese Pizza";
    }

    @Override
    public String order() {
        return "Order cheese Pizza";
    }

    @Override
    public String bake() {
        return "Baking cheese Pizza";
    }
}
