package utsmilan;

/**
 * Author: 2201010526_Milan Cantik
 */
public class Utsmilan {
    private String namaPenyewa;
    private String alamatEmail;
    private String teleponPenyewa;
    private String nomorKamar;
    private int durasiMenyewa;

    public Utsmilan(String nama, String email, String telepon, String kamar, int durasi) {
        this.namaPenyewa = nama;
        this.alamatEmail = email;
        this.teleponPenyewa = telepon;
        this.nomorKamar = kamar;
        this.durasiMenyewa = durasi;
    }

    public String getNamaPenyewa() {
        return namaPenyewa;
    }

    public void setNamaPenyewa(String nama) {
        this.namaPenyewa = nama;
    }

    public String getAlamatEmail() {
        return alamatEmail;
    }

    public void setAlamatEmail(String email) {
        this.alamatEmail = email;
    }

    public String getTeleponPenyewa() {
        return teleponPenyewa;
    }

    public void setTeleponPenyewa(String telepon) {
        this.teleponPenyewa = telepon;
    }

    public String getNomorKamar() {
        return nomorKamar;
    }

    public void setNomorKamar(String kamar) {
        this.nomorKamar = kamar;
    }

    public int getDurasiMenyewa() {
        return durasiMenyewa;
    }

    public void setDurasiMenyewa(int durasi) {
        this.durasiMenyewa = durasi;
    }

    @Override
    public String toString() {
        return "Nama: " + namaPenyewa +
                "\nAlamat Email: " + alamatEmail +
                "\nTelepon Penyewa: " + teleponPenyewa +
                "\nNomor Kamar: " + nomorKamar +
                "\nDurasi Menyewa: " + durasiMenyewa + " hari";
    }
}
