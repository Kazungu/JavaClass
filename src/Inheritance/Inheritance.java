package Inheritance;

public class Inheritance {
    //parent class/super class: class being inherited from
    //child class - inherits from another(super/parent)

    //to inherit use the key word extends

    protected String firstname = "Java";
    String lastname = "Developer";


}

class Child extends Inheritance{
    public static void main(String[] args) {
        Child John = new Child();
        System.out.println(John.firstname + " "+ John.lastname);
    }
}