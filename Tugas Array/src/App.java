import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah data: ");
        int jumlahData = input.nextInt();

        // inisialisasi array untuk menyimpan data mahasiswa
        String[] nama = new String[jumlahData];
        double[] nilai = new double[jumlahData];
        String[] status = new String[jumlahData];

        // mengisi array dengan data mahasiswa
        for (int i = 0; i < jumlahData; i++) {
            System.out.println("________________________________");
            System.out.println("Mahasiswa Ke : " + (i+1));

            System.out.print("Nama: ");
            nama[i] = input.next();

            System.out.print("Nilai: ");
            nilai[i] = input.nextDouble();

            // menentukan status mahasiswa
            if (nilai[i] >= 60) {
                status[i] = "Lulus";
            } else {
                status[i] = "Tidak Lulus";
            }
        }

        // menampilkan daftar nilai mahasiswa
        System.out.println("DAFTAR NILAI MAHASISWA");
        System.out.println("================================");
        System.out.println("No\tNama\tNilai\tStatus");
        for (int i = 0; i < jumlahData; i++) {
            System.out.println((i+1) + "\t" + nama[i] + "\t" + nilai[i] + "\t" + status[i]);
        }
        System.out.println("================================");

        // menghitung jumlah dan rata-rata nilai mahasiswa
        double totalNilai = 0;
        for (double n : nilai) {
            totalNilai += n;
        }
        double rataNilai = totalNilai / jumlahData;

        System.out.println("Jumlah: " + totalNilai);
        System.out.println("Nilai Rata-rata: " + rataNilai);
    }
}