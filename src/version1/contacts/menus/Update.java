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
    if (this.getContactList().size() == 0) {
      return this.getContactList();
    }
    this.getContactList().printList();
    int index = this.getContactList().askIndex();
    if(this.getContactList().find(index) != null) {
      this.getContactList().updateContact(index, new Contact());
    } else {
      System.out.println("Not Found. The index doesn't exist.");
    }
    return this.getContactList();
  }

}
