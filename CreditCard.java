//Models a credit card with a balance, credit limit, and owner

public class CreditCard {
  private Money balance;
  private Money creditLimit;
  private Person owner;
 
  //Constructor
  
  public CreditCard(Person newCardHolder, Money limit){
    this.owner = newCardHolder;
    this.creditLimit = new Money(limit);
    this.balance = new Money(0);
  }

  //Get balance

  public Money getBlance() {
    return new Money(balance);
  }

  //Get credit limit
  
  public Money getCreditLimit() {
    return new Money(creditLimit);
  }

  //Get owner details
  
  public String getPersonals() {
    return owner.toString();
  }

  //Charge method
  
  public void charge(Money amount) {
    if (balance.add(amount).compareTo(creditLimit) <= 0) {
      balance = balance.add(amount);
      System.out.print("Charge: " + amount);
    } else {
      System.out.print("Exceeds credit limit");
    }
  }

  //Payment method
  
  public void payment(Money amount) {
    balance = balance.subtract(amount);
    System.out.print("Payment: " + amount);
  
  }
}
