import java.util.Scanner;
public class NumeroPositivo{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);


    System.out.println("Enter a  first number: ");
    int NUM= input.nextInt();




    if (  NUM > 0) {
        System.out.println("The number is positive");
    }
    else
        System.out.println("the number is negative");

      }

}
