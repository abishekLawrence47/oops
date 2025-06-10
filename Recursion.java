// print name n times using recuesion 
public class Main {
    public static void main(String[] args) {
       int n=5;
       names(1,n);
    }
    public static void names(int i,int n){
        if(i>n){
            return;
        }
        System.out.println("Abishek");
        names(i+1,n);
    }
}
//printing n to 1 without loop
public class Main {
    public static void main(String[] args) {
       int n=5;
       names(n,n);
    }
    public static void names(int i,int n){
        if(i<1){
            return;
        }
        System.out.println(i);
        names(i-1,n);
    }
}

//printing 1 to n without loop
public class Main {
    public static void main(String[] args) {
       int n=5;
       names(1,n);
    }
    public static void names(int i,int n){
        if(i>n){
            return;
        }
        System.out.println(i);
        names(i+1,n);
    }
}
