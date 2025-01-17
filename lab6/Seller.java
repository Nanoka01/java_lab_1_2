package lab6;

public class Seller extends Employee {

    public Seller() {
        super(); // เรียก Default Constructor ของ Employee
    }

    // Constructor with parameters
    public Seller(String name, Wallet wallet, int energy) {
        super(name, wallet, energy);
    }

    public Food sell(Employee e) {
        if (e.getWallet().getBalance() >= Food.getPrice()) {
            e.getWallet().setBalance(e.getWallet().getBalance() - Food.getPrice());
            this.getWallet().setBalance(this.getWallet().getBalance() + Food.getPrice());
            return new Food();
        } else {
            System.out.println("Your money is not enough.");
            return null;
        }
    }
}


