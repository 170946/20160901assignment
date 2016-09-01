import java.util.Scanner;
public class main
{
    public static void main(String args[])
    {
        class1 r = new class1(); //creates object r of datatype class1
        System.out.println(r.getData()); //prints r's properties
        r.setData(1, 2, 3); //changes r's properties
        System.out.println(r.getData()); //prints the changed version of r's properties
        Scanner s = new Scanner(System.in); //creates a scanner to take in user input
        r.setData(s.nextInt(),s.nextInt(),s.nextInt()); //changes r's properties to the user input
        System.out.println(r.getData()); //prints r's properties to be the user input
    }
}
