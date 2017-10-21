package Cha06;

public class CeilingFan {
    String location;
    //public static final int HIGH = 3;
    //public static final int MEDIUM = 2;
    //public static final int LOW = 1;
    //public static final int OFF = 0;
    Speed speed;
    public CeilingFan(String location){
        this.location = location;
        speed = Speed.OFF;
    }
    public void high(){
        speed = Speed.HIGH;
        System.out.println("The"+location+" ceilingfan is on high");
    }
    public void medium(){
        speed = Speed.MEDIUM;
    }
    public void low(){
        speed = Speed.LOW;
        System.out.println("The"+location+" ceilingfan is on low");
    }

    public Speed getSpeed() {
        return speed;
    }

    public void on(){
        System.out.println("The "+location+" ceilingfan is on");
    }
    public void off(){
        speed = Speed.OFF;
        System.out.println("The "+location+" ceilingfan is off");
    }
}
