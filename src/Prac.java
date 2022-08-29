import java.util.*;

public class Prac {

    public static void main(String[] args) {
        List<HashMap<String,String>> li = new ArrayList<>();

        HashMap<String,String> hm = new HashMap<>();
        hm.put("Riyaz","USA");
        hm.put("Shaik","California");
        hm.put("Basha","Dallas");

        HashMap<String,String> hm1 = new HashMap<>();
        hm1.put("SDET","Canada");
        hm1.put("Basha","Texas");
        hm1.put("Automation","Silicon Valley");


        li.add(hm);
        li.add(hm1);
        // to iterate the List of maps
        li.stream().forEach(System.out::println);
        System.out.println( li.get(1).get("SDET"));



    }
}
