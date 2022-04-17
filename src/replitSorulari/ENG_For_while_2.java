package replitSorulari;

import java.util.Scanner;

public class ENG_For_while_2 {

    /*
    Ask user to enter 2 integer then find GCD (Greatest Common Divisor) and LCM (Least Common Multiple)

Input :

30 and 40

Expected OutPut:

GCD for 30 and 40 = 10

LCM for 30 and 40 = 120

**********

Kullanıcıdan 2 tamsayı girmesini ve ardından GCD'yi (En Büyük Ortak Bölen) ve LCM'yi (En Küçük Ortak Kat) bulmasını isteyin

Giriş :

30 ve 40

Beklenen çıktı:

30 ve 40 = 10 için GCD

30 ve 40 = 120 için LCM
     */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("iki tam sayi girin : ");
        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();

        int gcd=1;
        int lcm=1;

        for (int i = 1; i < sayi1; i++) {
            if(sayi1%i==0  && sayi2%i==0){
                gcd=i;
                lcm=(sayi1*sayi2)/i;

            }



        }
        System.out.println("GCD for "+sayi1+" and "+sayi2+" = "+gcd);
        System.out.println("LCM for "+sayi1+" and "+sayi2+" = "+lcm);




        }


    }

