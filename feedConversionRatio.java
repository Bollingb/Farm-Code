import java.util.Scanner;
import java.text.DecimalFormat;

public class feedConversionRatio {

  public static void main(String[] args) {

  Scanner scan = new Scanner(System.in);
  System.out.println();
  System.out.println("What was your total amount of feed used in lbs?");
  double feedweight = scan.nextDouble();
  System.out.println();
  System.out.println("What was the total processed weight in lbs of chicken?");
  double weightharvested = scan.nextDouble();
  System.out.println();
  System.out.println("Your feed conversion ratio is : ");
  System.out.println();
  double ratio = (feedweight / weightharvested);
  System.out.println(ratio + " pounds of feed for every 1 pound of meat");


  }
}
