package version1.contacts;

import java.util.ArrayList;

import version1.contacts.menus.*;

public class Driver {
  private static Option[] options = new Option[] { new Index(), new Add(), new Remove(), new Update(), new Quit() };
  public static void main(String[] args) {
    ContactList list = new ContactList(new ArrayList<Contact>());
    while (list != null) {
      list = run(list);
    }
  }

  public static ContactList run(ContactList list) {
    showMenu();
    int index = askOption();
    Option option = options[index - 1];
    option.setContactList(list);;
    return option.run();
  }

  public static void showMenu() {
    String header = "+===   Contact App   ===+";
    System.out.println(header);
    for (int i = 0; i < options.length; i++) {
      String str = "| " + Integer.toString(i + 1) + ". " + options[i].getLabel();
      int paddingSize = header.length() - str.length() - " |".length();
      for (int j = paddingSize; j > 0; j--) {
        str += " ";
      }
      System.out.println(str + " |");
    };

    System.out.print("+");
    for (int i = 0; i< header.length() - 2; i++) {
      System.out.print("=");
    }
    System.out.println("+");
  }

  private static int askOption() {
    while (true) {
      int num = InputCollector.getInputAsPositiveInt("Enter Your Index:");
      if (num <= 0 || num > options.length) {
        System.out.println("Invalid Input: Enter number between 1 " + "and " + options.length);
        num = -1;
      } else {
        return num;
      }
    }
  }
}