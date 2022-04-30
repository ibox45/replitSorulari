package replitSorulari;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.sort;

public class ENG_For_while_3 {

    /*
    Write a code that returns the duplicate chars in a String array.(interview Question)

Input :

String str=“Javaisalsoeasy”

Output: [a, s]

Bir String dizisinde yinelenen karakterleri döndüren bir kod yazın.(mülakat Sorusu)

Giriş :

String str = “Javaisalsoeasy”

Çıktı: [a, s]


     */


    public static void main(String[] args) {

        String str = "Javaisalsoeas";
        String[] arrayStr = str.split("");
        sort(arrayStr);



        List<String> yeniStr = new ArrayList<>();

        for (int i =0 ; i <arrayStr.length-1; i++) {
            if (arrayStr[i].equals(arrayStr[i+1]) ) {
                if(!yeniStr.contains(arrayStr[i])) {
                    yeniStr.add(arrayStr[i]);
                }

            }

        }
        System.out.println(yeniStr);
    }

}



