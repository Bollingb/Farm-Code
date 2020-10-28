import java.util.Scanner;
import java.text.DecimalFormat;

public class numberchicks {

  public static void main(String[] args) {
System.out.println();
System.out.println("How many chickens do you want to have on pasture?");
System.out.println();

    double chickft = 1.6;
    double nummoves = 35;
    double acres = 41000;
    Scanner scan = new Scanner(System.in);
    double input = scan.nextDouble();
    DecimalFormat nfmt = new DecimalFormat("#.00000");
    DecimalFormat n2fmt = new DecimalFormat("#.0000");
    DecimalFormat n3fmt = new DecimalFormat("#.00");
    DecimalFormat fmt = new DecimalFormat("#.0");


    if(input <= 20)
    {
      System.out.println("How many chickens do you want per tractor?");
      System.out.println();
      double size = scan.nextDouble();
      double tsize = (size * chickft);
      double acresNeeded = ((chickft * input * nummoves) / acres);

      System.out.println();
      System.out.println("An acre is 43,560 feet but the calculation will use 41,000 to account for space between tractors");
      System.out.println();
      System.out.println("Each chicken requires 1.6 ft^2 of grass space in a tractor");
      System.out.println();
      System.out.println("You will have to move your tractor 35 times total");
      System.out.println();
      System.out.println("With these calculations we can figure out # of tractors and acres needed : ");
      System.out.println();
      System.out.println("Tractors needed : " + (fmt.format(input / size)));
      System.out.println();
      System.out.println("Your tractor size will need to be: " + (chickft * size) + "sqft");
      System.out.println();
      System.out.println("The number of acres needed:");
      System.out.println(nfmt.format(acresNeeded));
      System.out.println();

    } else if (input > 20 && input <= 100)
    {
      System.out.println("How many chickens do you want per tractor?");
      double size2 = scan.nextDouble();
      double acres2Needed = ((chickft * input * nummoves) / acres);

      System.out.println();
      System.out.println("An acre is 43,560 feet");
      System.out.println();
      System.out.println("Each chicken requires 1.6 ft^2 of grass space in a tractor");
      System.out.println();
      System.out.println("You will have to move your tractor 35 times total");
      System.out.println();
      System.out.println("With these calculations we can figure out # of tractors and acres needed : ");
      System.out.println();
      System.out.println("Tractors needed : " + (fmt.format(input / size2)));
      System.out.println();
      System.out.println("Your tractor size will need to be: " + (chickft * size2) + "sqft");
      System.out.println();
      System.out.println("The number of acres needed:");
      System.out.println(n2fmt.format(acres2Needed));
      System.out.println();

    } else
    {
      System.out.println("How many chickens do you want per tractor?");
      double size3 = scan.nextDouble();
      double acres3Needed = ((chickft * input * nummoves) / acres);

      System.out.println();
      System.out.println("An acre is 43,560 feet");
      System.out.println();
      System.out.println("Each chicken requires 1.6 ft^2 of grass space in a tractor");
      System.out.println();
      System.out.println("You will have to move your tractor 35 times total");
      System.out.println();
      System.out.println("With these calculations we can figure out # of tractors and acres needed : ");
      System.out.println();
      System.out.println("Tractors needed : " + (fmt.format(input / size3)));
      System.out.println();
      System.out.println("Your tractor size will need to be: " + (chickft * size3) + "sqft");
      System.out.println();
      System.out.println("The number of acres needed:");
      System.out.println(n3fmt.format(acres3Needed));
      

      }


    }

  }
