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
    ContactList list = this.getContactList();
    if (list.exists(contact)) {
      System.out.println("The contact already exists");

    } else {
      list.addContact(contact);
    }
    return this.getContactList();
  }

}