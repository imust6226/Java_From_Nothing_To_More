/**
*创建类 ExceptionSelf 并实现方法avg，avg方法有两个参数，用来检查舱室是否小于0或大于100，如果参数小于0或者大于100，则通过throw抛出一个
* MyExcpetion
*/
public class ExceptionSelf{
  public static void avg(int a,int b) throws MyExceptionT{    // 方法 向上抛出异常，由方法的调用者 来捕捉异常；
    if(a<0 || b<0){
      throw new MyExceptionT("参数不能够小于0");
    }else if(a>100 || b>100){
      throw new MyExceptionT("参数不能够大于100");
    }
    return (a+b)%2;
  }
  public static void main(String [] args){
    try{
      int result = avg(10,102);
      System.out.println("结果是->"+result);
    }catch(MyException e){
      System.out.println(e);
    }catch(Exception e){
      e.printStackTrace();
    }finally{
      System.out.println("Program Over!");
    }
  }

}
