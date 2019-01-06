package usualstructs.step7;

public class Duck {
    private String color;
    private int childrenCount;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getChildrenCount() {
        return childrenCount;
    }

    public void setChildrenCount(int childrenCount) {
        this.childrenCount = childrenCount;
    }

    public void moveForward() {
        System.out.println("Going forward");
    }

    public void turnRight() {
        System.out.println("Turning right");
    }
}
