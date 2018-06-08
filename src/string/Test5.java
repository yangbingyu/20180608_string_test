package string;

import java.util.Scanner;

/**
 * Created by dell on 2018/6/8.
 */

/**
 * 实现注册功能，提示用户录入用户名、密码、邮箱等数据，如果有不合要求的数据，提示并让重新输入
 */
public class Test5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.println("请输入用户名：");
            String name=scanner.next();
            System.out.println("请输入密码：");
            String pwd=scanner.next();
            System.out.println("请输入邮箱：");
            String email=scanner.next();
//            if (name.matches("[A-Za-z0-9_\\-\\u4e00-\\u9fa5]+")&&pwd.matches("[1-9]\\d*")&&email.matches("\\w[-\\w.+]*@([A-Za-z0-9][-A-Za-z0-9]+\\.)+[A-Za-z]{2,14}")){
//                        System.out.println("成功登陆！");
//                        break;
//            }else {
//                continue;
//            }
            if (name==null||name.length()<6){
                System.out.println("用户名至少6位");
            }else if (pwd==null||pwd.length()<6){
                System.out.println("密码至少6位");
            }else if (email.indexOf("@")<0||email.indexOf(".")<0){
                System.out.println("邮箱不符合要求");
            }else{
                System.out.println("注册成功");
                break;
            }
        }
    }
}
