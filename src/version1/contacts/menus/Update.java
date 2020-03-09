package version1.contacts.menus;

import version1.contacts.*;

public class Update extends Option {
  private String label = "Update Contact";

  @Override
  public String getLabel() {
    return this.label;
  }

  @Override
  public ContactList run () {
    this.getContactList().printList();
    int index = this.getContactList().askIndex();
    this.getContactList().updateContact(index, new Contact());
    return this.getContactList();
  }

}
