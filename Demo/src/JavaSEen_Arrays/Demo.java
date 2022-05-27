package JavaSEen_Arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

//Java Arrays数组排序
/*
* 有以下 数组：

int [] arr = {1,332,43,25,3324,34,335,4,45,2,43,52,54};

要求：

请打印数组所有元素。
请对数组元素进行升序排序。
请对排序后的数组再次打印。
* */
public class Demo {
    public static void main(String[] args) {
        System.out.println("极客小志\n");
        // 定义数组
        int [] arr = {1,332,43,25,3324,34,335,4,45,2,43,52,54};
        // 打印原数组
        System.out.println("原数组:" + Arrays.toString(arr));
        // 排序数组
        Arrays.sort(arr);
        // 打印排列后的数组
        System.out.println("排序后数组：" + Arrays.toString(arr));

    }
}
