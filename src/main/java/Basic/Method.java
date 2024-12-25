package Basic;

public class Method {
    int a = 10;
    int b = 20;

    public void addition() {
        System.out.println(a + b);
    }


    public static void main(String[] args) {
        Method add = new Method();
        add.addition();// obj.methodname();
//        addition(); // If we are calling only with method name we have to use static in line 7
                      //Line 7 "static void addition();"
    }
}