import java.util.Scanner;
public class NumeroMayor{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int M;

    System.out.println("Enter a  first number: ");
    int A= input.nextInt();
    System.out.println("Enter a second number: ");
    int B= input.nextInt();


    if (  A > B)
       M= A;

    else
        M= B;


System.out.println("the higher number is: " + M);
}

}
