import java.util.Arrays;
import java.util.Scanner;

public class MineSweeper {
    public static void Game(){
    Scanner scanner=new Scanner(System.in);

    System.out.println("Satır sayısını giriniz");
    int satir=scanner.nextInt();


    System.out.println("Sütun sayısını giriniz");
    int sutun=scanner.nextInt();

    int[][] dizi=new int[satir][sutun];
    int mayinSayisi=satir*sutun/4;

    int[][] mayinlar=new int[mayinSayisi][2];
        for (int i = 0; i < mayinSayisi ; i++) {
            for (int j = 0; j < 2; j++) {
                if(j==0){

                    mayinlar[i][j]=(int)Math.round(Math.random()*(satir-1));
                }
                else{
                    mayinlar[i][j]=(int)Math.round(Math.random()*(sutun-1));
                }


            }
            }
        System.out.println(Arrays.deepToString(mayinlar));
        }

    }

