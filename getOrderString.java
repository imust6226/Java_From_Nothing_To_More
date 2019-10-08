import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class getOrderString {

         /*
         * main方法用来调试该类
         * 这个类是用来获取String类型的数字字符串
         * 数值的范围201806010000~201806129999
         * 将获得的字符串储存在List
         * 调试需要选择一个File来写入数据
         * static String s1="D:\\orderid.txt";
         * 
         * 第二步
         * 将这些数组读取至文件中去
         * */
        //这个可以获得2018年6月1日至9日所有的字符串
        /*
         * 用来储存20180601000值201806019999之间所有的字符串
         * */
        static String ss="D:\\orderid.txt";
        static StringBuffer sb = new StringBuffer();
        static String baseString = String.valueOf("2018060");//获取1至9月
        static String s1 = sb.append(baseString).toString();
        static int baseNumber = 10000;//通过这个可以控制月份201806010000至201806019999
        static String baseString3[] =null;
        //这些变量用来控制2018年6月10日至12日所有的字符串
        /*
         * 用来储存201806100000值201806129999之间所有的字符串
         * */
        static StringBuffer sb2 = new StringBuffer();
        static String baseString2 = String.valueOf("2018061");//获取10至12月
        static String s2=sb2.append(baseString2).toString();
        static int baseNumber2 = 10000;
        static String baseString4[] =null;
        /*
         * main方法用来调试程序
         * */
        public static void main(String [] args){
                //这些字符串是存在在字符串数组中
                /*
                 * 18年1月份所有的字符数组 String baseString3[]
                 * 18年10月份至13月份字符数组 String baseString4[]
                 * */
                String[] newString=baseString();//获取201806010000至20180100000
                //String[] newString=baseString2();//获取201806100000至201806130000
                
                File f1 = new File(ss);
                try {
                        FileWriter fw = new FileWriter(f1);
                        for(int i=0;i<newString.length;i++){
                                fw.write(newString[i]+"\n");
                        }
                        fw.flush();
                } catch (IOException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                }
                
        }
        /*
         * 该方法获得了2018010000值20180100000之间所有的字符串
         * */
        public static String[] baseString(){
                String baseString3[] = new String[90000];
                for(int i=0;i<=89999;i++){
                        baseNumber+=1;
                        baseString3[i]=s1+String.valueOf(baseNumber);
                        System.out.println(baseString3[i]);
                }
                return baseString3;
        }
        /*
         * 该方法获得了201806100000值201806130000之间所有的字符串
         * */
        public static String[] baseString2(){
                String baseString4[] = new String[20000];
                for(int i=0;i<=19999;i++){
                        baseNumber2+=1;
                        baseString4[i]=s2+String.valueOf(baseNumber2);
                        System.out.println(baseString4[i]);
                }
                return baseString4;
        }

}
