import java.util.Scanner;
public class main
{
    public static void main(String args[])
    {
        class1 r = new class1();
        System.out.println(r.getData());
        r.setData(1, 2, 3);
        System.out.println(r.getData());
        Scanner s = new Scanner(System.in);
        r.setData(s.nextInt(),s.nextInt(),s.nextInt());
        System.out.println(r.getData());
    }
}
