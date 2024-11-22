import java.util.Scanner;
public class Percobaan5_12 {
    
    static int hitungLuas (int pjg, int lb) {
        int Luas = pjg * lb;
        return Luas;
    }
    
    static int hitungVolume (int tinggi, int a, int b) {
        int volume = hitungLuas(a, b) * tinggi;
        return volume;
    }
    
    public static void main(String[] args) {
        Scanner input12 = new Scanner(System.in);

        int p, l, t, L, vol;

        System.out.print("Masukkan panjang: ");
        p = input12.nextInt();
        System.out.print("Masukkan lebar: ");
        l = input12.nextInt();
        System.out.print("Masukkan tinggi: ");
        t = input12.nextInt();
        
        L = p * l;
        System.out.println("Luas persegi panjang adalah " + L);
        
        vol = p * l * t;
        System.out.println("Volume balok adalah " + vol);   
    }
}