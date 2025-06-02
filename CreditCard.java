// Represents a credit card with an owner, balance, and credit limit

public class CreditCard {
    private Person owner;
    private Money balance;
    private Money creditLimit;

    // Constructor
    public CreditCard(Person owner, Money creditLimit) {
        this.owner = owner;
        this.creditLimit = new Money(creditLimit); 
        this.balance = new Money(0);               
    }

    // Get copy of balance
    public Money getBalance() {
        return new Money(balance);
    }

    // Get copy of credit limit
    public Money getCreditLimit() {
        return new Money(creditLimit);
    }

    // Get  owner info
    public String getPersonals() {
        return owner.toString();
    }

    // Attempt to charge the card
    public void charge(Money amount) {
        Money newBalance = new Money(balance);
        newBalance.add(amount);

        if (newBalance.compareTo(creditLimit) <= 0) {
            balance.add(amount);
        } else {
            System.out.println("Exceeds credit limit");
        }
    }

    // Make a payment
    public void payment(Money amount) {
        balance.subtract(amount);
    }
}
