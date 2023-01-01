public class Honda extends Motor{
    public Honda(String nama, String merk, String thn, String wrn, long harga) {
        super(nama, merk, thn, wrn, harga);
    }
//honda vario 125; 22,35juta
    @Override
    public void detailmesin() {
        System.out.println("==========Detail Mesin==========");
        System.out.println("Kapasitas       : 124,8cc");
        System.out.println("Jenis Mesin     : 4-Step, SOCH,eSP,Liquid Cooling");
        System.out.println("Opsi Start      : Electric");
        System.out.println("Kategori        : Scooter");
        System.out.println("Rem Depan       : Disc");
    }

    @Override
    public void performa() {
        System.out.println("==========Performa==========");
        System.out.println("Kecepatan Maksimal  : 105Kmph");
        System.out.println("Torsi Maksimal      : 10,8Nm");
    }

    @Override
    public void dimensi() {
        System.out.println("==========Dimensi==========");
        System.out.println("Tinggi      : 1066mm");
        System.out.println("Bobot       : 112kg");
        System.out.println("Panjang     : 1918mm");
        System.out.println("Lebar       : 679mm");
    }
}
