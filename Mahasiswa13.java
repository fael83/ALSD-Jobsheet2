import java.util.Scanner;
public class Mahasiswa13 {

    String nama;
    String nim;
    String kelas;
    double ipk;
    public Mahasiswa13(String name,String Nim, String kls, double IPK){
        nama = name;
        nim = Nim;
        kelas = kls;
        ipk = IPK;
    }
    void tampilkanInformasi(){
        System.out.println("Nama: " + nama);
        System.out.println("NIM: "+ nim);
        System.out.println("Kelas: " + kelas);
        System.out.println("IPK: " + ipk);
    }
    void ubahKelas(String kelasBaru){
        kelas = kelasBaru;
    }
    void updateIPK(double ipkBaru){
        if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {
            ipk = ipkBaru;
        } else  
            System.out.println("IPK tidak valid Harus antara 0.0 sampai dengan 4.0");  
            return;
    }
    String nilaiKinerja(){
        if (ipk >= 3.5) {
            return "Kinerja sangat baik";
        }else if (ipk >= 3.0) {
            return "Kinerja baik";
        } else if (ipk >= 2.0) {
            return "Kinerja cukup";
        } else {
            return "Kinerja kurang";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa13 mhs = new Mahasiswa13("Rafael", "244107060039","SIB - 1G", 3.6);
        mhs.tampilkanInformasi();
        System.out.print("Apakah anda ingin memasukkan ipk baru? (y/n):" );
        String kepastian = sc.next();
        if (kepastian.equalsIgnoreCase("y")) {
            System.out.print("Masukkan ipk baru: ");
            double ipkBaru = sc.nextDouble();
            if (ipkBaru <= 0.0 || ipkBaru >= 4.0) {
                mhs.updateIPK(ipkBaru);
            }else {
                Mahasiswa13 mhsBaru = new Mahasiswa13("Rafael", "244107060039","SIB - 1G", ipkBaru);
                mhsBaru.tampilkanInformasi();
            }
        }
    }
}