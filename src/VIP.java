// Kelas turunan untuk tiket VIP
class VIP extends Tiket {
    // Konstruktor untuk tiket VIP dengan harga 150
    public VIP() {
        super("VIP", 150.0);
    }

    // Implementasi metode hitungHarga untuk tiket VIP
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