import java.util.Scanner;

public class ComputeChange{
  public static void main(String[] args) {
    //
    Scanner input = new Scanner(System.in);
    //
    System.out.println("Enter an amount in double: ");
    double amount = input.nextDouble();

    int cents = (int) (amount * 100);

  //FIND THE NUMBER OF DOLLARS
  int numberOfDollars = cents / 100;
  cents = cents % 100;

  // FIND THE QUARTERS
  int numberOfQuarters = cents / 25;
  cents = cents % 25;

  //Number of dimes
int numberOfDimes = cents / 10;
cents = cents % 10;

//number of nickels
int numberOfNickels = cents / 5;
cents = cents % 5;

//number of pennies
int numberOfPennies = cents;

  System.out.println("Your Amount " + amount + "consist of \n" +
  "\t" + numberOfDollars +" dollars " +
  "\t" + numberOfQuarters + " quarters " +
  "\t" + numberOfDimes + " dimes " +
  "\t" + numberOfNickels + " nickels " +
  "\t" + numberOfPennies + " pennies ");
  }
}
