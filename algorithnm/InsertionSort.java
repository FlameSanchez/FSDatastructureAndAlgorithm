
import java.util.Arrays;

public class InsertionSort {


    int[] insertSort(int A[],int num){
        for (int i = 1; i <num; i++) {
            int key=A[i];
            int j=i-1;
            for (; j >=0 && A[j]>key ; j--) {
                A[j + 1] = A[j];
            }
        A[j+1]=key;

        }
        return A;
    }

    public static void main(String[] args) {
        int []a={5,2,4,6,1,3};
        int []b={23,42,124,523,423,555};

        int[] sorted = new InsertionSort().insertSort(b, b.length);
        Arrays.stream(sorted).forEach(System.out::println);
    }
}
