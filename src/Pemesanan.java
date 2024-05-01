// Kelas untuk menyimpan informasi pemesanan tiket
class Pemesanan {
    private String nama; // Nama pembeli
    private String tahap; // Tahap pembelian (Presale atau Reguler)
    private Tiket tiket; // Objek tiket yang dipesan
    private int jumlah; // Jumlah tiket yang dibeli

    // Konstruktor untuk inisialisasi informasi pemesanan tiket
    public Pemesanan(String nama, String tahap, Tiket tiket, int jumlah) {
        this.nama = nama;
        this.tahap = tahap;
        this.tiket = tiket;
        this.jumlah = jumlah;
    }

    // Metode untuk mencetak nota pemesanan tiket
    public void cetakNota() {
        double totalHarga = tiket.hitungHarga(jumlah, tahap); // Menghitung total harga tiket
        System.out.println("\n--- Nota Pemesanan ---");
        System.out.println("Nama Pembeli: " + nama); // Cetak nama pembeli
        System.out.println("Tahap Pembelian: " + tahap); // Cetak tahap pembelian
        System.out.println("Jenis Tiket: " + tiket.jenis); // Cetak jenis tiket
        System.out.println("Jumlah Tiket: " + jumlah); // Cetak jumlah tiket
        System.out.println("Total Harga: Rp " + totalHarga); // Cetak total harga
        System.out.println("--------------------------");
    }
}