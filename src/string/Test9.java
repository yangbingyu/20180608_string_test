package string;

import java.util.Scanner;

/**
 * Created by dell on 2018/6/8.
 */

/**
 * 编写程序，模拟equals的功能，实现比较两个字符串是否一样
 */
public class Test9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入第一个字符串：");
        String str1=scanner.next();
        System.out.println("请输入第二个字符串：");
        String str2=scanner.next();
        System.out.println(xiangdeng(str1,str2));
    }
    public static boolean xiangdeng(String s1,String s2){
        if (s1==null||s2==null){
            return false;
        }
        if (s1.length()!=s2.length()){
            return false;
        }
        boolean b=true;
        for (int i=0;i<s1.length();i++){
            if (s1.charAt(i)!=s2.charAt(i)){
                b=false;
            }
        }
        return b;
    }
}
