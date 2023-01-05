import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nik,nama,alamat,tlp,tgl,wkt,kode_pmbyrn,mrk,pelanggan,warna,thn;
        long harga;
        long byr;
        char plh,plh2,cek;
        boolean beli = true, menu = true;

        Scanner in = new Scanner(System.in);

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        while (menu){
            System.out.println("+===============================+");
            System.out.println("|     PROGRAM SHOWROOM MOTOR    |");
            System.out.println("+===============================+");
            System.out.println("| 1. Beli Motor                 |");
            System.out.println("| 2. Jual Motor Bekas           |");
            System.out.println("| 3. Exit                       |");
            System.out.println("+===============================+");
            System.out.println(" Masukkan Pilihan : ");
            plh = in.next().charAt(0);
            System.out.println("\n");



            switch (plh){
                case '1' :
                    while (beli) {
                        System.out.println("+===============================+");
                        System.out.println("|       PROGRAM BELI MOTOR      |");
                        System.out.println("+===============================+");
                        System.out.println("| 1. Yamaha XSR 155             |");
                        System.out.println("| 2. Honda Vario 125            |");
                        System.out.println("| 3. Exit                       |");
                        System.out.println("+===============================+");
                        System.out.println(" Masukkan Pilihan : ");
                        plh = in.next().charAt(0);
                        System.out.println("\n");
                        switch (plh) {
                            case '1':
                                while (true) {
                                    System.out.println("========== YAMAHA XSR 155 ==========");
                                    Yamaha baru = new Yamaha("Yamaha XSR 155", "Yamaha", "2019", "Black Black", 36580000);

                                    System.out.println("Merk    : " + baru.getMerk());
                                    System.out.println("Nama    : " + baru.getNama());
                                    System.out.println("Tahun   : " + baru.getThn());
                                    System.out.println("Warna   : " + baru.getWrn());
                                    System.out.println("Harga   : " + baru.getHarga());

                                    System.out.println();
                                    baru.detailmesin();
                                    System.out.println();
                                    baru.performa();
                                    System.out.println();
                                    baru.dimensi();

                                    System.out.println("\nIngin Membeli Motor? (Ya/Tidak) : ");
                                    cek = in.next().charAt(0);
                                    if (cek == 'Y' || cek == 'y') {
                                        System.out.println("==========Waktu Pembayaran==========");
                                        System.out.println("Kode Pembayaran     : ");
                                        kode_pmbyrn = in.next();
                                        System.out.println("Tanggal Pembayaran  : ");
                                        tgl = in.next();
                                        System.out.println("Waktu Pembayaran    : ");
                                        wkt = in.next();

                                        System.out.println("==========Data Pembelian==========");
                                        System.out.println("NIK     : ");
                                        nik = in.next();
                                        System.out.println("Nama    : ");
                                        nama = in.next();
                                        System.out.println("Alamat  : ");
                                        alamat = in.next();
                                        System.out.println("No.Telp : ");
                                        tlp = in.next();
                                        System.out.println("Uang Pembayaran : ");
                                        byr = in.nextLong();

                                        Transaksi trnsksiyamaha = new Transaksi(kode_pmbyrn, tgl, wkt, byr, 36580000);
                                        trnsksiyamaha.datapelanggan(nik, nama, alamat, tlp);
                                        trnsksiyamaha.datamotor("Yamaha", "Yamaha XSR 155", "2019", "Black Black", 36580000);
                                        System.out.println();
                                        trnsksiyamaha.Transaksipembelian();
                                        new java.util.Scanner(System.in).nextLine();
                                        beli = false;
                                        break;
                                    } else if (cek == 'T' || cek == 't') {
                                        System.out.println();
                                        break;
                                    } else {
                                        System.out.println("Input Anda Salah\n");
                                    }
                                }
                                break;
                            case '2':
                                while (true) {
                                    System.out.println("========== HONDA VARIO 125==========");
                                    Honda baru = new Honda("Vario 125", "Honda", "2012", "Matte White", 22350000);

                                    System.out.println("Merk    : " + baru.getMerk());
                                    System.out.println("Nama    : " + baru.getNama());
                                    System.out.println("Tahun   : " + baru.getThn());
                                    System.out.println("Warna   : " + baru.getWrn());
                                    System.out.println("Harga   : " + baru.getHarga());

                                    System.out.println();
                                    baru.detailmesin();
                                    System.out.println();
                                    baru.performa();
                                    System.out.println();
                                    baru.dimensi();

                                    System.out.println("\nIngin Membeli Motor? (Ya/Tidak) : ");
                                    cek = in.next().charAt(0);
                                    if (cek == 'Y' || cek == 'y') {
                                        System.out.println("==========Waktu Pembayaran==========");
                                        System.out.println("Kode Pembayaran     : ");
                                        kode_pmbyrn = in.next();
                                        System.out.println("Tanggal Pembayaran  : ");
                                        tgl = in.next();
                                        System.out.println("Waktu Pembayaran    : ");
                                        wkt = in.next();

                                        System.out.println("==========Data Pembelian==========");
                                        System.out.println("NIK     : ");
                                        nik = in.next();
                                        System.out.println("Nama    : ");
                                        nama = in.next();
                                        System.out.println("Alamat  : ");
                                        alamat = in.next();
                                        System.out.println("No.Telp : ");
                                        tlp = in.next();
                                        System.out.println("Uang Pembayaran : ");
                                        byr = in.nextLong();

                                        Transaksi trnsksiyamaha = new Transaksi(kode_pmbyrn, tgl, wkt, byr, 22350000);
                                        trnsksiyamaha.datapelanggan(nik, nama, alamat, tlp);
                                        trnsksiyamaha.datamotor("Vario 125", "Honda", "2012", "Matte White", 22350000);
                                        System.out.println();
                                        trnsksiyamaha.Transaksipembelian();
                                        new java.util.Scanner(System.in).nextLine();
                                        beli = false;
                                        break;
                                    } else if (cek == 'T' || cek == 't') {
                                        System.out.println();
                                        break;
                                    } else {
                                        System.out.println("Input Anda Salah\n");
                                    }
                                }
                                break;
                            case '3':
                                System.out.println();
                                beli = false;
                                break;
                            default:
                                System.out.println("Input Anda Salah");
                        }
                    }
                        break;
                        case '2':
                            System.out.println("+===============================+");
                            System.out.println("|       PROGRAM BELI MOTOR      |");
                            System.out.println("+===============================+");
                            System.out.println("| Data Penjualan                |");
                            System.out.println("|_______________________________|");
                            System.out.println("| - Kode Penjualan      : ");
                            kode_pmbyrn = in.next();
                            System.out.println("| - Tanggal Penjualan   : ");
                            tgl = in.next();
                            System.out.println("| - Waktu Penjualan     : ");
                            wkt = in.next();
                            System.out.println("|_______________________________|");
                            System.out.println("| Data Motor                    |");
                            System.out.println("|_______________________________|");
                            System.out.println("| - Merk    : ");
                            mrk = in.next();
                            System.out.println("| - Nama    : ");
                            nama = in.next();
                            System.out.println("| - Tahun   : ");
                            thn = in.next();
                            System.out.println("| - Warna   : ");
                            warna = in.next();
                            System.out.println("| - Harga   : ");
                            harga = in.nextLong();
                            System.out.println("|_______________________________|");
                            System.out.println("| Data Penjual                  |");
                            System.out.println("|_______________________________|");
                            System.out.println("| - NIK     : ");
                            nik = in.next();
                            System.out.println("| - Nama    : ");
                            nama = in.next();
                            System.out.println("| - Alamat  : ");
                            alamat = in.next();
                            System.out.println("| - No.telp : ");
                            tlp = in.next();

                            Transaksi Transaksijual = new Transaksi(kode_pmbyrn,tgl,wkt,20000000,10000000);;
                            Transaksijual.datapelanggan(nik, nama, alamat, tlp);
                            Transaksijual.datamotorjual(mrk, nama, thn, warna, harga);

                            Transaksijual.Transaksipenjualan();
                            new java.util.Scanner(System.in).nextLine();
                            break;

                        case '0':
                            menu = false;
                            break;
                        default:
                            System.out.println("Input Anda Salah");

        }
    }
}
}