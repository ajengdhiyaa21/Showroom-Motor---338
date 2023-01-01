public class Pelanggan {
    String nik,nama,alamat,tlp;

    public Pelanggan (String nama, String nik, String alamat, String tlp){
        this.nama=nama;
        this.nik=nik;
        this.alamat=alamat;
        this.tlp=tlp;
    }

    void tampilpelanggan(){
        System.out.println(" Nama      : "+this.nama);
        System.out.println(" NIK       : "+this.nik);
        System.out.println(" Alamat    : "+this.alamat);
        System.out.println(" No. Telp. : "+this.tlp);
    }
}
