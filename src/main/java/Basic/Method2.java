package Basic;

public class Method2 {
    int apple_price = 20;
    int apple_count = 5;

    public void total_amt(){
        System.out.println(apple_count*apple_price);
    }

    public static void main(String[] args) {
        Method2 cost = new Method2();
        cost.total_amt();
    }
}
