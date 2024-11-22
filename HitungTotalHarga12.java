import java.util.Scanner;

public class HitungTotalHarga12 {
    
    public static void Menu (String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }
        switch (kodePromo) {
            case "DISKON50":
                System.out.println("Kode promo berlaku: Anda mendapatkan diskon 50%!");
                break;
            case "DISKON30":
                System.out.println("Kode promo berlaku: Anda mendapatkan diskon 30%!");
                break;
            default:
                System.out.println("Kode promo tidak valid.");
        }

        System.out.println("======== MENU RESTO KAFE========");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Capucino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("=================================");
        System.out.print("Silahkan pilih menu yang anda inginkan. ");
    }
    
    public static int hitungTotalHarga(int pilihanMenu, int banyakItem) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        
        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        return hargaTotal;
    }

    public static void main(String[] args) {
        Menu("Muna", true, "DISKON50");
        Scanner input12 = new Scanner(System.in);

        System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
        int pilihanMenu = input12.nextInt();

        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int banyakItem = input12.nextInt();

        int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem);
            
        System.out.println("Total harga untuk pesanan Anda: Rp" + totalHarga);
            
    }
}

