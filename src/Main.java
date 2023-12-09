import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int bitis = 10, baslangic = 1, health = 5, tahmin;
        int secretNumber = random.nextInt(bitis - baslangic) + 1;


        boolean hak = true;

        do {
            System.out.print("Lutfen bir sayi giriniz : ");
            tahmin = input.nextInt();

            if (tahmin == secretNumber) {
                System.out.println("Tebrikler dogru bildiniz...");
                hak = false;
            } else if (tahmin <= secretNumber) {
                System.out.println("Kucuk sayi girdiniz. Lutfen daha buyuk bir sayi giriniz:");

            } else if (tahmin >= secretNumber) {
                System.out.println("Buyuk sayi girdiniz. Lutfen daha kucuk bir sayi giriniz:");
            }


            if (health == 4) {
                System.out.println("4 hakkiniz  kaldi...");

            } else if (health == 3) {
                System.out.println("3 hakkiniz  kaldi...");

            } else if (health == 2) {
                System.out.println("2 hakkiniz  kaldi...");

            } else if (health == 1) {
                System.out.println("1 hakkiniz  kaldi...");

            } else if (health == 0) {
                hak = false;
                System.out.println("Tum haklariniz bitti. Oyunu kaybettiniz...");
            }
            health--;

        } while (hak);


    }
}
