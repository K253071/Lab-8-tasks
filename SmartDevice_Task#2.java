package Lab08Task02;

interface SmartDevice {
    void turnOn ();
    void turnOff();
}

class SmartLight implements SmartDevice {

    public void turnOn (){
        System.out.println("Light turned on...");
    }

    public void turnOff (){
        System.out.println("Light turned off...");
    }
}

class SmartFan implements SmartDevice{
    public void turnOn (){
        System.out.println("Fan turned on...");
    }

    public void turnOff (){
        System.out.println("Fan turned off...");
    }

}

class Main {
    public static void main(String[] args){
        SmartDevice sd;
        sd = new SmartLight();
        sd.turnOff();
        sd.turnOn();
        sd = new SmartFan();
        sd.turnOn();
        sd.turnOff();
    }
}
