
import java.util.Scanner;

public class HitungTotalHarga12 {

    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");
    
        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }
    
        if (kodePromo.equals("DISKON50")) {
            System.out.println("Berikan diskon 50%!");
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Berikan diskon 30%!");
        } else {
            System.out.println("Kode promo tidak valid.");
        }
    
        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===========================");
        System.out.println("Silakan pilih menu yang Anda inginkan.");
    }

    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
    
        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
    
        if (kodePromo.equals("DISKON50")) {
            hargaTotal = hargaTotal / 2; 
        } else if (kodePromo.equals("DISKON30")) {
            hargaTotal = hargaTotal * 70 / 100; 
        } else {
            System.out.println("Kode promo tidak valid.");
        }
    
        return hargaTotal;
    }
    
    public static void main(String[] args) {
        Menu("Muna", true, "DISKON50");
        Scanner input12 = new Scanner(System.in);
    
        int totalKeseluruhan = 0;
    
        while (true) {
            System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
            int pilihanMenu = input12.nextInt();
    
            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            int banyakItem = input12.nextInt();
            input12.nextLine();
    
            int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem, "DISKON50");
            totalKeseluruhan += totalHarga;
    
            System.out.print("Apakah ingin memesan menu lain? (yes/no): ");
            String jawaban = input12.nextLine();
            if (jawaban.equalsIgnoreCase("no")) {
                break;
            }
        }
    
        System.out.println("Total keseluruhan pesanan Anda: Rp. " + totalKeseluruhan);
    }
}