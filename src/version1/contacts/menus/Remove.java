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
    int index = this.getContactList().askIndex();
    String error = this.getContactList().removeContact(index);
    if (error.length() > 0) {
      System.out.println(error);
    }
    return this.getContactList();
  }
}
