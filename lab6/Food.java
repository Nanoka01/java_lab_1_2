package lab6;

public class Food {
    private static final int energy = 10; // พลังงานคงที่สำหรับทุกออบเจ็กต์
    private static double price = 50;    // ราคาสำหรับทุกออบเจ็กต์

    // Setter สำหรับ price
    public static void setPrice(double price) {
        Food.price = price;
    }

    // Getter สำหรับ price
    public static double getPrice() {
        return price;
    }

    // Getter สำหรับ energy
    public static int getEnergy() {
        return energy;
    }
}




