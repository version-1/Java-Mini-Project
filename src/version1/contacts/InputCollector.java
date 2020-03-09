package version1.contacts;

import java.util.Scanner;

public class InputCollector {
  public static String getUserInput(String prompt) {
    Scanner scan = new Scanner(System.in);
    System.out.println(prompt + " ");
    String input = scan.nextLine();
    return input;
  }

  public static int getInputAsPositiveInt(String prompt) {
    String input = getUserInput(prompt);
    try {
      return Integer.parseInt(input);
    } catch (Exception e) {
      return -1;
    }
  }
}