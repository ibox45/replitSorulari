package replitSorulari;

public class ENG_For_while_4 {

  /*  Write a return method that accepts an integer as input and calculates factorial and prints like output.

    Input : 6

    Output: 6!=65432*1=720*/

    public static void main(String[] args) {

        int input=6;

        faktoriyelHesapla(input);
    }

    private static void faktoriyelHesapla(int a) {
        int faktoriyel=1;
        System.out.print(a+"!=");

        for (int i = a; i >= 2; i--) {
            faktoriyel*=i;
            System.out.print(i+"*");


        }
        System.out.println("1="+faktoriyel);
    }
}
