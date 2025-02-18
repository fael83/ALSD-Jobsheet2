public class MahasiswaMain13 {
    public static void main(String[] args) {
        Mahasiswa13 mhs1 = new Mahasiswa13();
        mhs1.nama= "Muhammad Ali Farhan";
        mhs1.nim = "2441720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;
    
        mhs1.tampilkanInformasi();
        mhs1.updateIPK(3.60);
        mhs1.ubahKelas("SI 2K");
        mhs1.tampilkanInformasi();

        Mahasiswa13 mhs2 = new Mahasiswa13("Annisa Nabila", "244107060039", 3.25, "TI 2L");
        mhs2.updateIPK(3.30);
        mhs2.tampilkanInformasi();

        Mahasiswa13 mhsRafael = new Mahasiswa13("Moh. Rafael Abrari", "244107060039",3.63, "SIB 1G");
        mhsRafael.tampilkanInformasi();
    }
}
