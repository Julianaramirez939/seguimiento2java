package TrafficLight;

public class Traffic {
    public String lightColor;
    public boolean isOn;

    public void changeColor(String newColor) {
        lightColor = newColor;
        System.out.println("Traffic light color changed to: " + lightColor);
        showMessage();
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Traffic light turned off.");
    }

    public void turnOn() {
        isOn = true;
        System.out.println("Traffic light turned on.");
        showMessage();
    }

    public void showMessage() {
        if (isOn) {
            switch (lightColor.toLowerCase()) {
                case "red":
                    System.out.println("Stop");
                    break;
                case "yellow":
                    System.out.println("Prepare to move");
                    break;
                case "green":
                    System.out.println("Go");
                    break;
                default:
                    System.out.println("Unknown color");
                    break;
            }
        } else {
            System.out.println("Traffic light is turned off.");
        }
    }
}
