// declaring a method without return type
public class Method{
    public static void main(String[] args){
          add();
          System.out.println("Addition is performed succesfully");
    }
  public static void add(){
       int a=12;
       int b=15;
       int c=a+b;
       System.out.println(c);
  }
}
//declaring a method with return type
public class Method{
    public static void main(String[] args){
          System.out.println(add());
          System.out.println("Addition is performed succesfully");
    }
  public static int add(){
       int a=12;
       int b=15;
       int c=a+b;
       return c;
  }
}
