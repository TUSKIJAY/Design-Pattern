package Cha03;

public class GoodDog {
    private int size;

    public int getSize(){
        return size;
    }
    public void setSize(int s){
        size = s;
    }

    void bark(){
        if (getSize() > 60){
            System.out.println("woof!woof!");
        }else if (getSize() > 14){
            System.out.println("ruff!ruff!");
        }else {
            System.out.println("yip!yip!");
        }
    }
}
class GoodDogTest{
    public static void main(String[] args){
        GoodDog one =new GoodDog();
        one.setSize(70);
        GoodDog two = new GoodDog();
        two.setSize(8);
        System.out.println("Dog one "+one.getSize());
        System.out.println("Dog two "+two.getSize());
        one.bark();
        two.bark();
    }
}
