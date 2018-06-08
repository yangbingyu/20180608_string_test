package string;

/**
 * Created by dell on 2018/6/8.
 */

/**
 * 给定一个由数字组成的字符串,如:"1239586838923173478943890234092",统计
 出每个数字出现的次数
 */
public class Test7 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("输入纯数字的字符串：");
//        String string = scanner.next();
//        string.Test7 apperaNum = new string.Test7();
//        apperaNum.appNum(string);
        String target="1239586838923173478943890234092";
        char[] cs=new char[10];
        int index=0;
        for (int i=0;i<target.length();i++){
            if(!contains(cs,target.charAt(i))){
                cs[index++]=target.charAt(i);
                int cishu=Test4.getCount(target,target.charAt(i)+"");
                System.out.println("字符"+target.charAt(i)+"出现的次数是"+cishu);
            }
        }
    }
    public static boolean contains(char[] cs,char c){
        boolean b=false;
        for (int i=0;i<cs.length;i++){
            if (cs[i]==c){
                b=true;
                break;
            }
        }
        return b;
    }

//    public void appNum(String s) {
//
//        char[] chr = s.toCharArray();
//        for (int i = 0; i <= 9; i++) {
//            int count = 0;
//            for (int j = 0; j < chr.length; j++) {
//                if(i == chr[j]-48) {
//                    count++;
//                }
//
//            }
//            System.out.println(i+"出现的次数是"+count+"次");
//        }
//    }
}
