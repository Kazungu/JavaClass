package Modifiers;

public class OtherClass {
    public String firstname = "John"; //accessible to other classes.
    private String lastname = "Doe"; //accessible in the same class.
    String middlename = "Gram"; //accessible in the same package.
    protected String othername ="Groan"; //accessible in package and subclass.

    public void myMethod(){
        System.out.println("Hawaii");
    }
    static void otherMethod(){
        System.out.println("Other Hawaii");
    }
}
