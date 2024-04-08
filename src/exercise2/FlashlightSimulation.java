package exercise2;
public class FlashlightSimulation {
    public static void main(String[] args) {
        // Declare and initialize a Battery object
        Battery battery = new Battery();

        // Declare and initialize a FlashLamp object
        FlashLamp flashLamp = new FlashLamp();

        // Install battery in the flashlight
        flashLamp.setBattery(battery);

        // Turn the flashlight on and off 10 times
        for (int i = 0; i < 10; i++) {
            System.out.println("Turning flashlight on...");
            flashLamp.turnOn();
            System.out.println("Flashlight is on. Battery power: " + flashLamp.getBatteryInfo());

            System.out.println("Turning flashlight off...");
            flashLamp.turnOff();
            System.out.println("Flashlight is off.");
        }

        // Display remaining battery power
        System.out.println("Remaining battery power: " + flashLamp.getBatteryInfo());
    }
}
