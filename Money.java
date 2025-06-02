// Represents a monetary amount with basic operations

public class Money {
    private double amount;

    // Constructor with amount
    public Money(double amount) {
        this.amount = amount;
    }

    // Copy constructor
    public Money(Money other) {
        this.amount = other.amount;
    }

    // Add amount from another Money object
    public void add(Money other) {
        this.amount += other.amount;
        System.out.println("Charge: " + other);
    }

    // Subtract amount from another Money object
    public void subtract(Money other) {
        this.amount -= other.amount;
        System.out.println("Payment: " + other);
    }

    // Getter
    public double getAmount() {
        return amount;
    }

    // Equals method
    public boolean equals(Money other) {
        return Double.compare(this.amount, other.amount) == 0;
    }

    // compareTo method: positive if greater, 0 if equal, negative if less
    public int compareTo(Money other) {
        return Double.compare(this.amount, other.amount);
    }

    // toString method
    public String toString() {
        return String.format("$%.2f", amount);
    }
}
