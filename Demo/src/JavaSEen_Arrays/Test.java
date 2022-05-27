package JavaSEen_Arrays;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        System.out.println("极客小志。。。冒泡排序\n");
        int[] arr = {1, 2, 432, 32, 54, 32, 3, 7, 657, 563, 25, 43, 6, 463, 52};
        System.out.println(Arrays.toString(arr));
        //冒泡排序
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("【排序后】：");
        System.out.println(Arrays.toString(arr));
    }
}