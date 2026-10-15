public class Salesperson implements Comparable<Salesperson> {
    private String firstName;
    private String lastName;
    private int totalSales;

    public Salesperson(String first, String last, int sales) {
        firstName = first;
        lastName = last;
        totalSales = sales;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getTotalSales() {
        return totalSales;
    }

    @Override
    public int compareTo(Salesperson other) {
        if (this.totalSales != other.totalSales) {
            return this.totalSales - other.totalSales;
        }

        String name1 = this.lastName + this.firstName;
        String name2 = other.lastName + other.firstName;
        return name1.compareTo(name2);
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Salesperson o = (Salesperson) other;
        return totalSales == o.totalSales &&
               lastName.equals(o.lastName) &&
               firstName.equals(o.firstName);
    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + totalSales;
        return result;
    }

    @Override
    public String toString() {
        return lastName + ", " + firstName + ": " + totalSales;
    }
}