public class Motor {
    private String merk, nama, thn, wrn;
    private long harga;

    public Motor (String nama, String merk, String thn, String wrn, long harga){
        this.merk=merk;
        this.nama=nama;
        this.thn=thn;
        this.wrn=wrn;
        this.harga=harga;
    }

    public String getMerk() {
        return merk;
    }

    public String getNama() {
        return nama;
    }

    public String getThn() {
        return thn;
    }
    public String getWrn() {
        return wrn;
    }
    public long getHarga() {
        return harga;
    }

    public void tampilmotor(){
        System.out.println("Merk    : "+this.merk);
        System.out.println("Nama    : "+this.nama);
        System.out.println("Tahun   : "+this.thn);
        System.out.println("Harga   : "+this.harga);
        System.out.println("Warna   : "+this.wrn);
    }

    public void tampilmotorjual(){
        System.out.println("Merk    : "+this.merk);
        System.out.println("Nama    : "+this.nama);
        System.out.println("Tahun   : "+this.thn);
        System.out.println("Warna   : "+this.wrn);
    }

    public void detailmesin(){}
    public void performa(){}
    public void dimensi(){}

}
