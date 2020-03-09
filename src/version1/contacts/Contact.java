package version1.contacts;

public class Contact {
  private String name;
  private String mobile;
  private String work;
  private String home;
  private String city;

  public Contact() {
    this.name = askName();
    this.mobile = askMobile();
    this.work = askWork();
    this.home = askHome();
    this.city = askCity();
  }

  @Override
  public boolean equals(Object object) {
    Contact contact = (Contact) object;
    return this.name.equals(contact.name) && this.mobile.equals(contact.mobile);
  }

  @Override
  public String toString() {
    String str = "<" + name + "> ";
    str += "(";
    str += "mobile: " + mobile;
    if (this.work.length() > 0) {
      str += "work: " + mobile;
    }
    if (this.home.length() > 0) {
      str += "home: " + mobile;
    }
    if (this.city.length() > 0) {
      str += "city: " + mobile;
    }
    str += ")";
    return str;
  }

  private String askName() {
    while (true) {
      String input = InputCollector.getUserInput("Enter Your Name:");
      if (input.length() > 0) {
        return input;
      } else {
        System.out.println("Invalid Input: Name is empty");
      }
    }
  }

  private String askMobile() {
    while (true) {
      String input = InputCollector.getUserInput("Enter Your mobile:");
      if (input.length() > 0) {
        return input;
      } else {
        System.out.println("Invalid Input: mobile is empty");
      }
    }
  }

  private String askWork() {
    String input = InputCollector.getUserInput("Enter Your work:");
    return input;
  }

  private String askHome() {
    String input = InputCollector.getUserInput("Enter Your home:");
    return input;
  }

  private String askCity() {
    String input = InputCollector.getUserInput("Enter Your city:");
    return input;
  }
}