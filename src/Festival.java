// Kelas turunan untuk tiket Festival
class Festival extends Tiket {
    // Konstruktor untuk tiket Festival dengan harga 100
    public Festival() {
        super("Festival", 100);
    }

    // Implementasi metode hitungHarga untuk tiket Festival
    @Override
    public double hitungHarga(int jumlah, String tahap) {
        // Jika tahap pembelian adalah presale, diskon 20%
        double hargaPerTiket = (tahap.equalsIgnoreCase("presale")) ? harga - 20.0 : harga;
        return hargaPerTiket * jumlah; // Mengembalikan total harga tiket
    }
}