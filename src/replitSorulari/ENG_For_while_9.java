package replitSorulari;

import java.util.Scanner;

public class ENG_For_while_9 {
    /*
    Write a java program to reverse the number which user entered.

Input :1238
Output :Reverse Of The Number: 8321
     */
    public static void main(String[] args) {


    Scanner scan=new Scanner(System.in);
    int sayi=scan.nextInt();




        System.out.print("Girdiğiniz sayinin tersten yazılısı = ");
        while(sayi > 0) {

            System.out.print(sayi % 10);
            sayi /= 10;

        }


    }


}