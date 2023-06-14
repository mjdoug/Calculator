import java.util.Scanner;

public class Main {
  private static float a;
  private static float b;
  private static String Equation;
  public static void main(String[] args) {
    System.out.println("What operation would you like to use?");
    Scanner scan = new Scanner(System.in);
    Equation = scan.nextLine();
    Equation();
  }
  public static void Equation(){
    Scanner scan = new Scanner(System.in);
    System.out.println("What is the first number you would like to use?");
    a = scan.nextFloat();
    System.out.println("What is the second number you would like to use?");
    b = scan.nextFloat();
    if (Equation.equals("+")){
      EquationPlus();
    }
    if (Equation.equals("-")){
      EquationMinus();
    }
    if (Equation.equals("*")){
      EquationTimes();
    }
    if (Equation.equals("/")){
      EquationDivide();
    }
  }
  public static void EquationPlus(){
    System.out.println( a + b );
  }
  public static void EquationMinus(){
    System.out.println( a - b );
  }
  public static void EquationTimes(){
    System.out.println( a * b );
  }
  public static void EquationDivide(){
    System.out.println( a / b );
  }
}