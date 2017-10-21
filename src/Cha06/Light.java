package Cha06;

public class Light {
    String room;
    public Light(String light){
        this.room = light;
    }
    public void on(){
        System.out.println("The "+room+" light is On");
    }
    public void off(){
        System.out.println("The "+room+" light is Off");
    }
}
