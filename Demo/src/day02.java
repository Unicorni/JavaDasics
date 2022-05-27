import java.util.Scanner;
//字符串反转
public class day02 {
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("请输入一个字符串");
            String str = scanner.nextLine();

            StringBuilder stringBuilder = new StringBuilder(str);
            StringBuilder reverse = stringBuilder.reverse();
            System.out.println(reverse);
    }
}
