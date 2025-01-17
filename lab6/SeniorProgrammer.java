package lab6;

public class SeniorProgrammer extends Programmer {

    public SeniorProgrammer() {
        super();
    }

    @Override
    public void coding(String str) {
        if (this.getEnergy() >= 10) {
            System.out.println("I'm coding about " + str);
            this.setEnergy(this.getEnergy() - 5);
            this.setHappiness(this.getHappiness() - 5);
        } else {
            System.out.println("ZzZzZz");
            this.setEnergy(this.getEnergy() - 5);
            this.setHappiness(this.getHappiness() - 5);
        }
    }

    public void coding(String str, int num) {
        for (int i = 0; i < num; i++) {
            this.coding(str);
        }
    }

    @Override
    public void coding(char str) {
        this.setEnergy(this.getEnergy() - 5);
        this.setHappiness(this.getHappiness() - 5);
        System.out.println("I'm coding about " + str);
    }

    // เมธอด compliment
    public void compliment(Programmer p) {
        p.setHappiness(p.getHappiness() + 20);
        System.out.println(p.getName() + " in a good mood");
    }

    // เมธอด blame
    public void blame(Programmer p) {
        p.setHappiness(p.getHappiness() - 20);
        System.out.println(p.getName() + " in a bad mood");
    }
}
