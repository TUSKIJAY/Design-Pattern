package Cha04;

public class NYPizzaStore extends PizzaStore {
    Pizza createPizza(PizzaType item){
        if (item.equals(PizzaType.CHEESE)){
            return new NYStylePizza();
        }else return null;
    }
}
