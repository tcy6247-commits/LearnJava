/**
 * 阶乘的和
 */
public class Test1225_4 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=1;i<=5;i++){
            sum+=fac(i);

        }
        System.out.println(sum);

    }

    public static int fac(int n) {
        int res=1;
        for(int i=1;i<=n;i++){
            res*=i;

        }
        return res;
    }
}
