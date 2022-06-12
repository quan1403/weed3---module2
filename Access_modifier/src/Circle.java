public class Circle {
    private double raius = 1.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(double raius) {
        this.raius = raius;
    }

    public double getRaius() {
        return raius;
    }

    public void setRaius(double raius) {
        this.raius = raius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double Area(){
        return Math.pow(this.raius,2)*Math.PI;
    }
}
