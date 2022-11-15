import java.util.*;

public class Dizi_Yakin {
    public static void En_Yakin(int sayi) {
        int[] dizi = {15, 12, 788, 1, -1, -778, 2, 0};
        Arrays.sort(dizi);
        int min=dizi[0];
        int maks=dizi[7];


        for (int i : dizi
        ) {
            if ((i>min)&&(i<sayi)){
                min=i;
            }
            else if((i<maks)&&(i>sayi)){
                maks=i;
            }
        }

        System.out.println("Girilen sayı:" + sayi + "\n" + "Girilen sayıdan küçük en yakın sayı: " + min + "\n" + "Girilen sayıdan büyük en yakın sayı: " + maks);
    }
}
