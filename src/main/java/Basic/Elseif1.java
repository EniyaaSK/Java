package Basic;

public class Elseif1 {
    public static void main(String[] args) {
        int score = 80;

        if (score<50){
            System.out.println("You nee to improve");
        }
        else if (score>=50 && score <=70) {
            System.out.println("Good job");
        }
        else {
            System.out.println("Excellent performance");
        }
    }
}
