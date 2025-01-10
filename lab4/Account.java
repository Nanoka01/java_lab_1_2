package lab4;

public class Account {
    public double balance;
    public String name;
 
    public void deposit(double b){
        if (b >= 0 ) {
            balance += b;
        }else{
            System.out.println("The balance variable must be greater than or equal to zero.");
        }
    }

    public double withdraw(double b) {
        if (b >= 0) { // ตรวจสอบว่าค่า b มากกว่าหรือเท่ากับ 0
            if (balance >= b) { // ตรวจสอบว่า balance เพียงพอ
                balance -= b; // หักเงินในบัญชี
                return b; // คืนจำนวนเงินที่ถอน
            } else {
                System.out.println("Your account balance is insufficient."); // เงินไม่พอ
                return 0; // คืนค่าเป็น 0
            }
        } else {
            System.out.println("The balance variable must be greater than or equal to zero."); // b น้อยกว่า 0
            return 0; // คืนค่าเป็น 0
        }
    }


    public void showInfo() {
        System.out.println("In " + name + " account, there is a balance equal to " + balance + " baht.");
    }
}
