package Cha04;

public abstract class PizzaStore {
    public Pizza orderPizza(PizzaType type){
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
    abstract Pizza createPizza(PizzaType type);
}
