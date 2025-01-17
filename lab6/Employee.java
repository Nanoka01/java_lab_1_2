package lab6;

public class Employee {
    private static String nationality = "Thai";
    private String name;
    private Wallet wallet;
    private int energy;

    public Employee() {
        this.name = "Unknown";
        this.wallet = new Wallet();
        this.energy = 0;
    }

    // Constructor with parameters
    public Employee(String name, Wallet wallet, int energy) {
        this.name = name;
        this.wallet = wallet;
        this.energy = energy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public void eat(Food f) {
        this.energy += Food.getEnergy();
    }

    public boolean buyFood(Seller s) {
        Food food = s.sell(this);
        if (food != null) {
            this.eat(food); // เพิ่มพลังงาน
            return true;
        }
        return false;
    }

    public boolean equals(Employee e) {
        return this.name.equals(e.getName());
    }

    @Override
    public String toString() {
        return "My name is " + name + ". \nI have " + energy + " energy left.\nI have a balance of " + wallet.getBalance() + " baht.";
    }

    public static String getNationality() {
        return nationality;
    }

    public static void setNationality(String nationality) {
        Employee.nationality = nationality;
    }
}
