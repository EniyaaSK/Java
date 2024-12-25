package Basic;

public class MethodOverloading {
    void sum(int a,int b)
    {
        System.out.println(a+b);
    }
    void sum(int a,int b,int c)
    {
        System.out.println(a+b+c);
    }

    public static void main(String[] args) {
        MethodOverloading add =new MethodOverloading();
        add.sum(69,91); //This prints 1st method
        add.sum(12,45,33);// This prints 2nd  method

    }
}
