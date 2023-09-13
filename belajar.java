import java.util.Scanner;

public class belajar {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        int weekday, weekend, Holiday;

        String pilih = "";

        System.out.println("1.Duku\n harga permalam:\n weekday:915.000\n weekend:1.025.000\n Holiday:1.225.000");
        System.out.println("2.jeruk\n harga permalam:\n weekday:915.000\n weekend:1.025.000\n Holiday:1.225.000");
        System.out.println("3.Alpukat\n harga permalam:\n weekday:575.000\n weekend:695.000\n Holiday:895.000");
        System.out.println("4.Jambu air\n harga permalam:\n weekday:575.000\n weekend:695.000\n Holiday:895.000");
        System.out.println("5.durian\n harga permalam:\n weekday:595.000\n weekend:715.000\n Holiday:915.000");
        System.out.println("6.Melon\n harga permalam:\n weekday:595.000\n weekend:715.000\n Holiday:915.000");
        System.out.println("7.Blimbing\n harga permalam:\n weekday:495.000\n weekend:575.000\n Holiday:755.000");
        System.out.println("8.Mangga\n harga permalam:\n weekday:495.000\n weekend:575.000\n Holiday:755.000");
        System.out.println("9.Kedondong\n harga permalam:\n weekday:495.000\n weekend:575.000\n Holiday:755.000");

        System.out.println("masukkan pilihan kamar");
        int kamar = x.nextInt();

        System.out.println("1.weekday");
        System.out.println("2.weekend");
        System.out.println("3.Holiday");
        System.out.println("menginap dihari apa");
        int hari = x.nextInt();

        System.out.println("masukkan jumlah malam");
        int malam = x.nextInt();

        int harga = 0;

        switch (kamar) {
            case 1:
                System.out.println("weekday:915.000");
                System.out.println("weekend:1.025.000");
                System.out.println("Holiday:1.255.000");
                break;
            default:
                harga = 0;
                break;
        }

        switch (kamar) {
            case 2:
                System.out.println("weekday:915.000");
                System.out.println("weekend:1.025.000");
                System.out.println("Holiday:1.225.000");
                break;
            default:
                harga = 0;
                break;
        }
        switch (kamar) {
            case 3:
                System.out.println("weekday:575.000");
                System.out.println("weekend:695.000");
                System.out.println("Holiday:895.000");
                break;
            default:
                harga = 0;
                break;
        }
        switch (kamar) {
            case 4:
                System.out.println("weekday:575.000");
                System.out.println("weekend:695.000");
                System.out.println("Holiday:895.000");
                break;
            default:
                harga = 0;
                break;
        }
        switch (kamar) {
            case 5:
                System.out.println("weekday:595.000");
                System.out.println("weekend:715.000");
                System.out.println("Holiday:915.000");
                break;
            default:
                harga = 0;
                break;
        }
        switch (kamar) {
            case 6:
                System.out.println("weekday:595.000");
                System.out.println("weekend:715.000");
                System.out.println("Holiday:915.000");
                break;
            default:
                break;
        }
        switch (kamar) {
            case 7:
                System.out.println("weekday:495.000");
                System.out.println("weekend:575.000");
                System.out.println("Holiday:755.000");
                break;
            default:
                break;
        }
        switch (kamar) {
            case 8:
                System.out.println("weekday:495.000");
                System.out.println("weekend:575.000");
                System.out.println("Holiday:755.000");
                break;
            default:
                break;
        }
        switch (kamar) {
            case 9:
                System.out.println("weekday:495.000");
                System.out.println("weekend:575.000");
                System.out.println("Holiday:755.000");
                break;
            default:
                break;

        }
        System.out.println("pilihan kamar" + kamar);
        System.out.println("pilihan hari" + hari);
        System.out.println("berapa malam menginap" + malam);
        System.out.println("total harga" + hari * malam);
    }
}
