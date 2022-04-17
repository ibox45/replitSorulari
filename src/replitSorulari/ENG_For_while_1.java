package replitSorulari;

import java.util.Scanner;

public class ENG_For_while_1 {

    /*
    Ask user to enter a name and a character, then check how many times the character is repeated in the name using loops in the name

e.g:

char ch1= 'a' ;

String name =“John came late"

Expected Output: Number of a = 2

************************

Kullanıcıdan bir isim ve bir karakter girmesini isteyin, ardından isimdeki döngüleri kullanarak karakterin isimde kaç kez tekrarlandığını kontrol edin.

Örneğin:

char ch1= 'a' ;

String name="John geç geldi"

Beklenen Çıktı: a sayısı = 2


     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("bir isim girin : ");
        String name = scan.nextLine();
        System.out.println("bir karakter girin : ");
        char ch1 = scan.next().charAt(0);


        int sayac = 0;


        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == ch1) {
                sayac++;


            }



        }
        System.out.println("number of "+ch1+" = "+sayac);
    }
}