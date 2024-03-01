package assessment;

public class Array {

    public static int readsArray(int[] array) {
        int n = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > n) {
                n = array[i];
            }
        }
        return n;
    }
}
