package JavaArrays;
import java.util.HashMap;
public class JavaHarchMaps {
    public static void main(String[] args) {
        HashMap<String, String> cities = new HashMap<String,String>();
        //adding items
        cities.put("NRB", "Nairobi");
        cities.put("KSK","Kisumu");
        cities.put("MBS","Mombasa");
        cities.put("NKR", "Nakuru");

        //get an item
        System.out.println(cities.get("NRB"));

        //remove an item
        cities.remove("MBS");

        //Remove all items use clear()
        //cities.clear();

        System.out.println(cities);
        System.out.println("#############################");
        //to loop through keys in a hashmap, we use 'keyset()'
        //to loop through values in a hashmap, we use 'values()'

        for(String k: cities.keySet()){
            System.out.println("Key: "+ k);
        }
        System.out.println("#############################");
        //loop values
        for(String v: cities.values()){
            System.out.println("Value: "+v);
        }
        System.out.println("#############################");
        //looping through both keys and values
        for (String k: cities.keySet()){
            System.out.println("Key: "+ k +" value: "+ cities.get(k));
        }
        System.out.println("############ STRING AND INTEGERS #################");

        //array with string and int

        HashMap<String, Integer> devs = new HashMap<String, Integer>();
        devs.put("John", 23);
        devs.put("Peter", 34);
        devs.put("Sarah", 21);
        devs.put("Terry", 22);

        for(String k: devs.keySet()){
            System.out.println("Key: "+ k);
        }
        System.out.println("#############################");
        //loop values
        for(Integer v: devs.values()){
            System.out.println("Value: "+v);
        }
        System.out.println("#############################");
        //looping through both keys and values
        for (String k: devs.keySet()){
            System.out.println("Key: "+ k +" value: "+ devs.get(k));
        }







    }
}
