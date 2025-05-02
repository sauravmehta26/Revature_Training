
public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public int[] combine(int[] arr1, int[] arr2){
        int n = arr1.length;
        int m = arr2.length;
        int[] res = new int[n + m];

        for (int i = 0; i < n; i++) {
            res[i] = arr1[i];
        }
        for (int i = 0; i < m; i++) {
            res[n + i] = arr2[i];
        }

        return res;
    }
}
