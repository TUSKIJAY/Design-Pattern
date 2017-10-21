package Cha03;

public abstract class Beverage {
    public int size;
    static int TALL = 1;
    static int GRANDE = 2;
    static int VENT = 3;
    String description = "Unknown Beverage";

    public String getDescription(){
        return description;
    }
    public abstract double cost();

    public void setSize(int s){
        size = s;
    }
    public int getSize(){
        return size;
    }
}
