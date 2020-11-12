package datastructure;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


public class UseMap {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Map that includes storing and retrieving elements.
         * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
         * Use For Each loop and while loop with Iterator to retrieve data.
         *
         * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
         */

        Map<Integer, String> map = new LinkedHashMap<Integer, String>();

        map.put(1, "california");
        map.put(2, "Texas");
        map.put(3, "Pennsylvania");
        map.put(4, "maryland");
        map.put(5, "Oklahoma");
        map.put(6, "illinois");

        for (Map.Entry<Integer, String> USAcity : map.entrySet()) {
            System.out.println(USAcity.getKey() + " ==>" + USAcity.getValue());
        }
        System.out.println("=====================================");
        List<String> usacity = new ArrayList<>();

        usacity.add("california");
        usacity.add("Texas");
        usacity.add("pennsylvania");

        List<String> Algeriacity = new ArrayList<>();

        Algeriacity.add("ouadhia");
        Algeriacity.add("azazga");
        Algeriacity.add("boghni");

        Map<Integer, List<String>> map2 = new LinkedHashMap<>();

        map2.put(1, usacity);
        map2.put(2, Algeriacity);

        for (Map.Entry<Integer, List<String>> city : map2.entrySet()) {
            System.out.println(city.getKey() + "  ==>" + city.getValue());
        }


    }

}





