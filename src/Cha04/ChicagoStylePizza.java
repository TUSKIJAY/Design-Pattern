package Cha04;

public class ChicagoStylePizza extends Pizza {
    public ChicagoStylePizza(){
        name = "Chicago Style Deep Dish Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        topping.add("Shredded Mozzarella Cheese");
    }
    void cut(){
        System.out.println("Cutting the pizza into square slice");
    }
}
