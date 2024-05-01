// Kelas turunan untuk tiket VVIP
class VVIP extends Tiket {
    // Konstruktor untuk tiket VVIP dengan harga 200
    public VVIP() {
        super("VVIP", 200.0);
    }

    // Implementasi metode hitungHarga untuk tiket VVIP
    @Override
    public double hitungHarga(int jumlah, String tahap) {
        // Jika tahap pembelian adalah presale, diskon 20%
        if (tahap.equalsIgnoreCase("presale")) {
            return (int) (harga * jumlah * 0.8); // Mengembalikan total harga setelah diskon
        } else {
            return harga * jumlah; // Mengembalikan total harga tiket
        }
    }
}