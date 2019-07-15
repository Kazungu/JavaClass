package Modifiers;

public class MyClass {
    //modifiers determine how classes, attributes,methods interact with each other.
    //1. Access modifiers
    //2. non-access modifiers

    //Access: Classes:
        // 1.public modifier: makes a class to be accessible by another class.
        // 2. default modifiers: accessible in a package with classes in the same package.

    //Access: methods, attributes,constructors
        //1. public : code will be accessible for all classes.
        //2. private : only accessible with a declared class.
        //3. default : only accessible in the package.
        //4. protected: accessible in the same package, accessible in a subclass.

    public static void main(String[] args) {
        OtherClass object1 = new OtherClass();

        System.out.println(object1.firstname);
        //System.out.println(object1.lastname); private: not accessible
        System.out.println(object1.middlename);
        System.out.println(object1.othername);

        object1.myMethod();
        object1.otherMethod();

        //NON-ACCESS-MODIFIERS.
        //classes: final - cannot inherit a class with final modifiers.
        //classes: abstract- cannot be used to create an object.

        //methods, attributes, constructors
        //final: attributes and methods cannot be over ridden.
        //STATIC: Attributes and methods belong to the class rather than the object.


    }
}
