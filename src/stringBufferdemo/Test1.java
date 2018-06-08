package stringBufferdemo;

/**
 * Created by dell on 2018/6/8.
 */
public class Test1 {
    public static void main(String[] args) {
//      String string="12345";
//      StringBuffer stringBuffer=new StringBuffer(string);
//      System.out.println(stringBuffer);
//      StringBuffer stringBuffer=new StringBuffer(1024);
        StringBuffer stringBuffer=new StringBuffer("qwer");
        //存储了几个字符
        System.out.println(stringBuffer.length());
        //字符串不发生改变
        String s1="qwer";
        s1.concat("1234");
        System.out.println(s1);
        //追加
        stringBuffer.append("1234");
        System.out.println(stringBuffer);
        //在某个位置上插入元素
        stringBuffer.insert(2,"000");
        System.out.println(stringBuffer);
        //删除从某个位置到某个位置的字符，含头不含尾
        StringBuffer stringBuffer1=new StringBuffer("0123456");
        stringBuffer1.delete(3,4);
        System.out.println(stringBuffer1);
        //删除指定位置的字符
        stringBuffer1.deleteCharAt(5);
        System.out.println(stringBuffer1);
        //取出指定位置的字符
        System.out.println(stringBuffer.charAt(2));
        //把StringBuffer转换成String
        a(stringBuffer.toString());
    }
    public static  void a(String s){
        System.out.println(s);
    }
}
