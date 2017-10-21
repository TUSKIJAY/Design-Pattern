package Cha06;

public class RemoteLoader {
    public static void main(String[] args){
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        Light livingRoomLight = new Light("Living Room");
        Light KitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        Stereo stereo = new Stereo("Living Room");

        //LightOnCommand livingRoomeLightOn = new LightOnCommand(livingRoomLight);
        //LightOffCommand livingRoomeLightOff = new LightOffCommand(livingRoomLight);


        //LightOnCommand kitchenLightOn = new LightOnCommand(KitchenLight);
        //LightOffCommand kitchenLightOff = new LightOffCommand(KitchenLight);

        //CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
        CeilingFanLowCommand ceilingFanLow = new CeilingFanLowCommand(ceilingFan);

        //StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        //StereoOffWithCDCommand stereoOffWithCD = new StereoOffWithCDCommand(stereo);

        //remoteControl.setCommand(0,livingRoomeLightOn,livingRoomeLightOff);
        //remoteControl.setCommand(1,kitchenLightOn,kitchenLightOff);
        //remoteControl.setCommand(2,ceilingFanOn,ceilingFanOff);
        //remoteControl.setCommand(3,stereoOnWithCD,stereoOffWithCD);
        remoteControl.setCommand(1,ceilingFanHigh,ceilingFanOff);
        remoteControl.setCommand(2,ceilingFanLow,ceilingFanOff);

        remoteControl.onButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
        System.out.println("楼上是撤销后的");
        remoteControl.onButtonWasPushed(2);
        System.out.println(remoteControl);
        System.out.println("楼下是撤销后的");
        remoteControl.undoButtonWasPushed();

        /*System.out.println(remoteControl);
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);*/
    }
}
