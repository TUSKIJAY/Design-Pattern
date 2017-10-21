package Cha05;

public class Test {
    public static void main(String[] args){
        ChocolateBoiler test;
        test = ChocolateBoiler.getInstance();
        test.boil();
        Singleton test1 = Singleton.getInstance();
    }
}
