package version1.contacts.menus;

import version1.contacts.*;

public class Quit extends Option {
  private String label = "Update Contact";

  @Override
  public String getLabel() {
    return this.label;
  }

  @Override
  public ContactList run () {
    return null;
  }

}
