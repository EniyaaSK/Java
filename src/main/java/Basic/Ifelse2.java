package Basic;
import java.util.Scanner;
public class Ifelse2 {
    public static void main(String[] args) {
        Scanner amt = new Scanner(System.in);
        int income = amt.nextInt();

        if(income>7000)
        {
            System.out.println("Scholarship is available");
        }
        else {
            System.out.println("Not eligible for scholarship");
        }
    }

}
