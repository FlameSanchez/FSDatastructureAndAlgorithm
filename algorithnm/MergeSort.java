import java.util.Arrays;
import java.util.stream.Collectors;

public class MergeSort {

    int[] mergeSort(int[] A, int p, int r) {//a 0,9
        if (p >= r)
            return null;
        int q = (p + r) / 2;//4
        mergeSort(A, p, q);//0,4
        mergeSort(A, q + 1, r); //5,9
        merge(A, p, q, r);//
        return A;
    }

    //array a length must be an even number?
    //two subarray already sorted or contain only one element
    void merge(int[] A, int p, int q, int r) { //0,4,9   //0,2,5

        //assign values to L[],R[]
        int[] L = new int[q - p + 1];
        int[] R = new int[r - q];

//        for (int i = 0; i < q - p + 1; i++) {
//            L[i] = A[p + i];
//        }
        System.arraycopy(A, p, L, 0, q - p + 1);
//
//        for (int j = 0; j < r - q; j++) {
//            R[j] = A[q + j + 1];
//        }
        System.arraycopy(A, q + 1, R, 0, r - q);

        System.out.println(Arrays.stream(A).mapToObj(String::valueOf).collect(Collectors.joining(",")));

        //sort and merge smaller value of L[],R[] to a[]
        int i = 0;
        int j = 0;
        int k = p;
        while (i < L.length && j < R.length) {
            if (L[i] <= R[j]) {
                A[k] = L[i];
                i++;
            } else {
                A[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < L.length) {
            A[k] = L[i];
            i++;
            k++;
        }
        while (j < R.length) {
            A[k] = R[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {

        //test merge()
//        int[] x = {2, 4, 5, 8, 11, 1, 2, 8, 56, 67};
//        int[] y = new MergeSort().merge(x, 0, x.length / 2 - 1, x.length - 1);
//        Arrays.stream(y).forEach(System.out::println);
        //1,2,2,4,5,8,8,11,56,67

        //test mergeSort()
        int[] z = {5, 77, 1, 23, 1, 8, 4, 3, 2, 42};
        int[] merged = new MergeSort().mergeSort(z, 0, z.length - 1);
        System.out.println(Arrays.stream(merged).mapToObj(String::valueOf).collect(Collectors.joining(",")));

    }
}
