import java.util.Scanner;
public class AlgoritmoUvas{
public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
double GA;
final String A = "A";
final String B = "B";

System.out.println("Enter the type of grape: ");
String TI = input.nextLine();
System.out.println("Enter the size of grape: ");
int TA = input.nextInt();
System.out.println("Enter the price of grape: ");
double P = input.nextInt();
System.out.println("Enter the KG of production: ");
int K = input.nextInt();

if (TI.equals(A)){
    if (TA== 1){
      P= P + 0.20;
    }else{
      P= P + 0.30;
}
} if (TI.equals(B)){
    if (TA== 1){
      P= P - 0.30;
    } else {
      P= P - 0.50;
}
}
 GA= P * K;

System.out.println("Your ganancy is : "+ GA);
  }
}
