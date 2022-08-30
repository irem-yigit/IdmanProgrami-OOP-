package Idman_Programi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("İdman Programına Hoşgeldiniz....");
        String idmanlar = "Geçerli Hareketler\n"
                        + "Burpee\n"
                        + "Pushup(Şınav)\n"
                        + "Situp(Mekik)\n"
                        + "Squat\n";
        System.out.println(idmanlar);
        System.out.println("Bir idman oluşturun....");
        System.out.print("Burpee sayısı: ");
        int burpee = scan.nextInt();
        System.out.print("Pushup sayısı: ");
        int pushup = scan.nextInt();
        System.out.print("Situp sayısı: ");
        int situp = scan.nextInt();
        System.out.print("Squat sayısı: ");
        int squat = scan.nextInt();
        scan.nextLine();

        Idman idman = new Idman(burpee,pushup,situp,squat);

        System.out.println("İdmanınız başlıyor.....");

        while (idman.idmanBittiMi() == false){

            System.out.print("Hareket türü(Burpee, Pushup, Situp, Squat): ");
            String tur = scan.nextLine();
            System.out.println("Bu hareketten kaç tane yapacaksınız?: ");
            int sayi= scan.nextInt();
            scan.nextLine();
            idman.hareketYap(tur, sayi);
        }
        System.out.println("İdmanını başarıyla bitirdin....");
    }
}
