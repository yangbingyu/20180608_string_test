package stringBufferdemo;

import java.util.Scanner;

/**
 * Created by dell on 2018/6/8.
 */

/**
 * 从控制台录入两个StringBuffer，比较两个StringBuffer是否一样
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入第一个：");
        String str1=scanner.next();
        StringBuffer stringBuffer1=new StringBuffer(scanner.next());
        System.out.println("请输入第二个：");
        StringBuffer stringBuffer2=new StringBuffer();
        stringBuffer2.append(scanner.next());
        if (stringBuffer1.toString().equals(stringBuffer2.toString())){
            System.out.println("相等");
        }else{
            System.out.println("不相等");
        }
    }
}
