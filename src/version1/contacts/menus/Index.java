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
    this.getContactList().printList();
    return this.getContactList();
  }

}