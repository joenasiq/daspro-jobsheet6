import java.util.Scanner;
public class Pemilihan2Percobaan206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int harga;
        double diskon;
        System.out.println("-----------------------");
        System.out.println("==== MENU KAFE JTI ====");
        System.out.println("-----------------------");
        System.out.println("1. ricebowl");
        System.out.println("2. ice tea");
        System.out.println("3. paket bunding (ricebowl + ice tea)");
        System.out.println("-------------------------------------");
        System.out.print("masukkan angka dari menu yang dipilih = ");
        int pilihan_menu = sc.nextInt();
        sc.nextLine();
        System.out.print("apakah punya member (y/n) = ");
        String member = sc.nextLine();
        System.out.print("metode pembayaran (QRIS/lainnya) = ");
        String metodePembayaran = sc.nextLine();
        System.out.println("-------------------------------------");

        if (pilihan_menu == 1) {
            harga = 14000;
            System.out.println("harga ricebowl = " + harga);
        } else if (pilihan_menu == 2) {
            harga = 3000;
            System.out.println("harga ice tea = " + harga);
        } else if (pilihan_menu == 3) {
            harga = 15000;
            System.out.println("harga paket bunding = " + harga);
        } else {
            System.out.println("masukkan pilihan menu yang benar");
            return;
        }

        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10;
            System.out.println("besar diskon = 10%");
            double totalBayar = harga - (harga * diskon);
            if (metodePembayaran.equalsIgnoreCase("QRIS")) {
                totalBayar -= 1000;
                System.out.println("Potongan QRIS = Rp 1.000");
            }
            System.out.println("total bayar setelah diskon dan potongan = " + totalBayar);
        } 
        else if (member.equalsIgnoreCase("n")) {
            if (metodePembayaran.equalsIgnoreCase("QRIS")) {
                harga -= 1000;
                System.out.println("Potongan QRIS = Rp 1.000");
            }
            System.out.println("total bayar = " + harga);
        } else {
            System.out.println("member tidak valid");
        }
        System.out.println("-------------------------------------");
    }
}