package Basic;
import java.util.Scanner;

public class Ifelse3 {

    public static void main(String[] args) {


        Scanner value = new Scanner(System.in);
        int num = value.nextInt();



        if (num%3 == 0 && num%5 == 0)
        {
            System.out.println("It is divisible by both 3 and 5");
        }
    else{
            System.out.println("not divisible");
        }
    }
}
