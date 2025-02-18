public class DosenMain13 {
    public static void main(String[] args) {
        Dosen13 dsn = new Dosen13();
        dsn.idDosen = "13";
        dsn.nama = "Yan Watequlis";
        dsn.statusAktif = true;
        dsn.tahunBergabung = 2013;
        dsn.bidangKeahlian = "CTPS";
        dsn.tampilInformasi();
        dsn.hitungMasaKerja(2025);
        System.out.println("=====Pembaruan=====");
        dsn.setStatusAktif(false);
        dsn.ubahKeahlian("Teori BD dan Praktikum BD");
        dsn.tampilInformasi();
        dsn.hitungMasaKerja(2025);
        System.out.println("===============");
        Dosen13 dsn2 = new Dosen13("1", "Vivin ayu", false, 2018, "Daspro");
        dsn2.tampilInformasi();
        dsn2.hitungMasaKerja(2025);
        System.out.println("=====Pembaruan=====");
        dsn2.setStatusAktif(true);
        dsn2.ubahKeahlian("Database");
        dsn2.tampilInformasi();
        dsn2.hitungMasaKerja(2025);
    }
}
