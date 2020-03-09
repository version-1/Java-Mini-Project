package version1.contacts.menus;

import version1.contacts.*;

public class Add extends Option {
  private String label = "Add new Contact";

  @Override
  public String getLabel() {
    return this.label;
  }

  @Override
  public ContactList run () {
    Contact contact = new Contact();
    this.getContactList().addContact(contact);
    return this.getContactList();
  }

}