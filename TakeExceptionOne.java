/**
*1、捕捉异常，如果没有异常处理，程序发生异常时候就会停止执行后面的语句；相反如果进行异常处理了，捕捉到了异常则抛出异常，后面的语句也一直会继续执行；
*/
import java.util.Random;
import static java.lang.System.out;
import static java.lang.Math.max;

public class TakeExceptionOne{
  public static int getYourAge(ina age){
    return age;
  }
  public static void main(String [] args){
    try{                       // try 可能出现异常的程序代码块
      String str = "lili";
      System.out.println(str+"\t"+"的年龄是->");
      int age = Integer.parseInt("20L");
      System.out.println(age);
    }catch(Exception e){       //对异常信息进行捕获
      e.printStackTrace();     //输入异常信息性质
    }finnaly{
      System.out.println("你的任务完成了吧。");
    }
    System.out.println("Program Over!");
  }
  
}
// 第二个类吧，有个方法就会抛出异常的
class Thundering{
  String name;
  public void setName(String name){
    this.name = name;
  }
  public String getName(){
    return this.name;
  }
  public static void pushException(){
    int age = Integer.parseInt("25L");
    System.out.println(getName()+"的年龄是->"+age);
  }
}
