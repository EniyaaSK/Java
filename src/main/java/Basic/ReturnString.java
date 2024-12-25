package Basic;

public class ReturnString {
    String getname()
    {
        return"Anu";
    }

    public static void main(String[] args) {
        ReturnString name = new ReturnString();
        String myname = name.getname();
        System.out.println(myname);
    }
}
