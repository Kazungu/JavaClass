package Assingment;

public class Triangle {
    double height=3;
    double base=4;
    double hypotenious=5;

    public static void main(String[] args) {
        Triangle object1 = new Triangle();
        double area = 0.5 * object1.height * object1.base;
        System.out.println(area);

    }
}
