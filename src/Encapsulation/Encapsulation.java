package Encapsulation;

public class Encapsulation {
    // means sensitive info is hidden.

    private int age = 30;
    // to make a private method to be accessible from another object in another class,
    // make use of setters and getters method.

    //getter method.
    public int getAge(){
        return age;
    }

    //setter method
    public void getTheAge(int theAge){
        this.age = theAge;
    }
}
