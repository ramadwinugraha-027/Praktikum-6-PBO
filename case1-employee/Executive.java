public class Executive extends Employee {
    private double bonus;

    public Executive(String name, String address, String phone,
                     String socialSecurityNumber, double payRate) {
        super(name, address, phone, socialSecurityNumber, payRate);
        this.bonus = 0;
    }

    public void awardBonus(double execBonus) {
        this.bonus = execBonus;
    }

    @Override
    public double pay() {
        double payment = super.payRate + bonus;
        bonus = 0; 
        return payment;
    }

    @Override
    public String toString() {
        return super.toString() + "\nBonus: " + bonus;
    }
}