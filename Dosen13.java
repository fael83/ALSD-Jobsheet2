public class Dosen13 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;
    public Dosen13(){

    }
    public Dosen13(String idDsn, String nm, boolean status, int thnGbng, String bdngKhln){
        idDosen = idDsn;
        nama = nm;
        statusAktif = status;
        tahunBergabung = thnGbng;
        bidangKeahlian = bdngKhln;
    }
    void tampilInformasi(){
        System.out.println("ID Dosen: " + idDosen);
        System.out.println("Nama dosen: " + nama);
        System.out.println("Status aktif: " + (statusAktif ? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun bergabung: " + tahunBergabung);
        System.out.println("Bidang keahlian: " + bidangKeahlian);
    }
    void setStatusAktif(boolean status){
        statusAktif = status;
    }
    int hitungMasaKerja(int thnSkrg){
        thnSkrg -= tahunBergabung;
        int lmaKerja = thnSkrg;
        System.err.println("Lama masa Kerja " + lmaKerja + " tahun");
        return tahunBergabung;
    }
    void ubahKeahlian(String bidang){
        bidangKeahlian = bidang;
    }
}
