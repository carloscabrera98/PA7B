import java.util.Scanner;
public class NumeroPositivo{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String R;

    System.out.println("Enter a number: ");
    int NUM= input.nextInt();




    if (  NUM > 0){
        R= "Positive";

    }else{
      R= "Negative";
}

      System.out.println("the number is: " + R);

      }

}
