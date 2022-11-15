public class Ort {
    public static void Harmonik(){
        double[] numbers = {1, 2, 3, 4, 5};
        double ans = 0;
        for (int i = 0; i < numbers.length; i++) {
            ans += 1/numbers[i];
        }

        System.out.println((double)(numbers.length)/ans);
    }
}
