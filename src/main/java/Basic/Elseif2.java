package Basic;
import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;

public class Elseif2 {
    public static void main(String[] args) {
        Scanner mark = new Scanner(System.in);
        int a = mark.nextInt();
        int b= mark.nextInt();
        int c= mark.nextInt();
        int sum = a+b+c;
        int avg = sum/3;

        if(avg <35)
        {
            System.out.println("Additional class req");
        }
        else{
            System.out.println("Yu r good to goo");
        }
    }
}
