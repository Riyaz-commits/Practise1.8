

public interface greetService{

    String greet(String greetmessage);

}

 class PractiseStream {

    public static void main(String args[])
    {
      //  greetService gt= (n) -> n.toUpperCase() ;
      //  System.out.println(    gt.greet("Hello Good Morning"));


     //   test((k)-> k.toUpperCase()+k.length());
       //  test(gt);
         test( (n) -> n.toUpperCase()+n.length());
 test(n->n);
    }

    public static void test(greetService g)
    {
    String returnedstatement =    g.greet("Hey Alima");
        System.out.println(returnedstatement);
    }

 }
