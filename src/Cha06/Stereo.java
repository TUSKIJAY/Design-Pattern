package Cha06;

public class Stereo {
    String room;
    public Stereo(String room){
        this.room = room;
    }
    public void on(){
        System.out.println("The "+room+" Stereo is on");
    }
    public void setCD(){
        System.out.println("The "+room+" stereo is set for CD input");
    }
    public void setVolume(int volume){
        System.out.println("The "+room+" stereo volume set to "+volume);
    }
    public void off(){
        System.out.println("The "+room+" stereo is off");
    }
}
