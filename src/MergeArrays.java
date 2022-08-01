public class MergeArrays {
    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] mergedArrays = new int[a1.length + a2.length];
        int i = 0, j = 0;
        for (int k = 0; k < mergedArrays.length; k++) {
            if (i > a1.length - 1) {
                int a = a2[j];
                mergedArrays[k] = a;
                j++;
            } else if (j > a2.length - 1) {
                int a = a1[i];
                mergedArrays[k] = a;
                i++;
            } else if (a1[i] < a2[j]) {
                int a = a1[i];
                mergedArrays[k] = a;
                i++;
            } else {
                int b = a2[j];
                mergedArrays[k] = b;
                j++;
            }
        }
        return mergedArrays;
    }

}
