import java.util.Arrays;
import java.util.Scanner;

public class MineSweeper {
    public static void Game() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Satır sayısını giriniz");
        int oyunKacSatir = scanner.nextInt();

        System.out.println("Sütun sayısını giriniz");
        int oyunKacSutun = scanner.nextInt();


        String[][] aktifHarita = mapLoader(oyunKacSatir, oyunKacSutun);

        String[][] mayinliHarita = mapLoader(oyunKacSatir, oyunKacSutun);


        int mayinSayisi = oyunKacSatir * oyunKacSutun / 4;

        for (int i = 0; i < mayinSayisi; i++) {
            int mayinliSatir = (int) Math.round(Math.random() * (oyunKacSatir - 1));
            int mayinliSutun = (int) Math.round(Math.random() * (oyunKacSatir - 1));
            if (mayinliHarita[mayinliSatir][mayinliSutun].equals("-")) {
                mayinliHarita[mayinliSatir][mayinliSutun] = "*";
            } else {
                i--;
            }
        }

        System.out.println("Mayınların konumu");

        print(oyunKacSatir, oyunKacSutun, mayinliHarita);

        System.out.println("Mayın tarlası oyununa hoş geldiniz.");

        int i=0;
        while (i < ((oyunKacSatir * oyunKacSutun) - mayinSayisi)) {
            System.out.println("Satır giriniz : ");
            int kacinciSatir = scanner.nextInt();

            System.out.println("Sütun giriniz : ");
            int kacinciSutun = scanner.nextInt();


            if (((kacinciSutun < 0) || (kacinciSutun >= oyunKacSutun)) || ((kacinciSatir < 0) || (kacinciSatir >= oyunKacSatir))) {
                System.out.println("Hatalı giriş yaptınız.");
                i--;
            } else if (mayinliHarita[kacinciSatir][kacinciSutun].equals("*")) {
                System.out.println("Oyunu kaybettiniz.");
                break;
            } else if (!(aktifHarita[kacinciSatir][kacinciSutun].equals("-"))) {
                System.out.println("Bu konuma önceden ulaştınız.");
                i--;
            } else {
                int counter = 0;
                for (int j = kacinciSatir - 1; j < kacinciSatir + 2; j ++) {
                    for (int k = kacinciSutun - 1; k < kacinciSutun + 2; k ++) {
                        if (!(j < 0 || k < 0 || j >= oyunKacSatir || k >= oyunKacSutun||((j==kacinciSatir)&&(k==kacinciSutun)))) {
                            if ((mayinliHarita[j][k]).equals("*")) {
                                counter++;
                            }
                        }
                    }
                }
                aktifHarita[kacinciSatir][kacinciSutun] =counter+("");
                print(oyunKacSatir, oyunKacSutun, aktifHarita);
            }

            i++;
            if (i==((oyunKacSatir * oyunKacSutun) - mayinSayisi)){
                System.out.println("Tebrikler kazandınız");
            }

        }


    }

    public static String[][] mapLoader(int satir, int sutun) {
        String[][] harita = new String[satir][sutun];

        for (String[] i : harita)
            Arrays.fill(i, "-");
        return harita;
    }

    public static void print(int oyunKacSatir, int oyunKacSutun, String[][] mayinliHarita) {
        for (int i = 0; i < oyunKacSatir; i++) {
            System.out.print("|");
            for (int j = 0; j < oyunKacSutun; j++) {
                System.out.print(" " + mayinliHarita[i][j] + " ");
            }
            System.out.println("|");
        }
    }


}
//System.out.println(Arrays.deepToString(mayinlar));