/**
*1、只要继承 父类Exception就可以创建一个自定义的异常类
*2、尝试用构造方法  public Exception(String message)
*/

public class MyExceptionT extends Exception{
  public MyExceptionT(String message){   //自定义异常类的构造方法
    super(message);                     // 执行父类的有参数 构造方法，如果要执行无参的构造方法，需要使用 super(),并且只能在第一行
  }
}
