class Device{
    String deviceId;
    String status;

    //Constructor
    public Device(String deviceId, String status){
        this.deviceId = deviceId;
        this.status = status;
    }

    //Method
    public void displayStatus(){
        System.out.println("Device Id: " + deviceId);
        System.out.println("Device Status : " + status);
    }
}

class Thermostat extends Device{
    double temperatureSetting;

    public Thermostat(String deviceId, String status, double temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }
    @Override
    public void displayStatus(){
        super.displayStatus();
        System.out.println("temperature Setting: " + temperatureSetting + " C");
    }
}

public class SmartHomeDevice{
    public static void main(String[] args) {
        Thermostat thermostat = new Thermostat("IPHONE16@8967", "Active", 22.9);
        thermostat.displayStatus();
    }
}

