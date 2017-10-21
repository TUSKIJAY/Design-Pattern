package Cha05;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    private static ChocolateBoiler UniqueInstance;
    private ChocolateBoiler(){
        empty = true;
        boiled = false;
    }
    public static ChocolateBoiler getInstance(){
        if (UniqueInstance == null){
            UniqueInstance = new ChocolateBoiler();
        }
        return UniqueInstance;
    }
    public void fill(){
        if (isEmpty()){
            empty = false;
            boiled = false;
        }
    }
    public void drain(){
        if (!isEmpty() && isBoiled()){
            empty = true;
        }
    }
    public void boil(){
        if (!isEmpty() && !isBoiled()){
            boiled = true;
        }
    }
    public boolean isEmpty(){
        return empty;
    }
    public boolean isBoiled(){
        return boiled;
    }
}
