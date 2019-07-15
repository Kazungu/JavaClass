package Encapsulation;

public class OtherClass {
    public static void main(String[] args) {
        Encapsulation student = new Encapsulation();
        System.out.println(student.getAge()); //Grabs the data.
        student.getTheAge(40); //set data
        System.out.println(student.getAge()); //Grab data.

    }

}
