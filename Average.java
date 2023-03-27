import java.util.Scanner;
public class Average {

 public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the 1st: ");
        double a = in.nextDouble();
        System.out.print("Input the 2nd: ");
        double b = in.nextDouble();
        System.out.print("Input the 3rd: ");
        double c = in.nextDouble();
        System.out.print("The average value is " + average(a, b, c)+"\n" );
    }

  public static double average(double a, double b, double c)
    {
        return (a + b + c) / 3;
    }
}