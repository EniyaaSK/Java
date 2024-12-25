package Basic;
import java.util.Scanner;

public class Nestedif {
    public static void main(String[] args) {
        Scanner loan = new Scanner(System.in);
        System.out.println("enter salary:");
        int salary = loan.nextInt();
        System.out.println("enter age");
        int age = loan.nextInt();

        if (salary>=20000 || age<=25)
        {
            System.out.println("YOU r eligible");
            System.out.println("loan amt:");
            int loan_amt = loan.nextInt();

            if (loan_amt<=50000)
            {
                System.out.println("LOAN is available");
            }
            else{
                System.out.println("Maximum loan amt");
            }
        }
        else {
            System.out.println("Not eligible");
        }
    }
}
