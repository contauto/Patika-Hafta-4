import java.util.Scanner;

public class Kelime {
    public static void Palindrom(String kelime) {
        String tersKelime="";
        StringBuilder stringBuilder=new StringBuilder(kelime);


        for (int i = 0; i<kelime.length(); i++) {
            stringBuilder.setCharAt((kelime.length()-i-1),kelime.charAt(i));
            tersKelime=stringBuilder.toString();
        }

        if(tersKelime.equals(kelime)) {
            System.out.println(kelime+" palindromiktir.");
        }
        else{
            System.out.println(kelime+" palindromik değildir.");
        }

    }
}