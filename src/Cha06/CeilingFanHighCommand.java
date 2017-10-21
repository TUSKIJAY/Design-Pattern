package Cha06;

public class CeilingFanHighCommand implements Command {
    CeilingFan ceilingFan;
    Speed prevSpeed;

    public CeilingFanHighCommand(CeilingFan ceilingFan){
        this.ceilingFan = ceilingFan;
    }
    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.high();
    }

    @Override
    public void undo() {
        if (prevSpeed == Speed.HIGH){
            ceilingFan.high();
        }else if (prevSpeed == Speed.MEDIUM){
            ceilingFan.medium();
        }else if (prevSpeed == Speed.LOW){
            ceilingFan.low();
        }else if (prevSpeed == Speed.OFF){
            ceilingFan.off();
        }
    }
}
