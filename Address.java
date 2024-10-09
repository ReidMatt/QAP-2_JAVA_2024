//Models an address with street, city, state and zip

public class Address {
  private String Street;
  private String city;
  private String state;
  private String zip;

  //Constructor
  public Address(String street, String city, String state, String zip) {
    this.Street = street;
    this.city = city;
    this.state = state;
    this.zip = zip;

  }

  //toString method to display address
  @Override

  public String toString() {
    return Street + "," + city + "," + state + " " + zip;
  }

}
