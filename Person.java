//Models a person with a name and an address

public class Person {
  private String firstName;
  private String lastName;
  private Address home;

  //Constructor
  public Person(String firstName, String lastName, Address home) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.home = home;
  }

  //toString medthod to display person
  @Override

  public String toString() {
    return lastName + " " + firstName + "," + home.toString();
  }

}
