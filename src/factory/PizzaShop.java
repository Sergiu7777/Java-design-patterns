package factory;

public class PizzaShop {
  private final PizzaFactory pizzaFactory;

  public PizzaShop(PizzaFactory pizzaFactory) {
    this.pizzaFactory = pizzaFactory;
  }

  public Pizza orderPizza(PizzaType type) {
    var pizza = pizzaFactory.createPizza(type);
    pizza.preparePizza();
    pizza.cookPizza();
    pizza.servePizza();

    System.out.printf("Please have your pizza %s order! Thank you!", type);
    return pizza;
  }
}
