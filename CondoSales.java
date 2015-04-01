import java.util.Scanner;
public class CondoSales
{
public static void main(String[] args)
{
   int condoChoice;
   int parkViewPrice = 150000;
   int golfCoursePrice = 170000;
   int lakeViewPrice = 210000;
   int wrongChoicePrice = 0;
   Scanner condo = new Scanner(System.in);
   System.out.println("Welcome to the Summerdale Condo Sales Office.");
   System.out.println("We will help you determine the price of your new condo.");
   System.out.println("Please enter 1 for Park View, 2 for Golf Course View, or 3 for Lake View");
   condoChoice = condo.nextInt();
   switch (condoChoice) {
        case 1:
            System.out.println("You have chosen a Park View condo.");
            System.out.println ("The price is $" + parkViewPrice);
            break;
        case 2:
            System.out.println("You have chosen a Golf Course View condo.");
            System.out.println("The price is $" + golfCoursePrice);
            break;
        case 3:
            System.out.println("You have chosen a Lake View condo.");
            System.out.println("The price is $" + lakeViewPrice);
            break;
        default:
            System.out.println("You didn't pick 1, 2, or 3.");
            System.out.println("The price is $" + wrongChoicePrice);
            break;
    }
}
}