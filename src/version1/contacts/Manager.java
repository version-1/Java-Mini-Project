package version1.contacts;

import version1.contacts.menus.*;

public class Manager {
  final static int NORMAL_EXIT_CODE = 0;
  private static Option[] options = new Option[] { new Index(), new Add(), new Update(), new Quit() };

  public static boolean run() {
    showMenu();
    int option = askOption();
    Option menu = options[option];
    return menu.run() != null;
  }

  public static void showMenu() {
    System.out.println("+=== Contact App ===+");
    for (int i = 0; i < options.length; i++) {
      System.out.println("| " + Integer.toString(i + 1) + ". " + options[i].getLabel() + " |");
    };
    System.out.println("+===================+");
  }

  private static int askOption() {
    int num = -1;
    while (num <= 0) {
      String input = InputCollector.getUserInput("Enter Your Option:");
      num = Integer.parseInt(input);
      if (num <= 0 || num >= options.length) {
        System.out.println("Invalid Input: Enter number between 1 " + "and " + options.length);
      }
    }
    return num;
  }

}