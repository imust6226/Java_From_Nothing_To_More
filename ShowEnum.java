package Enumeration;

public class ShouEnum {
/*
 * enum的方法
 * values() 返回一个枚举型的数组
 * valueOf() 将任意一个字符串转化为枚举型
 * compareTo() 比较两个枚举型的位置
 * ordinal()  枚举类型的索引位置，自 0 开始
 * */
	enum constants2{
		constants2_A("我是constants2_A"),
		constants2_B,
		constants2_C(100);
    String description;
    int i;
    private constants2(){
    	
    }
    private constants2(String description){
    	this.description = description;
    }
    private constants2(int i){
    	this.i = i;
    }
    private String getDescription(){
      return this.description;
    }
    private int getI(){
      return this.i+1;
    }
	}
	public static void main(String [] args){
		constants2 [] con = constants2.values();
		int length = con.length;
		for (int i=0;i<length;i++){
			System.out.println(con[i].ordinal()+"\t"+con[i]);
		}
		String str1 = "constants2_C";
	    int num = constants2.valueOf(str1).compareTo(con[0]);
	    System.out.println(num);
		//枚举constants2_A和constants2_B来调用方法
    for(int i=0;i<length;i++){
      System.out.println(con[i].getDescription());
      System.out.println(con[i].getI());
    }
	}
}
