import java.util.Scanner;
public class OrdenNumero{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);


    System.out.println("Enter a number: ");
    int a= input.nextInt();
    System.out.println("Enter a number: ");
    int b= input.nextInt();
    System.out.println("Enter a number: ");
    int c= input.nextInt();

    if (a > b && b > c)
    System.out.println("the numbers : " + a + ","+ b + "," + c);
    else if (a > c && c > b)
    System.out.println("the numbers : " + a + ","+ c + "," + b);
    else if (b > a && a > c)
    System.out.println("the numbers : " + b + ","+ a + "," + c);
    else if (b > c && c > a)
    System.out.println("the numbers : " + b + ","+ c + "," + a);
    else if (c > b && b > a)
    System.out.println("the numbers : " + c + ","+ b + "," + a);
    else if (c > a && a > b)
    System.out.println("the numbers : " + c + ","+ a + "," + b);
  }
}
