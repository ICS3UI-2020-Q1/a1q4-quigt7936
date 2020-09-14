import java.util.Scanner;
/**
 * Figures out the slope given the x and y coordinates of two points
 * @ThomasQuigley 
 */
public class Main {


  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // ask for the coordinates
    System.out.println("Please enter in the x coordinate of the first point");
    double x1 = input.nextInt();

    System.out.println("Please enter in the y coordinate of the first point");
    double y1 = input.nextInt();

    System.out.println("Please enter in the x coordinate of the second point");
    double x2 = input.nextInt();

    System.out.println("Please enter in the y coordinate of the second point");
    double y2 = input.nextInt();

    // figure out the slope
    double slope = (y2 - y1) / (x2 - x1);

    // tell them their slope
    System.out.println("The slope of your line would be " + slope + ".");
    
  }
}
