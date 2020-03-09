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
    String error = this.getContactList().addContact(contact);
    if (error.length() > 0) {
      System.out.println(error);
    }

    return this.getContactList();
  }

}