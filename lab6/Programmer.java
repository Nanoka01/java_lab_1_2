package lab6;

public class Programmer extends Employee {
    private int happiness; // ความสุขของ Programmer

    public Programmer() {
        super(); // เรียกใช้ Constructor ของ Employee
    }

    // Constructor
    public Programmer(String name, Wallet wallet, int energy, int happiness) {
        super(name, wallet, energy); // เรียก constructor ของ Employee
        this.happiness = happiness; // กำหนดความสุขของ Programmer
    }

    // Getter สำหรับ happiness
    public int getHappiness() {
        return happiness;
    }

    // Setter สำหรับ happiness
    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }

    // เมธอด coding ที่รับ String เป็นพารามิเตอร์
    public void coding(String str) {
        if (getEnergy() >= 30) { // ถ้า energy มากกว่าหรือเท่ากับ 30
            System.out.println("Your code is " + str); // แสดงข้อความที่ระบุ
            setEnergy(getEnergy() - 30); // ลด energy ลง 30
            happiness -= 30; // ลด happiness ลง 30
        } else { // ถ้า energy น้อยกว่า 30
            System.out.println("Error Error Error"); // แสดงข้อความ error
            setEnergy(getEnergy() - 30); // ลด energy ลง 30
            happiness -= 30; // ลด happiness ลง 30
        }
    }

    // เมธอด coding ที่รับ char เป็นพารามิเตอร์
    public void coding(char str) {
        if (getEnergy() >= 30) { // ถ้า energy มากกว่าหรือเท่ากับ 30
            System.out.println("Your code is " + str); // แสดงข้อความที่ระบุ
            setEnergy(getEnergy() - 30); // ลด energy ลง 30
            happiness -= 30; // ลด happiness ลง 30
        } else { // ถ้า energy น้อยกว่า 30
            System.out.println("Error Error Error"); // แสดงข้อความ error
            setEnergy(getEnergy() - 30); // ลด energy ลง 30
            happiness -= 30; // ลด happiness ลง 30
        }
    }
}
