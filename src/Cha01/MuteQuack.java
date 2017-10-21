package Cha01;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quck() {
        System.out.println("<<Silence>>");
    }
}
