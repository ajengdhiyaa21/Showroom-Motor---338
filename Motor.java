public class Motor {
    private String merk, nama, thn, wrn;
    private int tahun;
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

    public int getTahun() {
        return tahun;
    }

    public long getHarga() {
        return harga;
    }

    public void tampilmotor(){
        System.out.println("Merk    : "+this.merk);
        System.out.println("Nama    : "+this.nama);
        System.out.println("Tahun   : "+this.tahun);
        System.out.println("Harga   : "+this.harga);
        System.out.println("Warna   : "+this.wrn);
    }

    public void tampilmotorjual(){
        System.out.println("Merk    : "+this.merk);
        System.out.println("Nama    : "+this.nama);
        System.out.println("Tahun   : "+this.tahun);
        System.out.println("Warna   : "+this.wrn);
    }

    public void detailmesin(){}
    public void performa(){}
    public void dimensi(){}

}
