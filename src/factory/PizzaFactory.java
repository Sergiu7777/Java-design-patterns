package factory;

import factory.pizzaTypes.DiaboloPizza;
import factory.pizzaTypes.FourSeasonsPizza;
import factory.pizzaTypes.MozarellaPizza;
import factory.pizzaTypes.PepperoniPizza;

public class PizzaFactory {

    public Pizza createPizza(PizzaType type) {
        return switch (type) {
            case FOUR_SEASONS -> new FourSeasonsPizza();
            case DIABOLO -> new DiaboloPizza();
            case PEPPERONI -> new PepperoniPizza();
            case MOZARELLA -> new MozarellaPizza();
        };
    }
}
