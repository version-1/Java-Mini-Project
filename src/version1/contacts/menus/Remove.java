package version1.contacts.menus;

import version1.contacts.*;

public class Remove extends Option {
  private String label = "Remove Contact";

  @Override
  public String getLabel() {
    return this.label;
  }

  @Override
  public ContactList run () {
    if (this.getContactList().size() == 0) {
      return this.getContactList();
    }
    this.getContactList().printList();
    int index = askIndex();
    this.getContactList().removeContact(index);
    return this.getContactList();
  }

  private int askIndex() {
    int num = -1;
    while (num <= 0) {
      String input = InputCollector.getUserInput("Enter Your Option:");
      num = Integer.parseInt(input);
      int listSize = this.getContactList().size();
      if (num <= 0 || num >= listSize) {
        System.out.println("Invalid Input: Enter number between 1 " + "and " + listSize);
      }
    }
    return num;
  }
}
