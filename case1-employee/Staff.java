public class Staff {
    private StaffMember[] staffList;

    public Staff() {
        staffList = new StaffMember[8];

        staffList[0] = new Executive("Budi", "Jl. Merdeka 1", "0811",
                                     "111", 1500.0);
        ((Executive) staffList[0]).awardBonus(500.0);

        staffList[1] = new Employee("Ani", "Jl. Merdeka 2", "0812",
                                    "222", 1000.0);

        staffList[2] = new Employee("Cici", "Jl. Merdeka 3", "0813",
                                    "333", 1200.0);

        staffList[3] = new Hourly("Dodi", "Jl. Merdeka 4", "0814",
                                  "444", 50.0);
        ((Hourly) staffList[3]).addHours(40);

        staffList[4] = new Volunteer("Eka", "Jl. Merdeka 5", "0815");

        staffList[5] = new Hourly("Fani", "Jl. Merdeka 6", "0816",
                                  "666", 75.0);
        ((Hourly) staffList[5]).addHours(30);

        // Commission pertama
        Commission c1 = new Commission("Gita", "Jl. Merdeka 7", "0817",
                                       "777", 6.25, 0.20);
        c1.addHours(35);
        c1.addSales(400);
        staffList[6] = c1;

        // Commission kedua
        Commission c2 = new Commission("Hadi", "Jl. Merdeka 8", "0818",
                                       "888", 9.75, 0.15);
        c2.addHours(40);
        c2.addSales(950);
        staffList[7] = c2;
    }

    public void payday() {
        double amount;

        for (int count = 0; count < staffList.length; count++) {
            System.out.println(staffList[count]);

            amount = staffList[count].pay(); 

            if (amount == 0.0)
                System.out.println("Thanks!");
            else
                System.out.println("Paid: " + amount);

            System.out.println("-----------------------------------");
        }
    }
}