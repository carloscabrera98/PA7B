import java.util.Scanner;
public class NumeroMayor{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);


    System.out.println("Enter a  first number: ");
    int A= input.nextInt();
    System.out.println("Enter a second number: ");
    int B= input.nextInt();


    if (  A > B) {
        System.out.println("the numbers : " + A + ","+ B);
    }
    else 
        System.out.println("the numbers : " + B + ","+ A);

      }

}
