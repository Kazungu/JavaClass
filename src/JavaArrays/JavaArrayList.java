package JavaArrays;
import java.util.ArrayList;
import java.util.Collections;

public class JavaArrayList {
    public static void main(String[] args) {
        //creating an ArrayList in java
        ArrayList<String> fruits = new ArrayList<String>();
        ArrayList<Integer> ages = new ArrayList<Integer>();

        //adding data to the Array
        fruits.add("Banana");
        fruits.add("orange");
        fruits.add("Mango");
        fruits.add("Apple");

        System.out.println(fruits);
        //getting data

        String getB = fruits.get(0);
        String getM = fruits.get(2);

        System.out.println(getB +" "+ getM);
        System.out.println(fruits.get(3));

        ages.add(34);
        System.out.println(ages);

        //changing items and values.
        fruits.set(0, "pineapple");

        //removing items use the "remove()"
        fruits.remove(1);

        System.out.println(fruits);

        //checking the length of the array, using size().
        int length = fruits.size();
        System.out.println(length);

        //looping through array list.
        //for loop
        for(int x = 0; x< fruits.size(); x++){
            System.out.println(fruits.get(x));
        }
        System.out.println("###################################");
        //for each
        for (String x: fruits){
            System.out.println(x);
        }
        System.out.println("###################################");
        //sorting ArrayList
        //must import collection class.
        Collections.sort(fruits);
        for (String x: fruits){
            System.out.println(x);
        }
    }
}
