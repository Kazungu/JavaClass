package Polymorphisim;

public class MyClass {
    //many forms.

    int numSeats = 4;
    int numTyres = 4;

    public void honk(){
        System.out.println("pee-pee-pee");
    }

}
class Vitz extends MyClass{
    public void honk(){
        System.out.println("tuu-tuu-tuu");
    }
}

class Lorry extends MyClass{
    public void honk(){
        System.out.println("pree-pree-pree");
    }
}

class MainClass{
    public static void main(String[] args) {
        Vitz myVitz = new Vitz();
        Lorry myLorry = new Lorry();

        myVitz.honk();
        myLorry.honk();
    }
}