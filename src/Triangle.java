public class Triangle extends Shape {
    private String color;

    public Triangle() {
    }

    public Triangle(String color) {
        this.color = color;
    }

    public Triangle(double side1, double side2, double side3, String color) {
        super(side1, side2, side3);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getPerimeter(){
        return  super.getSide1() + super.getSide2() + super.getSide3();
    }
    public  double getArea(){
       double p = this.getPerimeter()/2;
       double s = p*(p - super.getSide1())*(p - super.getSide2())*(p - super.getSide3());
       return Math.pow(s, 0.5);
    }

    @Override
    public String toString() {
        return "triangle with area = " + this.getArea() + " and perimeter = " + this.getPerimeter() +
                " and with color of " + this.getColor();
    }
}
