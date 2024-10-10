
import java.util.ArrayList;
import java.util.Arrays;

/*顺序查找
课堂练习1：
需求：定义一个方法利用基本查找，查询某个元素在数组中的索引
要求：不需要考虑数组中元素是否重复
课堂练习2：
需求：定义一个方法利用基本查找，查询某个元素在数组中的索引
要求：需要考虑数组中元素有重复的可能性*/
public class SearchClass {

    static int a[] = {1, 23, 4, 6, 1, 2, 323, 1, 4, 1, 23};

    private static void sequentialSearch(String[] args) {
        ArrayList arrayList = new ArrayList();
        int j=0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == Integer.parseInt(args[0])) {
                arrayList.add(j);
            }
            j++;
        }
        System.out.println(arrayList);
    }

//    binarySearch 二分/折半查找
//    条件:顺序排序 mid=(min+max)/2 向下取整
//    max=mid-1/  min=mid+1

    //分块查找
//    分块的原则1：前一块中的最大数据，小于后一块中所有的数据（块内无序，块间有序)
//    分块的原则2：块数数量一般等于数字的个数开根号。比如：16个数字 一般分为4块左右，
    public static void main(String[] args) {
//        sequentialSearch(args);
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
