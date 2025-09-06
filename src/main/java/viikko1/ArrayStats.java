package viikko1;

public class ArrayStats {
    public static double average(int[] arr) {
        // TODO
        int numerot = 0;

        if (arr.length == 0){
            return 0.0;
        }
        for (int i = 0; i < arr.length; i++){
            numerot += arr[i];
        }
        return numerot / (double) arr.length;
    }
    public static int max(int[] arr) {
        // TODO
        if (arr.length == 0) {
            return Integer.MIN_VALUE;
        }
        int suurin = arr[0];
        for (int i = 1; i < arr.length; i++){
            if(suurin < arr[i]){
                suurin = arr[i];
            }
        }
        return suurin;
    }
}
