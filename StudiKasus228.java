import java.util.Scanner;

public class StudiKasus228 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String nama, jenisKegiatan;
        int dokumen, juara, statusPKM, kurang;

        System.out.print("Masukkan nama mahasiswa: ");
        nama = sc.nextLine();

        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA): ");
        jenisKegiatan = sc.nextLine();

        if(jenisKegiatan.equalsIgnoreCase("LAINNYA")){
            System.out.println("Status: Tidak memperoleh dana.");
        } else {
            System.out.print("Masukkan jumlah dokumen: ");
            dokumen = sc.nextInt();

            juara = 0;
            statusPKM = 0;

            if(jenisKegiatan.equalsIgnoreCase("PKM")){
                System.out.print("Masukkan status PKM (1: Lolos, 0: Tidak Lolos): ");
                statusPKM = sc.nextInt();
            } else {
                System.out.print("Peringkat juara: ");
                juara = sc.nextInt();
            }

        if(dokumen<4) {
            kurang = 4 - dokumen;
            System.out.println("Status: Tidak memperoleh dana. Kekurangan dokumen: " + kurang);
        } else {
            if(jenisKegiatan.equalsIgnoreCase("PKM") && statusPKM == 1) {
                System.out.println("Status: Memperoleh dana.");
            } else if(!jenisKegiatan.equalsIgnoreCase("PKM") && juara > 0) {
                System.out.println("Status: Memperoleh dana.");
            } else {
                System.out.println("Status: Tidak memperoleh dana.");
            }
            if(juara > 0 && juara <= 3) {
                System.out.println("Status: Memperoleh dana.");
            } else {
                System.out.println("Status: Tidak memperoleh dana.");

            }
        } 
    } 
} 
}