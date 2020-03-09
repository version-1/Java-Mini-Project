package version1.contacts.menus;

import version1.contacts.*;

public class Index extends Option {
  private String label = "List all Contacts";

  @Override
  public String getLabel() {
    return this.label;
  }

  @Override
  public ContactList run () {
    System.out.println();
    this.getContactList().printList();
    System.out.println();
    return this.getContactList();
  }

}