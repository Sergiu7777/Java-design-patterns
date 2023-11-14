package factory;

public class Main {

  public static void main(String[] args) {
    var pizzaFactory = new PizzaFactory();
    var pizzaShop = new PizzaShop(pizzaFactory);

    pizzaShop.orderPizza(PizzaType.DIABOLO);
  }
}
