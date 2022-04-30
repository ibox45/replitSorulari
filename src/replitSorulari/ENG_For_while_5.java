package replitSorulari;

import java.util.ArrayList;
import java.util.List;

public class ENG_For_while_5 {
   /* Print even numbers from 20 to 0 but do not use decrement (i--).

    OUTPUT : Even Numbers from 20 to 0 are: 20 18 16 14 12 10 8 6 4 2 0  */

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <=20; i++) {
            if((i%2)==0){
                list.add(0,i);
            }

        }
        System.out.print("Even Numbers from 20 to 0 are:");

        for (int i = 0; i < list.size(); i++) {
            System.out.print(" "+list.get(i));


        }



    }
}
