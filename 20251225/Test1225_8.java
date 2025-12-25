/**
    方法的重载
 */

public class Test1225_8 {
    public static void main(String[] args) {
            int a = 200;
            int b = 300;
            int ret1 = add(a,b);
            System.out.println(ret1);
            double x = 5.1;
            double y = 4.4;
            double ret2 = add(x,y);
            System.out.println(ret2);
    }

    public static int add(int a,int b){
        return a+b;
    }
    public static double add(double a,double b){
        return a+b;
    }
}

