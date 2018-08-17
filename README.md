# Java_From_Nothing_To_More
Java语言学习
enum-枚举
泛型的简单用法，overClass<K,V>  也可以是数组类型  
泛型的高级用法，
限制类型如    limitedClass<T extends List> 其中 List可以是任何的类和任何的接口
  实例化limitedClass的类是必须是 继承自List集合的子类 如：
    limitedClass<LinkedList> lcO = new limitedClass<LinkedList>();
  使用通配符 来设计泛型类 如A<? extends List>a 其中List可以是任何的类和任何的接口；
    通用发  someClass<? extends List> scO = null;
           scO = new someClass<ArrayList>();
           scO = new someClass<HashMap>();  //编译不会通过，因为HashMap没有继承自List接口
    同样可以将其放置在 方法中 作为局部变量
           public void someFunciton（A<? extends List>a）{}
    相反可以将其限制为 父类
           A<? super List>a =null; // 则 a必须是List的父类
    
    
  
