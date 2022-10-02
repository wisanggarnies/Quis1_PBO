import java.util.Scanner;
public class RunPEGAWAI {
    public static void main (String[] args) {
        // Instansiasi
        Scanner sc = new Scanner(System.in);

        //Input Data
        System.out.println("=============================");
        System.out.println("         DATA PEGAWAI        ");
        System.out.println("=============================");
        System.out.print ("Masukkan Jumlah Pegawai : ");
        int jp = sc.nextInt();
        
        for (int i = 0; i < jp ; i++) {
            System.out.print ("Masukkan Nama Pegawai : ");
        String nama = sc.next();

        System.out.print ("Masukkan NIP : ");
        String nip = sc.next();

        PEGAWAI pgw = new PEGAWAI(nama, nip);

        System.out.print ("Jumlah Jam Kerja : ");
        int jumlahJamKerja = sc.nextInt();

        //Pemanggilan method pada class PEGAWAI
        pgw.setJamKerja(jumlahJamKerja);
        pgw.hitungGajiHarian();
        pgw.cetakPenghasilan();
        }
    }
}
