package version1.contacts.menus;

import version1.contacts.*;

public abstract class Option {
  private ContactList list;
  public ContactList getContactList() {
    return this.list;
  };
  public void setContactList(ContactList list) {
    this.list = list;
  };
  public abstract String getLabel();
  public abstract ContactList run();
}