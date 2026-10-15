public class Commission extends Hourly {
    private double totalSales;
    private double commissionRate;

    public Commission(String name, String address, String phone,String socialSecurityNumber, double payRate, double commissionRate) {
        super(name, address, phone, socialSecurityNumber, payRate);
        this.commissionRate = commissionRate;
        this.totalSales = 0;
    }

    public void addSales(double sales) {
        totalSales += sales;
    }

    @Override
    public double pay() {
        double commission = totalSales * commissionRate;
        totalSales = 0; 
        return super.pay() + commission;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTotal Sales: " + totalSales;
    }
}