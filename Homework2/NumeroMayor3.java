import java.util.Scanner;
public class NumeroMayor3{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int M;


    System.out.println("Enter a  first number: ");
    int A= input.nextInt();
    System.out.println("Enter a second number: ");
    int B= input.nextInt();
    System.out.println("Enter a third number: ");
    int C= input.nextInt();


 if (A > B && A > C) {
    M= A;
  } else if (B > A && B > C) {
    M= B;
  } else {
    M=C;
}

System.out.println("the higher number is: " + M);
}

}
