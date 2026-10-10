impott java.util.Scanner;

public class StudiKasus228 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Sting nama, jenisKegiatan;
        int dokumen, juara, statusPKM;

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

            
        }
        
        sc.close();
    }
}
