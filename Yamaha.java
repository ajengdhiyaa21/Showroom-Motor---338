public class Yamaha extends Motor {

    public Yamaha(String nama, String merk, String thn, String wrn, long harga) {
        super(nama, merk, thn, wrn, harga);
    }
//xsr 155; 36,58 juta
    @Override
    public void detailmesin() {
        System.out.println("==========Detail Mesin==========");
        System.out.println("Kapasitas       : 155cc");
        System.out.println("Jenis Mesin     : Single Cylinder, 4-Stroke,4-Valves, Liquid Cooled SOHC Engine");
        System.out.println("Opsi Start      : Electric");
        System.out.println("Kategori        : Cafe Racer");
        System.out.println("Rem Depan       : Disc");

    }

    @Override
    public void performa() {
        System.out.println("==========Performa==========");
        System.out.println("Tenaga Maksimal : 19hp");
        System.out.println("Torsi Maksimal  : 14.7Nm");
    }

    @Override
    public void dimensi() {
        System.out.println("==========Dimensi==========");
        System.out.println("Tinggi      : 1080mm");
        System.out.println("Bobot       : 134kg");
        System.out.println("Panjang     : 2007mm");
        System.out.println("Lebar       : 804mm");
    }
}
