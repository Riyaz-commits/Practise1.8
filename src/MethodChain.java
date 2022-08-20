public class MethodChain {
    private int a;
    private String b;

    public MethodChain()
    {
        System.out.println("This is constructor");
    }

    public MethodChain SetA(int a)
    {
        
        this.a=a;
        return this;
    }

    public MethodChain SetB(String b)
    {
        this.b=b;
        return this;
    }

    void display()
    {
        System.out.println("value of a is "+a+"value of b is "+b);
    }
    public static void main(String[] args) {

 new MethodChain().SetA(91).SetB("Riyaz").display();
    }
}
