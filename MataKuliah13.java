public class MataKuliah13 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;
    public MataKuliah13(){

    }
    public MataKuliah13(String kodeMk, String nm, int sks, int jumlahJam){
        this.kodeMK = kodeMk;
        nama = nm;
        this.sks =sks;
        this.jumlahJam = jumlahJam;
    }

    void tampilInformasi(){
        System.out.println("Kode Mata Kuliah: " + kodeMK);
        System.out.println("Nama: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah jam: " + jumlahJam);
    }
    void ubahSKS(int sksBaru){
        sks = sksBaru;
        System.out.println("SKS telah diperbarui menjadi = " + sks + " SKS");
    }
    void tambahJam(int jam){
        jumlahJam += jam;
    }
    void kurangiJam(int jam){
        if (jumlahJam < jam) {
            System.out.println("Pengurangan jam tidak dapat dilakukan karena jumlah jam sebelumnya lebih sedikit dari pengurangan jam.");
        } else {
        jumlahJam -= jam;
        System.out.println("Jumlah jam baru = " + jumlahJam);
        }
    }
}
