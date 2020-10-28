import java.util.Scanner;
import java.text.DecimalFormat;

public class broilercost {

  public static void main(String[] args) {

Scanner scan = new Scanner(System.in);

System.out.println("How much did the chicks cost in total? ");

double chickCost = scan.nextDouble();

System.out.println("How much did feed cost in total? ");

double feedCost = scan.nextDouble();

System.out.println("How much did water cost in total? ");

double waterCost = scan.nextDouble();

System.out.println("How much did heating cost in total? ");

double heatingCost = scan.nextDouble();

System.out.println("How much did shavings cost in total? ");

double shavingsCost = scan.nextDouble();

System.out.println("How much did processing cost in total? ");

double processingCost = scan.nextDouble();

System.out.println("Amount of any other additional expenses");

double otherCost = scan.nextDouble();

System.out.println("How much total will you make from selling all of your chickens?");

double profit = scan.nextDouble();

double totalcost = (chickCost + feedCost + waterCost + heatingCost + shavingsCost + processingCost + otherCost);

System.out.println("Your total Gross income 'total earned without expenses included' amounts to :$" + profit);

System.out.println("Your total Net income 'total earned with expenses included' amounts to :$" + (profit - totalcost));


  }
}
