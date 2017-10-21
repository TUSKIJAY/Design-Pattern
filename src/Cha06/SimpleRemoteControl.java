package Cha06;

public class SimpleRemoteControl {
    Command command;

    public SimpleRemoteControl(){}

    public void setCommande(Command command){
        this.command = command;
    }

    public void buttonWasPressed(){
        command.execute();
    }
}
