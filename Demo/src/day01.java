//冒泡排序
public class day01 {
    public static void main(String[] args) {
        int[] a ={5,4,3,2,1};
        sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
    //1.比较数组中两个相邻的元素，如果第一个数比第二个数大，就交换
    //2.每一次比较都会产出一个最大或者最小的元素
    //3.下一轮少一次排序
    //4.依次循环，直到结束！
    public static  void sort(int[] array){
        //外层循环，判断程序要走多少次
        int prices;// prices临时变量
        for (int i = 0; i < array.length - 1; i++) {
            //内层循环，比较两个数，如果第一个数比第二个数大，则交换
            for (int j = 0; j < array.length-1-i; j++) {
                if(array[j] > array[j+1]){
                    prices = array[j];
                    array[j] = array[j+1];
                    array[j+1] = prices;
                }
            }
        }
    }
}
