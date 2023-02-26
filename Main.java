import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a word:");
    String input = scan.nextLine();
    //Your code will return the length of the entered String
    System.out.println(input.length());
  }
}
