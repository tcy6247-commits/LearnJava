/**
 求三个数的最大值
 */

public class Test1227_2 {
    public static void main(String[] args) {
//            int x =7;
//            int y =5;
//            int z =10;
//      System.out.println(max3(x,y,z));
        System.out.println(max3(5,7,8));
    }

    public static int max2(int a, int b) {
        return a > b ? a : b;
    }

    public static int max3(int a, int b, int c) {
        int ret = max2(a,b);
        return ret > c ? ret : c ;
    }
}
