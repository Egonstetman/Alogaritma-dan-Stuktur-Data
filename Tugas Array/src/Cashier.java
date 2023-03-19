import java.util.ArrayList;
import java.util.Scanner;

public class Cashier {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // inisialisasi array buah
        String[][] Buah = {
            {"apel","35000"},
            {"jeruk","50000"},
            {"mangga","25000"},
            {"duku","15000"},
            {"semangka","20000"}
        };

        // inisialisasi arraylist untuk menyimpan belanjaan
        ArrayList<String[]> belanjaan = new ArrayList<>();

        // loop untuk meminta input belanjaan
        String lagi = "y";
        while (lagi.equalsIgnoreCase("y")) {
            // menampilkan daftar buah
            System.out.println("Daftar Buah:");
            System.out.println("=============");
            System.out.println("No.\tNama Buah\tHarga");
            for (int i = 0; i < Buah.length; i++) {
                System.out.println(i + "\t" + Buah[i][0] + "\t\t" + Buah[i][1]);
            }

            // meminta input pilihan buah
            System.out.print("Pilih buah (0-" + (Buah.length-1) + "): ");
            int pilihanBuah = input.nextInt();
            input.nextLine(); // membersihkan newline di buffer

            // meminta input jumlah
            System.out.print("Masukkan jumlah: ");
            int jumlah = input.nextInt();
            input.nextLine(); // membersihkan newline di buffer

            // menyimpan belanjaan ke arraylist
            String[] belanja = {
                Buah[pilihanBuah][0], // nama buah
                String.valueOf(jumlah), // jumlah
                Buah[pilihanBuah][1], // harga
                String.valueOf(jumlah * Integer.parseInt(Buah[pilihanBuah][1])) // subtotal
            };
            belanjaan.add(belanja);

            // meminta input apakah ingin membeli lagi
            System.out.print("Input lagi? (y/n): ");
            lagi = input.nextLine();
        }

        // menampilkan struk belanja
        System.out.println("Daftar Belanja:");
        System.out.println("========================================");
        System.out.println("No.\tNama Buah\tJumlah\tHarga\tSubtotal");
        int total = 0;
        for (int i = 0; i < belanjaan.size(); i++) {
            String[] belanja = belanjaan.get(i);
            System.out.println((i+1) + "\t" + belanja[0] + "\t\t" + belanja[1] + "\t" + belanja[2] + "\t" + belanja[3]);
            total += Integer.parseInt(belanja[3]);
        }
        System.out.println("========================================");
        System.out.println("Total:\t\t\t\t\t\t" + total);
        int discount = (int) (total * 0.15);
        System.out.println("Discount(15%):\t\t\t\t\t" + discount);
        System.out.println("Total bayar:\t\t\t\t\t" + (total-discount));
    }
}
