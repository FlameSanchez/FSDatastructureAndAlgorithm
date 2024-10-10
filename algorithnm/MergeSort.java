
public class MergeSort {

    //array a length must be an even number?
    int[] mergeSort(int[] a) {
        return null;
    }


    //two subarray already sorted or contain only one element
    int[] merge(int[] a, int p, int q, int r) {
//        int p = 0;
//        int r = a.length - 1;
//        int q = (p + r) / 2;

        int[] L = new int[q + 1];
        int[] R = new int[r - q];

        //assign values to L[],R[]
        for (int i = 0; i <= q; i++) {
            L[i] = a[i];
        }

        for (int j = q + 1; j <= r; j++) {
            R[j] = a[j];
        }

        //sort L[],R[] smaller value to a[]
        int i = 0;
        int j = 0;
        int k = p;
        for (; i < L.length && j < R.length; ) {
            if (L[i] <= R[j]) {
                a[k] = L[i];
                i++;
                k++;
            } else {
                a[k] = R[j];
                j++;
                k++;
            }
        }
        while (i < L.length) {
            a[k] = L[i];
            i++;
            k++;
        }
        while (j < R.length) {
            a[k] = R[j];
            j++;
            k++;
        }

        return a;
    }


    public static void main(String[] args) {
        int x[] = {2, 4, 5, 8, 11};
        int y[] = {1,2,8,56,67};

//        new merge
        System.out.println(x);
    }
}
