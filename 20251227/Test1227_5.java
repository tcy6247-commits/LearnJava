/**
  递归求a的阶乘
 */

public class Test1227_5 {
    public static void main(String[] args) {
        int a;
        System.out.println(func(5));
    }

    public static int func(int a){
        if (a == 1){
            return 1;
        }
        return a*func(a-1);
    }
}
