import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Integer[] intList;  
        int size;
        Scanner scan = new Scanner(System.in);

        System.out.print("Berapa banyak angka? ");
        size = scan.nextInt();
        intList = new Integer[size];

        System.out.println("Masukkan " + size + " angka:");
        for (int i = 0; i < size; i++) {
            intList[i] = scan.nextInt();   
        }

        Sorting.selectionSort(intList);

        System.out.println("\nUrutan ascending:");
        for (int i = 0; i < size; i++) {
            System.out.print(intList[i] + " ");
        }
        System.out.println();
        scan.close();
    }
}