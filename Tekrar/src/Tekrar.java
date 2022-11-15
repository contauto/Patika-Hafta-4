import java.util.ArrayList;
import java.util.List;

public class Tekrar {
    public static void Cift(){
        int[] dizi={0,0,0,1,1,2,3,4,5,5,6,5,7,8,8,9,10,11,10};
        int[] klon=dizi.clone();
        List<Integer> liste=new ArrayList<>();
        for (int i = 0; i < dizi.length; i++) {
            for (int j = i+1; j < klon.length; j++) {
                if((dizi[i]==klon[j])&&(dizi[i]%2==0)&&(!liste.contains(dizi[i]))){
                    liste.add(dizi[i]);
                }
            }
        }
        System.out.println(liste);
    }
}
