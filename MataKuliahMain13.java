public class MataKuliahMain13 {
    public static void main(String[] args) {
        MataKuliah13 mk = new MataKuliah13();
        mk.kodeMK = "SIB242005"; 
        mk.nama = "Algoritma dan Struktur Data";
        mk.sks = 2;
        mk.jumlahJam = 6;
        mk.tampilInformasi();
        mk.ubahSKS(3);
        mk.tambahJam(2);
        mk.kurangiJam(6);
        System.out.println("===Pembaruan===");
        mk.tampilInformasi();

        System.out.println("=========================");

        MataKuliah13 mk2 = new MataKuliah13("SIB242005", "Algoritma dan Struktur Data", 2, 6);
        mk2.tampilInformasi();
        mk2.ubahSKS(4);
        mk2.tambahJam(0);
        mk2.kurangiJam(7);
        System.out.println("===Pembaruan===");
        mk2.tampilInformasi();
    }
    
}
