//Demonstrates the use of CreditCard class

public class CreditCardDemo {
  public static void main(String[] args) {
    final Money LIMIT = new Money(1000);
    final Money FIRST_AMOUNT = new Money(200);
    final Money SECOND_AMOUNT = new Money(10.02);
    final Money THIRD_AMOUNT = new Money(25);
    final Money FOURTH_AMOUNT = new Money(990);

    Person owner = Person("Christine", "Diana", new Address("237J Harvey Hall", "Menomonie", "WI", "54751"));
    CreditCard visa = new CreditCard(owner, LIMIT);

    System.out.println(visa);
    System.out.println("Balance: " + visa.getBlance());
    System.out.println("Credit Limit: " + visa.getCreditLimit());
    System.out.println();

    System.out.printf("Attempt to charge" + FIRST_AMOUNT);
    visa.charge(FIRST_AMOUNT);
    System.out.print("Balance: " + visa.getBlance());

    System.out.printf("Attempt to charge" + SECOND_AMOUNT);
    visa.charge(SECOND_AMOUNT);
    System.out.print("Balance: " + visa.getBlance());

    System.out.printf("Attempt to pay " + THIRD_AMOUNT);
    visa.payment(THIRD_AMOUNT);
    System.out.print("Balance: " + visa.getBlance());

    System.out.printf("Attempt to pay " + FOURTH_AMOUNT);
    visa.payment(FOURTH_AMOUNT);
    System.out.print("Balance: " + visa.getBlance());
  }

  private static Person Person(String string, String string2, Address address) {
    
    //TO DO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'Person'");
  }

  }
  
