public class Kafe12_percobaan2 {
    
    public static void main(String[] args) {
        Menu("Muna", true, "DISKON50");
    }
    
    public static void Menu (String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        if ("DISKON50".equals(kodePromo)) {
            System.out.println("Kode promo berlaku: Anda mendapatkan diskon 50%.");
        } else if ("DISKON30".equals(kodePromo)) {
            System.out.println("Kode promo berlaku; Anda mendapatkan diskon 30%.");
        } else {
            System.out.println("Kode promo invalid.");
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
}
    
