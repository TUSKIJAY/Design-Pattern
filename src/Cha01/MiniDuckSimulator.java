package Cha01;

public class MiniDuckSimulator {
    public static void main(String[] args){
        Duck mallard = new MallarDuck();
        mallard.performQuack();
        mallard.performFly();
        mallard.display();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
        model.performQuack();
        model.setQuackBehavior(new Quack());
        model.performQuack();
    }
}
