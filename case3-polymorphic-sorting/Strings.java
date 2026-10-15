import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        String[] stringList;
        int size;
        Scanner scan = new Scanner(System.in);

        System.out.print("Berapa banyak string? ");
        size = scan.nextInt();
        scan.nextLine(); // buang newline
        stringList = new String[size];

        System.out.println("Masukkan " + size + " string:");
        for (int i = 0; i < size; i++) {
            stringList[i] = scan.nextLine();
        }

        Sorting.selectionSort(stringList);

        System.out.println("\nUrutan ascending:");
        for (int i = 0; i < size; i++) {
            System.out.println(stringList[i]);
        }
        scan.close();
    }
}