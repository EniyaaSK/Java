package Basic;
import java.util.Scanner;
public class Ifelse {
    public static void main(String[] args) {
        Scanner mark = new Scanner(System.in);
        int Score = mark.nextInt();

        if (Score > 35)
        {
            System.out.println("Yu r pass");
        }
        else {
            System.out.println("Try again");
        }
    }

}
