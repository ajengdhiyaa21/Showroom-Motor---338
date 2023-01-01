public class Transaksi implements Harga {
    private  String kode_pmbyrn,tgl,wkt;
    private int thn;
    private long byr, harga, hargaawal, hargajual;
    private Motor mtr;
    private Pelanggan plnggn;

    public Transaksi(){}

    public Transaksi(String kode_pmbyrn, String tgl, String wkt, long harga, long byr){
        this.kode_pmbyrn = kode_pmbyrn;
        this.tgl=tgl;
        this.wkt=wkt;
        this.harga=harga;
        this.byr=byr;
    }

    public Transaksi(String kode_pmbyrn, String tgl, String wkt, String thn, long hargaawal) {
    }

    public void Transaksijual (String kode_pmbyrn, String tgl, String wkt, int thn, long hargaawal){
        this.kode_pmbyrn=kode_pmbyrn;
        this.tgl=tgl;
        this.wkt=wkt;
        this.thn=thn;
        this.hargaawal=hargaawal;
    }

    public void datamotor (String mrk, String nama, String thn, String wrn, long harga){
        mtr = new Motor(mrk,nama,thn,wrn,harga);
    }

    public void datamotorjual (String mrk, String nama, String thn, String wrn, long harga){
        mtr = new Motor(mrk,nama,thn,wrn,harga);
    }

    public void datapelanggan(String nama, String nik, String alamat, String tlp){
        plnggn = new Pelanggan (nama,nik,alamat,tlp);
    }

    @Override
    public int pembelian() {
        return (int) (this.byr - this.harga);
    }

    @Override
    public void penjualan() {

        if (2022 - thn == 1){
            hargajual = (long) (this.hargaawal-(this.hargajual*0.15));
        } else if (2022 - thn == 2){
            hargajual = (long) (this.hargaawal-(this.hargajual*0.10));
        } else {
            hargajual = (long) (this.hargaawal-(this.hargajual*0.08));
        }
        System.out.println(" Harga Jual : "+hargajual);
    }
    public void Transaksipembelian(){
        System.out.println("+===============================+");
        System.out.println("|    Bukti Transaksi Pembelian   |");
        System.out.println("+===============================+");
        System.out.println("| Kode Transaksi    : "+this.kode_pmbyrn);
        System.out.println("| Tanggal Transaksi : "+this.tgl);
        System.out.println("| Waktu Transaksi   : "+this.wkt);
        System.out.println("| Harga Barang      : "+this.harga);
        System.out.println("| Nominal Bayar     : "+this.byr);
        System.out.println("| Kembalian         : "+pembelian());
        System.out.println("+===============================+");

        mtr.tampilmotor();
        System.out.println("\n");
        plnggn.tampilpelanggan();
    }

    public void Transaksipenjualan(){
        System.out.println("+===============================+");
        System.out.println("|   Bukti Transaksi Penjualan   |");
        System.out.println("+===============================+");
        System.out.println("| Kode Transaksi    : "+this.kode_pmbyrn);
        System.out.println("| Tanggal Transaksi : "+this.tgl);
        System.out.println("| Waktu Transaksi   : "+this.wkt);
        penjualan();
        System.out.println("+===============================+");
        System.out.println("\n");
         mtr.tampilmotor();
         plnggn.tampilpelanggan();

    }
}
