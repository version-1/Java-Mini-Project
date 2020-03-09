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
    ContactList list = this.getContactList();
    if (list.size() == 0) {
      return list;
    }
    list.printList();
    int index = list.askIndex();
    if(list.find(index) != null) {
      list.removeContact(index);
    } else {
      System.out.println("Not Found. The index doesn't exist.");
    }
    return this.getContactList();
  }
}
