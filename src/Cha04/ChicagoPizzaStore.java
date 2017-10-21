package Cha04;

public class ChicagoPizzaStore extends PizzaStore {
    Pizza createPizza(PizzaType item){
        if (item.equals(PizzaType.CHEESE)){
            return new ChicagoStylePizza();
        }else return null;
    }
}
