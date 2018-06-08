import java.util.Scanner;

/**
 * Created by dell on 2018/6/8.
 */

/**
 *写一个字符串，判断其是否回文
 */
public class Test1 {
    public static boolean isHuiWen(String text) {
        int length = text.length();
        for (int i = 0; i < length / 2; i++) {
            //返回一个字符数组，该字符数组中存放了当前字符串中的所有字符
            if (text.toCharArray()[i] != text.toCharArray()[length - i - 1]) {
                return false;
            }
        }
        return true;
    }
    public static boolean isHuiWen1(String text) {
        int length = text.length();
        for (int i = 0; i < text.length(); i++) {
            //返回一个字符数组，该字符数组中存放了当前字符串中的所有字符
            if (text.charAt(i)!= text.charAt(text.length()-i-1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String text = scanner.next();
        System.out.println(isHuiWen(text));
        System.out.println(isHuiWen1(text));
    }
}
