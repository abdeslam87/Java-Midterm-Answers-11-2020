package datastructure;

import java.util.HashMap;

public class CollectionView {

    public static void main(String[] args) {
        /*
         Map is created and inserted some data.Retrieve the Collection view of values present in map
         */
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "CA");
        map.put(2, "TX");
        map.put(3, "PA");
        map.put(4, "MD");
        map.put(5, "OK");
        map.put(6, "IL");

        for (HashMap.Entry<Integer,String>city:map.entrySet()){
            System.out.println(city.getKey()+"-->  "+city.getValue());
        }




    }

}
