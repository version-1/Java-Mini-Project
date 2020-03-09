package version1.contacts;

import java.util.List;

public class ContactList {
  private List<Contact> list;

  public ContactList(List<Contact> list) {
    this.list = list;
  }

  public Contact find(int index) {
    if(index < 0 || this.list.size() <= index) {
      return null;
    }
    return this.list.get(index);
  }

  public int size() {
    return this.list.size();
  }

  public void printList() {
    for ( int i = 0; i < size(); i++) {
      System.out.println(i + ". " + this.list.get(i).toString());
    }
  }

  public void addContact(Contact contact) {
    this.list.add(contact);
  }

  public void removeContact(int index) {
    this.list.remove(index);
  }

  public void updateContact(int index, Contact contact) {
    this.list.set(index, contact);
  }

  public boolean exists(Contact contact) {
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