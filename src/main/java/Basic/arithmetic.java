package Basic;

import java.util.Scanner;
public class arithmetic {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int a = num.nextInt();
        int b = num.nextInt();
        int c = num.nextInt();
        int d = a*b*c;
        int e = a+b+c;
        System.out.println(d/e);
    }
}
