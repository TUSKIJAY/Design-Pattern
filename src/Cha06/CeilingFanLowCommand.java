package Cha06;

public class CeilingFanLowCommand implements Command {
    CeilingFan ceilingFan;
    Speed prevSpeed;

    public CeilingFanLowCommand(CeilingFan ceilingFan){
        this.ceilingFan = ceilingFan;
    }
    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.low();
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
