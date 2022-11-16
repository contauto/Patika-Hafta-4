import java.util.Scanner;

public class Matrix {
    public static void Transpose(){

        Scanner scanner=new Scanner(System.in);

        System.out.println("Satır sayısını giriniz");
        int row=scanner.nextInt();
        
        System.out.println("Sütun sayısını giriniz");
        int column=scanner.nextInt();

        int[][] matrix=new int[row][column];
        int[][] transpose=new int[column][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println((i+1)+". satır "+(j+1)+". sütun elemanını giriniz.");
                matrix[i][j]=scanner.nextInt();
                transpose[j][i]=matrix[i][j];
            }
        }

        Print(column, row, matrix);

        Print(row, column, transpose);


    }

    public static void Print(int row, int column, int[][] transpose) {
        for (int i = 0; i < column; i++) {
            System.out.print("|");
            for (int j = 0; j < row; j++) {
                System.out.print(" "+transpose[i][j]+" ");
            }
            System.out.println("|");
        }
    }
}
