package Cha07;

public class DuckTestDrive {
    public static void main(String[] args){
        MallardDuck duck = new MallardDuck();

        WildTurkey turkey = new WildTurkey();
        //将火鸡包装进一个火鸡适配器中
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        Turkey duckAdapter = new DuckAdapter(duck);

        System.out.println("The turkey say...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe Duck says...");
        testDuck(duck);

        System.out.println("\nThe TurkeyAdapter says...");
        testDuck(turkeyAdapter);

        System.out.println("\nThe DuckAdapter says...");
        testTurkey(duckAdapter);
    }
    static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
    static void testTurkey(Turkey turkey){
        turkey.gobble();
        turkey.fly();
    }
}
