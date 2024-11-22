import java.util.Scanner;
public class kubus12 {
    
static int hitungLuas (int sisi) {
    int Luas = 6 * sisi * sisi;
    return Luas;
}

static int hitungVolume (int sisi) {
    int volume = sisi * sisi * sisi;
    return volume;
}

public static void main(String[] args) {
    Scanner input12 = new Scanner(System.in);

    int sisi, L, vol;

    System.out.print("Masukkan sisi kubus: ");
    sisi = input12.nextInt();
    
    L = 6 * sisi * sisi;
    System.out.println("Luas permukaan kubus adalah " + L);
    
    vol = sisi * sisi * sisi;
    System.out.println("Volume kubus adalah " + vol);   
    }
}