/**
 * 实参和形参的区别
 */


public class Test1225_5 {
    public static int getSum(int n){ //getSum()中的为形参
        return (n+1)*n/2;
    }

    public static int add(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println(getSum(10)); //调用时的getSum()中的为实参
        System.out.println(getSum(100));
        System.out.println(add(1,2)); //这也是实参
    }

}
