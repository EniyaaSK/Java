package Basic;
import java.util.Scanner;

public class code1 {
    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);
        String Name = info.nextLine();
        int Age = info.nextInt();
        info.nextLine();
        String Address = info.nextLine();
        System.out.println("My name is "+Name);
        System.out.println("My age is "+Age);
        System.out.println("My address is "+Address);
    }
}
