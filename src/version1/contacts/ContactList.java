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
    for ( int i = 0; i < size(); i++) {
      System.out.println(i + ". " + this.list.get(i).toString());
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

  public String updateContact(int index, Contact contact) {
    if (index <= 0 || index >= list.size()) {
      return "Not Found.The index doesn't exist.";
    }
    this.list.set(index, contact);
    return "";
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
    while (true) {
      int num = InputCollector.getInputAsPositiveInt("Enter Your Index:");
      int listSize = this.list.size();
      if (num < 0 || num > listSize) {
        System.out.println("Invalid Input: Enter number between 0 " + "and " + Integer.toString(listSize - 1));
      } else {
        return num;
      }
    }
  }
}