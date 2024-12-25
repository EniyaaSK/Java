package Basic;

import java.util.Scanner;
public class score {
    public static void main(String[] args) {

        Scanner variable = new Scanner(System.in);
        String name = variable.nextLine();
        double score = variable.nextDouble(); // double is used to get output in decimal
        variable.nextLine();
        String dept = variable.nextLine();
        double a = score / 10;
        System.out.println("My name is "+ name);
        System.out.println("My score is "+a+"/10");
        System.out.println("My dept is "+dept);

    }
}
