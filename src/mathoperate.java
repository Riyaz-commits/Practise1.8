import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class mathoperate {

    public static void main(String[] args) {

        math mmuti =   ( a,  b)-> (a*b);
        math add =(a,b)-> a+b;
        math sub =(a,b)->a-b;
        math div=((a, b) -> a/b);
      //  math hj= (a,b-)>System.out.println(a+b));

        System.out.println(calculate(mmuti));
        System.out.println(calculate(add));
        System.out.println(calculate(sub));
        System.out.println(calculate(div));
        System.out.println("here it is ");


        System.out.println("Master new commit");

        System.out.println("child rbsk change");

        System.out.println("1137 pm aug 20 2022");
        Supplier<String> random = ()-> "Test"+Math.random();
        //no def
        System.out.println( random.get());


        String rn = random.get();

        Consumer<String> cnc =(s)-> System.out.println(s+"concat");
        cnc.accept("SDET");

        Consumer<List<Integer>> doble = list->list.forEach(a-> System.out.println("Applied logic "+a*2));


        List<Integer> li = new ArrayList<>();
        li.add(2);
        li.add(4);
        li.add(6);
        li.add(9);

        System.out.println("New change master1");
        System.out.println("ABCD");

        System.out.println("Before list "+li);

        System.out.println("Child Chanrge");

        doble.accept(li);


   //     Predicate<String > pr =




        }





    public static int calculate(math m)
    {
    return    m.operation(34,65);
    }
}
   // test