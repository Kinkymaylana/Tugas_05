import java.util.Scanner;

public class PesanTiketApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nSelamat datang di program pemesanan tiket!");

        System.out.print("Masukkan nama pembeli: "); // Meminta input nama pembeli
        String nama = scanner.nextLine();

        System.out.println("\nPilih tahap pembelian: ");
        System.out.println("1. Presale");
        System.out.println("2. Reguler");
        System.out.print("Pilih tahap pembelian (1/2): "); // Meminta input tahap pembelian
        int tahapPembelian = scanner.nextInt();
        if (tahapPembelian != 1 && tahapPembelian != 2) {
            System.out.println("Input tidak valid!"); // Pesan kesalahan jika input tidak valid
            return;
        }

        Tiket tiket;
        if (tahapPembelian == 1) {
            // Jika tahap pembelian adalah presale, hanya tersedia tiket VIP dan VVIP
            System.out.println("\nPilih jenis tiket: ");
            System.out.println("1. VIP");
            System.out.println("2. VVIP");
            System.out.print("Pilih jenis tiket (1/2): "); // Meminta input jenis tiket
            int jenisTiket = scanner.nextInt();
            if (jenisTiket != 1 && jenisTiket != 2) {
                System.out.println("Input tidak valid!"); // Pesan kesalahan jika input tidak valid
                return;
            }

            tiket = (jenisTiket == 1) ? new VIP() : new VVIP();
        } else {
            // Jika tahap pembelian adalah reguler, tersedia semua jenis tiket
            System.out.println("\nPlih jenis tiket: ");
            System.out.println("1. Festival");
            System.out.println("2. VIP");
            System.out.println("3. VVIP");
            System.out.print("Pilih jenis tiket (1/2/3): "); // Meminta input jenis tiket
            int jenisTiket = scanner.nextInt();
            if (jenisTiket < 1 || jenisTiket > 3) {
                System.out.println("Input tidak valid!"); // Pesan kesalahan jika input tidak valid
                return;
            }

            switch (jenisTiket) {
                case 1:
                    tiket = new Festival();
                    break;
                case 2:
                    tiket = new VIP();
                    break;
                case 3:
                    tiket = new VVIP();
                    break;
                default:
                    tiket = null;
                    break;
            }
        }

        System.out.print("\nMasukkan jumlah tiket yang ingin dibeli: "); // Meminta input jumlah tiket
        int jumlahTiket = scanner.nextInt();

        // Buat objek Pemesanan dengan informasi yang sudah diinput
        Pemesanan pemesanan = new Pemesanan(nama, (tahapPembelian == 1) ? "Presale" : "Reguler", tiket, jumlahTiket);

        // Cetak nota pemesanan
        pemesanan.cetakNota();
    }
}