package Assingment;

public class Student {
    String name ;
    int roll_no;
    String phone_no;
    String address;
    public static void main(String[] args) {
        Student object1 = new Student();
        object1.name = "John";
        object1.roll_no = 2;
        object1.phone_no ="0700123456";
        object1.address="Kikuyu Kenya";
        System.out.println("Name: "+ object1.name);
        System.out.println("Roll number: "+ object1.roll_no);
        System.out.println("phone number: "+object1.phone_no);
        System.out.println("Address: "+ object1.address);

        Student object2 = new Student();
        object2.name = "Sam";
        object2.roll_no = 3;
        object2.phone_no ="07987654";
        object2.address="Nairobi Kenya";
        System.out.println("Name: "+ object2.name);
        System.out.println("Roll number: "+ object2.roll_no);
        System.out.println("phone number: "+object2.phone_no);
        System.out.println("Address: "+ object2.address);


    }
}
