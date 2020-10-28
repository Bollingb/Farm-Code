import java.util.Scanner;

public class Chickarea {

  public static void main(String[] args) {
System.out.println();
System.out.println("How many acres of pasture do you have to use?");

    Scanner scan = new Scanner(System.in);
    double input = scan.nextDouble();

    if(input <= 20)
    {
      System.out.println("You are considered small scale");
      System.out.println();
      System.out.println("You can fit this many chicken tractors on your land : ");
      System.out.println();
      System.out.println((43560*input) / 7200); //assuming 200 chickens per tractor
    } else if (input > 20 && input <= 40)
    {
      System.out.println("You are considered medium scale");
      System.out.println();
      System.out.println("You can fit this many chicken tractors on your land : ");
      System.out.println();
      System.out.println((43560*input) / 7200);
    } else
    {
      System.out.println("You are doing considered large scale");
      System.out.println();
      System.out.println("You can fit this many chicken tractors on your land : ");
      System.out.println();
      System.out.println((43560*input) / 7200);
    }

  }
}
