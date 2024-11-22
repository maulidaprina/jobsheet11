public class Kafe12_percobaan2 {
    
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
    
    public static void main(String[] args) {
        Menu("Muna", true, "DISKON50");
    }
}
    
