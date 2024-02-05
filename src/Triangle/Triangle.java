package Triangle;


public class Triangle {
    private int angle1;
    private int angle2;
    private int angle3;

    public int getAngle1() {
        return angle1;
    }

    public void setAngle1(int angle1) {
        this.angle1 = angle1;
    }

    public int getAngle2() {
        return angle2;
    }

    public void setAngle2(int angle2) {
        this.angle2 = angle2;
    }

    public int getAngle3() {
        return angle3;
    }

    public void setAngle3(int angle3) {
        this.angle3 = angle3;
    }

    public boolean isValidTriangle() {
        return (angle1 + angle2 + angle3 == 180);
    }
}
