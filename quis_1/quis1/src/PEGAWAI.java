public class PEGAWAI {
    private String nama;
    private String nip;
    private double gajiPokok;
    private double lembur;
    private double uangMakan;
    private double transport;
    private int jumlahJamKerja;
    private double totalGaji;
    
    public PEGAWAI (String nama , String nip) {
        this.nama = nama;
        this.nip = nip;
    }

    public void setJamKerja(int jumlahJamKerja) {
        this.jumlahJamKerja = jumlahJamKerja;
    }

    public int getJamKerja() {
        return jumlahJamKerja; 
    }

    public void hitungGajiHarian() {
        if(jumlahJamKerja > 0 && jumlahJamKerja <= 7) {
            gajiPokok = 2000 * jumlahJamKerja;
            totalGaji = gajiPokok;
        }else if (jumlahJamKerja > 7 && jumlahJamKerja < 9) {
            gajiPokok = 2000 * 7;
            lembur = (jumlahJamKerja - 7) * 3000;
            uangMakan = 3500;
            totalGaji = gajiPokok + lembur + uangMakan;
        }else if (jumlahJamKerja >= 9) {
            gajiPokok = 2000 * 7;
            lembur = (jumlahJamKerja - 7) * 3000;
            uangMakan = 3500;
            transport = 4000;
            totalGaji = gajiPokok + lembur + uangMakan + transport;
        }else{
            System.out.println ("Jumlah Jam Kerja Tidak Valid!!!");
        }
    }

    public void cetakPenghasilan() {
        System.out.println("=============================");
        System.out.println("         GAJI PEGAWAI        ");
        System.out.println("=============================");
        System.out.println("Nama             : " + nama);
        System.out.println("Nip              : " + nip);
        System.out.println("Gaji Pokok       : " + gajiPokok);
        System.out.println("Lembur           : " + lembur);
        System.out.println("Uang Makan       : " + uangMakan);
        System.out.println("Transport        : " + transport);
        System.out.println("Total Gaji       : " + totalGaji);
        System.out.println("=============================");

    }
}
