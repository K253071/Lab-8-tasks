package Lab08Task05;

abstract class Appliance {
    abstract void start();
}

interface RemoteControl {
    void controlRemotely();
}

class SmartWashingMachine extends Appliance implements RemoteControl {
    @Override
    public void controlRemotely (){
        System.out.println("is being controlled remotely.");
    }

    @Override
    void start (){
        System.out.println("Started with remote.");
    }
}

class Main {
    public static void main(String[] args){
        SmartWashingMachine wm = new SmartWashingMachine();
        wm.start();
        wm.controlRemotely();
    }
}