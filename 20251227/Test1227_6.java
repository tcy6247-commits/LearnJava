/**
 * 按顺序打印数字的每一位
 */

public class Test1227_6 {
    public static void main(String[] args) {
            print(123);
    }

    public static void print(int n){
        if (n < 10){
            System.out.println(n);
            return;
        }
        print(n/10);
        System.out.println(n%10);
    }

}
