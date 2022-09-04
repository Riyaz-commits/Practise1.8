import java.util.HashMap;
import java.util.Map;

public class Calculator {

    private static Map<String,MathOperation> map = new HashMap<>();

    static
    {
        map.put("+",(a,b)->a+b);
        map.put("-",(a,b)->a-b);
        map.put("*",(a,b)->a*b);
    }


    public static int calculate(String expression)
    {
        String[] exps = expression.split(" ");
        int onscreenNumber = Integer.parseInt(exps[0]);

        for (int i=1;i< exps.length;i=i+2)
        {

             MathOperation op=  map.get( exps[i]);

             int enterednumber = Integer.parseInt(exps[i+1]);

             onscreenNumber= calculate(onscreenNumber,op,enterednumber);


        }

return onscreenNumber;
    }

    public static int calculate(int onscreenNumber,MathOperation op,int enterednumber){
        /*  here we are peroming the operation using op as it has a functional interface implementation which is stored in the mp so we are performing
        * the operation */
        return op.operation(onscreenNumber,enterednumber);
    }


    public static void main(String[] args) {
        String Expression = "1 * 2 - 1 * 2";

        System.out.println(calculate(Expression));

    }

}
