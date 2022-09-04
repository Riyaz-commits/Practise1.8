import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicatePrac {

    public static void main(String[] args) {

        List<String> li = new ArrayList();
        li.add("Shaik");
        li.add("");
        li.add("Riyaz");
        li.add("");
        li.add("Basha");
        li.add("123");

    boolean k= li.removeIf(e->e.equalsIgnoreCase("123"));
           
        System.out.println(li);

        System.out.println("Before Length of the list "+li+" "+ li.size());
        Predicate<String> p = s->s.trim().length()==0;


        li.removeIf(p);
        System.out.println("Before Length of the list "+li+" "+ li.size());

        Predicate<Integer> INT = s-> s/2==0;

        System.out.println(  INT.test(3));



    }
}
