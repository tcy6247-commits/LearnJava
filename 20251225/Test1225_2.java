/**
    方法的调用2
 */

public class Test1225_2 {
    public static  int add(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
            int x = 5;
            int y = 9;
            int ret = add(x,y);//使用ret接收返回值
            System.out.println(ret); //打印ret
    }
}
