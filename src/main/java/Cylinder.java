public class Cylinder extends Circle {
    private double height = 3.0;

    public Cylinder () {
    }

    public Cylinder (double height) {
        this.height = height;
    }

    public Cylinder (double height, double radius, String color, boolean filled) {
        super(radius, color, filled);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double tinhTheTich() {
        return Math.PI * height * radius * radius;
    }

    @Override
    public  String toString() {
        return "A Cilinder with height="
                + getHeight()
                + ", which is a subclass of "
                + super.toString();
    }
}
