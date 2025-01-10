package lab4;

public class Fraction {
    public int topN; // ตัวเศษ
    public int btmN; // ตัวส่วน

    // เมธอด toFraction()แปลงเป็นรูปเศษส่วนในรูป String
    public String toFraction() {
        return topN + "/" + btmN;
    }

    // เมธอด toFloat()แปลงเป็นค่าทศนิยมในรูป String
    public String toFloat() {
        return String.valueOf((double) topN / btmN);
    }

    // เมธอด addFraction(Fraction f) - บวกเศษส่วน
    public void addFraction(Fraction f) {
        if (btmN == f.btmN) {
            topN = topN + f.topN;
        } else {
            topN = (topN * f.btmN) + (f.topN * btmN);
            btmN = btmN * f.btmN;
        }
    }
}
