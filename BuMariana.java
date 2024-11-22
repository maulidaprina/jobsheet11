import java.util.Scanner;
public class BuMariana {

    static Scanner input = new Scanner(System.in);

    static int[][] penjualan = {
        {20, 20, 25, 20, 10, 60, 10}, 
        {30, 80, 40, 10, 15, 20, 25}, 
        {5, 9, 20, 25, 10, 5, 45},    
        {50, 8, 17, 18, 10, 30, 6},   
        {15, 10, 16, 15, 10, 10, 55}  
    };

    static String[] menu = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};

    public static void main(String[] args) {
        int pilihan;
        do {
            System.out.println("\n=== Menu Program ===");
            System.out.println("1. Input Data Penjualan");
            System.out.println("2. Tampilkan Data Penjualan");
            System.out.println("3. Menu dengan Penjualan Tertinggi");
            System.out.println("4. Rata-rata Penjualan per Menu");
            System.out.println("5. Keluar");
            System.out.print("Pilih opsi: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    inputDataPenjualan();
                    break;
                case 2:
                    tampilkanDataPenjualan();
                    break;
                case 3:
                    menuPenjualanTertinggi();
                    break;
                case 4:
                    rataRataPenjualan();
                    break;
                case 5:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 5);
    }

    public static void inputDataPenjualan() {
        System.out.println("\n=== Input Data Penjualan ===");
        for (int i = 0; i < menu.length; i++) {
            System.out.println("Menu: " + menu[i]);
            for (int j = 0; j < 7; j++) {
                System.out.print("Masukkan penjualan hari ke-" + (j + 1) + ": ");
                penjualan[i][j] = input.nextInt();
            }
        }
    }

    public static void tampilkanDataPenjualan() {
        System.out.println("\n=== Data Penjualan ===");
        System.out.printf("%-15s%-10s%-10s%-10s%-10s%-10s%-10s%-10s\n", "Menu", "Hari 1", "Hari 2", "Hari 3", "Hari 4", "Hari 5", "Hari 6", "Hari 7");
        for (int i = 0; i < menu.length; i++) {
            System.out.printf("%-15s", menu[i]);
            for (int j = 0; j < 7; j++) {
                System.out.printf("%-10d", penjualan[i][j]);
            }
            System.out.println();
        }
    }

    public static void menuPenjualanTertinggi() {
        System.out.println("\n=== Menu dengan Penjualan Tertinggi ===");
        int maxPenjualan = 0;
        String menuTertinggi = "";
        for (int i = 0; i < menu.length; i++) {
            int totalPenjualan = 0;
            for (int j = 0; j < 7; j++) {
                totalPenjualan += penjualan[i][j];
            }
            if (totalPenjualan > maxPenjualan) {
                maxPenjualan = totalPenjualan;
                menuTertinggi = menu[i];
            }
        }
        System.out.println("Menu dengan penjualan tertinggi: " + menuTertinggi + " (Total: " + maxPenjualan + ")");
    }

    public static void rataRataPenjualan() {
        System.out.println("\n=== Rata-rata Penjualan per Menu ===");
        for (int i = 0; i < menu.length; i++) {
            int totalPenjualan = 0;
            for (int j = 0; j < 7; j++) {
                totalPenjualan += penjualan[i][j];
            }
            double rataRata = (double) totalPenjualan / 7;
            System.out.printf("Rata-rata penjualan %s: %.2f\n", menu[i], rataRata);
        }
    }
}
