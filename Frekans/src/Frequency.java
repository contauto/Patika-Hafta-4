//Java dilinde, dizideki elemanların kaç kez tekrar edildiğini yani frekanslarını bulan programı yazınız.

import java.util.Arrays;

public class Frequency {
    public static void Calculate(){

        int[] array={10, 20, 20, 10, 10, 20, 5, 20};
        boolean[] visited=new boolean[array.length];
        int count=1;
        Arrays.fill(visited,false);

        for (int i = 0; i < array.length; i++) {
            if (!visited[i]){
                visited[i]=true;
                for (int j = i+1; j < array.length ; j++) {
                    if (array[i]==array[j]){
                        count++;
                        visited[j]=true;

                    }
                }

                System.out.println(array[i]+" sayısı "+count+" kere tekrar edildi.");
                count=1;
            }

        }


    }
}
