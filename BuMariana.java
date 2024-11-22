import java.util.Scanner;

public class BuMariana {

    static Scanner input = new Scanner(System.in);
    static int[][] penjualan;
    static String[] menu;

    public static void main(String[] args) {
        
        System.out.print("Masukkan jumlah menu: ");
        int jumlahMenu = input.nextInt();
        System.out.print("Masukkan jumlah hari: ");
        int jumlahHari = input.nextInt();

        
        penjualan = new int[jumlahMenu][jumlahHari];
        menu = new String[jumlahMenu];

        
        input.nextLine(); 
        for (int i = 0; i < jumlahMenu; i++) {
            System.out.print("Masukkan nama menu ke-" + (i + 1) + ": ");
            menu[i] = input.nextLine();
        }

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
                    inputDataPenjualan(jumlahHari);
                    break;
                case 2:
                    tampilkanDataPenjualan(jumlahHari);
                    break;
                case 3:
                    menuPenjualanTertinggi(jumlahHari);
                    break;
                case 4:
                    rataRataPenjualan(jumlahHari);
                    break;
                case 5:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 5);
    }

    public static void inputDataPenjualan(int jumlahHari) {
        System.out.println("\n=== Input Data Penjualan ===");
        for (int i = 0; i < menu.length; i++) {
            System.out.println("Menu: " + menu[i]);
            for (int j = 0; j < jumlahHari; j++) {
                System.out.print("Masukkan penjualan hari ke-" + (j + 1) + ": ");
                penjualan[i][j] = input.nextInt();
            }
        }
    }

    public static void tampilkanDataPenjualan(int jumlahHari) {
        System.out.println("\n=== Data Penjualan ===");
        System.out.printf("%-15s", "Menu");
        for (int i = 1; i <= jumlahHari; i++) {
            System.out.printf("%-10s", "Hari " + i);
        }
        System.out.println();

        for (int i = 0; i < menu.length; i++) {
            System.out.printf("%-15s", menu[i]);
            for (int j = 0; j < jumlahHari; j++) {
                System.out.printf("%-10d", penjualan[i][j]);
            }
            System.out.println();
        }
    }

    public static void menuPenjualanTertinggi(int jumlahHari) {
        System.out.println("\n=== Menu dengan Penjualan Tertinggi ===");
        int maxPenjualan = 0;
        String menuTertinggi = "";

        for (int i = 0; i < menu.length; i++) {
            int totalPenjualan = 0;
            for (int j = 0; j < jumlahHari; j++) {
                totalPenjualan += penjualan[i][j];
            }
            if (totalPenjualan > maxPenjualan) {
                maxPenjualan = totalPenjualan;
                menuTertinggi = menu[i];
            }
        }
        System.out.println("Menu dengan penjualan tertinggi: " + menuTertinggi + " (Total: " + maxPenjualan + ")");
    }

    public static void rataRataPenjualan(int jumlahHari) {
        System.out.println("\n=== Rata-rata Penjualan per Menu ===");
        for (int i = 0; i < menu.length; i++) {
            int totalPenjualan = 0;
            for (int j = 0; j < jumlahHari; j++) {
                totalPenjualan += penjualan[i][j];
            }
            double rataRata = (double) totalPenjualan / jumlahHari;
            System.out.printf("Rata-rata penjualan %s: %.2f\n", menu[i], rataRata);
        }
    }
}
