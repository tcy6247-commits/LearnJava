/**
 *
 * 输入一个数n，求n的阶乘
  */



import java.util.Scanner;

public class Test1225_3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入要阶乘的数");
        int x=scanner.nextInt();
//        facSum(x);
        System.out.println(fac(x));

    }

    public static int fac(int n) {
        int res=1;
        for(int i=1;i<=n;i++){
        res*=i;

    }
    return res;
}
}
