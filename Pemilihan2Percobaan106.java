import java.util.Scanner;
public class Pemilihan2Percobaan106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan tahun: ");
        int tahun = sc.nextInt();
        if (tahun % 400 == 0) {
            System.out.println("Tahun kabisat");
        } else if (tahun % 100 == 0) {
            System.out.println("Bukan tahun kabisat");
        } else if (tahun % 4 == 0) {
            System.out.println("Tahun kabisat");
        } else {
            System.out.println("Bukan tahun kabisat");
        }
    }
}