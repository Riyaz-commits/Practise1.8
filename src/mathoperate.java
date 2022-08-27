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
        System.out.println( random.get());
        }
    public static int calculate(math m)
    {
    return    m.operation(34,65);
    }
}
   // test