import java.util.Scanner;

/**
 * Created by dell on 2018/6/8.
 */

/**
 * 编写程序，模拟trim的功能，去除字符串两段的空格
 */
public class Test8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一个字符串前后包含空格：");
        String str=scanner.next();
        System.out.println(quchu(str));
    }
//    public static String my_trim(String str) {
//        int start = 0, end = str.length() - 1;
//
//        while (start <= end && str.charAt(start) == ' ')
//            start++;
//
//        while (start <= end && str.charAt(end) == ' ')
//            end--;
//
//        return str.substring(start, end + 1);
//    }
    public static String quchu(String s){
        while (s.startsWith(" ")){
            s=s.substring(1);
        }
        while (s.endsWith(" ")){
            s=s.substring(0,s.length()-1);
        }
        return s;
    }
}
