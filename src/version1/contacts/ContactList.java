package version1.contacts;

import java.util.List;

public class ContactList {
  private List<Contact> list;

  public ContactList(List<Contact> list) {
    this.list = list;
  }

  public int size() {
    return this.list.size();
  }

  public void printList() {
    for(Contact contact : this.list) {
      System.out.println(contact.toString());
    }
  }

  public String addContact(Contact contact) {
    if (hasDuplicated(contact)) {
      return "Contact is Already Exist";
    }
    this.list.add(contact);
    return "";
  }

  public String removeContact(int index) {
    if (index >= list.size()) {
      return "Not Found.The index doesn't exist.";
    }
    this.list.remove(index);
    return "";
  }

  public void updateContact(int index, Contact contact) {
    this.list.set(index, contact);
  }

  private boolean hasDuplicated(Contact contact) {
    for (Contact item: list) {
      if (item.equals(contact)) {
        return true;
      }
    }
    return false;
  }

  public int askIndex() {
    int num = -1;
    while (num <= 0) {
      String input = InputCollector.getUserInput("Enter Your Option:");
      num = Integer.parseInt(input);
      int listSize = this.list.size();
      if (num <= 0 || num >= listSize) {
        System.out.println("Invalid Input: Enter number between 1 " + "and " + listSize);
      }
    }
    return num;
  }
}