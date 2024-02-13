package task10_programs;

public class Circle {
    private double radius; // Data member

    //Constructor without argument
    public Circle() {
        radius = 0;  
    }
    //Constructor with radius as argument
    public Circle(double radius) {
        this.radius = radius;
    }
 
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

     
    public static void main(String[] args) {
        
        Circle circle1 = new Circle(); // No-argument constructor
        Circle circle2 = new Circle(5.0); // Constructor with radius as argument

         
        System.out.println("Circumference of circle1: " + circle1.calculateCircumference());
        System.out.println("Circumference of circle2: " + circle2.calculateCircumference());
    }
}

