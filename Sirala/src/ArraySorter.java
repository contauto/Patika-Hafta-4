/*Java dilinde, dizideki elemanları küçükten büyüğe sıralayan programı yazınız. Dizinin boyutunu ve dizinin elemanlarını kullanıcıdan alınız.*/



import java.util.Arrays;
import java.util.Scanner;

public class ArraySorter {
    public static void Sorter(){

        Scanner scanner=new Scanner(System.in);

        System.out.println("Eleman sayısını giriniz");
        int howMany=scanner.nextInt();

        int[] array=new int[howMany];

        for (int i = 0; i < howMany; i++) {
            System.out.println((i+1)+".elemanı giriniz");
            array[i]=scanner.nextInt();
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

    }
}
