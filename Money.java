//Models money with dollars and cents, includes a copy constructor and basic operations.

public class Money {
  private long dollars;
  private long cents;

  //Constructor with double amount
  public Money(double amount) {
    if (amount < 0) {
      throw new IllegalArgumentException("Amount cannot be negative.");
    }
    this.dollars = (long) amount;
    this.cents = Math.round((amount - dollars) * 100);
  
  this.dollars = (long) amount;
  this.cents = Math.round((amount - dollars) * 100);
}

//Copy constructor
public Money(Money other) {
  this.dollars = other.dollars;
  this.cents = other.cents;
}

//Add money to this object
public Money add(Money otherAmount) {
  long totalCents = this.cents + otherAmount.cents;
  long newDollars = this.dollars + otherAmount.dollars + (totalCents /100);
  long newCents = totalCents % 100;
  return new Money(newDollars + (newCents / 100.0));
}

//Subtract money from object
public Money subtract(Money otherAmount) {
  long totalCentsThis = this.dollars * 100 + this.cents;
  long totalCentsOther = otherAmount.dollars * 100 + otherAmount.cents;
  long newCents = totalCentsThis - totalCentsOther;

  if (newCents < 0) {
    throw new IllegalArgumentException("Cannot subtract more than available money.");
  }

  long newDollars = newCents / 100;
  newCents = newCents % 100;

  return new Money(newDollars + (newCents /100.0));
}

//Compare this money with another

public int compareTo(Money otherObject) {
  if (this.dollars == otherObject.dollars && this.cents == otherObject.cents) {
    return 0;
  }else if (this.dollars > otherObject.dollars || (this.dollars == otherObject.dollars && this.cents > otherObject.cents)) {
    return 1;
  } else {
    return -1;
  }
}

//Equals method
@Override
public boolean equals(Object obj) {
  if (this == obj) return true;
  if (!(obj instanceof Money)) return false;
  Money money = (Money) obj;
  return dollars == money.dollars && cents == money.cents;
}

//toString method to display money
@Override
public String toString () {
  return String.format("$%d.%02d", dollars, cents);
}

}