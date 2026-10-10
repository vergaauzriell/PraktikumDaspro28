import java.util.Scanner;

public class StudiKasus128 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int hargaPercup = 18000;
        int jumlahCup, uangBayar, totalHarga, kembalian, kurang, diskon, totalBayar;

        System.out.print("Masukkan jumlah cup: ");
        jumlahCup = sc.nextInt();
        System.out.print("Masukkan uang bayar: ");
        uangBayar = sc.nextInt();

        totalHarga = hargaPercup * jumlahCup;
        diskon = 0;

        if(totalHarga>=100000){
            diskon = totalHarga * 10 / 100;
        } else {
            diskon = 0;
        }

        totalBayar = totalHarga - diskon;

        System.out.println("Total harga: " + totalHarga);
        System.out.println("Diskon: " + diskon);
        System.out.println("Total bayar: " + totalBayar);

        if(uangBayar >= totalBayar){
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian: " + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang kurang: " + kurang);
        }

        sc.close();
    }
}