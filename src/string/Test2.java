package string;

import java.util.Scanner;

/**
 * Created by dell on 2018/6/8.
 */

/**
 * 编写代码从字符串中删除某个字符串
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入原字符串：");
        String str=scanner.next();
        System.out.println("请输入要删除的字符串：");
        String delstr=scanner.next();
//        int index=0;
//        while((index=str.indexOf(delstr))!=-1){
            str=str.replace(delstr,"");
//        }
        System.out.println("删除后的字符串是："+str);
    }
}
