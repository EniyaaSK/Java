package Basic;
import java.util.Scanner;
public class ArrayCreation {
    public static void main(String[] args) {


        int[] score = new int[3];
        Scanner scan = new Scanner(System.in);

        score[0] = scan.nextInt();
        score[1] = scan.nextInt();
        score[2] = scan.nextInt();

        System.out.println(score[0]+score[1]+score[2]);
    }
}
