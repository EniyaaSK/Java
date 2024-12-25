package Basic;

public class Return {
    int getphoneno(int numb)
    {
        System.out.println(numb);
        return numb;

    }

    public static void main(String[] args) {
        Return obj = new Return();
        obj.getphoneno(11);
    }
}
