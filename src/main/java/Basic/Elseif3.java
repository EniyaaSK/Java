package Basic;

public class Elseif3 {
    public static void main(String[] args) {
        String traffic = "red";
        if (traffic.equals("red"))
        {
            System.out.println("stop");
        }
        else if (traffic== "yellow") {
            System.out.println("wait");
        }
        else {
            System.out.println("gooo!!!");
        }
    }
}
