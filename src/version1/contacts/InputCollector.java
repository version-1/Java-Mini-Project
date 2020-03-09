package version1.contacts;

import java.util.Scanner;

public class InputCollector {
  public static String getUserInput(String prompt) {
    Scanner scan = new Scanner(System.in);
    System.out.print(prompt + " ");
    String input = scan.nextLine();
    return input;
  }
}