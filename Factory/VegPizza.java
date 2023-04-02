package Factory;

public class VegPizza implements Pizza {

    @Override
    public String prepare() {
        return "Preparing Veg Pizza";
    }

    @Override
    public String order() {
        return "order Veg Pizza";
    }

    @Override
    public String bake() {
        return "Baking Veg Pizza";
    }
}
