package Basic;
import java.util.Scanner;
public class ifelse4 {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        int numb = value.nextInt();

        if(numb%2 == 0){
            System.out.println("It is even");
        }
        else {
            System.out.println("It is odd");
        }
    }
}
