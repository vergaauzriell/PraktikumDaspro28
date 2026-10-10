import java.util.Scanner;

public class StudiKasus1 {

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in)

        int hargaPercup = 18000;
        int jumlahCup, uangBayar, totalHarga, diskon, totalBayar, kembalian, kurang;

        System.out.print("Masukkan jumlah cup: ");
        jumlahCup = sc.nextInt();
        System.out.print("Masukkan jumlah uang: ");
        uangBayar = sc.nextInt();

        totalHarga = jumlahCup * hargaPercup;
        diskon = 0;

        if(totalHarga >= 100000) {
            diskon = totalHarga * 10 / 100;
        } else {
            diskon = 0;
        }
        totalBayar = totalHarga - diskon;

        System.out.println("Total Harga: " + totalHarga);
        System.out.println("Diskon: " + diskon + "%");
        System.out.println("Total Bayar: " + totalBayar);

        if(uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian: " + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang kurang: " + kurang);
        }

    sc.close();
    }
}