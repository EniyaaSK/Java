package Basic;

public class FunctionwithParameter {
    void sub (int a,int b)
    {
        System.out.println(a-b);
    }

    public static void main(String[] args) {
        FunctionwithParameter ans = new FunctionwithParameter();
        ans.sub(25,10);
    }
}
