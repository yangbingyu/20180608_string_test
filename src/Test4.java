import java.util.Scanner;

/**
 * Created by dell on 2018/6/8.
 */

/**
 * 输入两个字符串，计算其中一个字符串在另一个字符串中出现的次数

 */
public class Test4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int count=0;
        System.out.println("请输入第一个字符串：");
        String str1=scanner.next();
        System.out.println("请输入第二个字符串：");
        String str2=scanner.next();
//        int fromIndex=0;
//        while (fromIndex!=-1){
//            fromIndex=str1.indexOf(str2,fromIndex);
//            if (fromIndex!=-1){
//                fromIndex+=str2.length();
//                count++;
//            }
//        }
        System.out.println(getCount(str1,str2));
    }
    public static int getCount(String str1,String str2){
        int count=0;
        while (str1.indexOf(str2)>=0){
            count++;
            str1=str1.substring(str1.indexOf(str2)+str2.length());
        }
        return count;
    }

}
