import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /// 求最大公因数
        int a =24;
        int b =18;
        int c = a%b;
        while (c!=0){
            a=b;
            b=c;
            c=a%b;
        }
        System.out.println(b);
    }
    public static void main12(String[] args) {
        for (int k =1; k <= 100; k++) {
        int i =2;
        for (;i <=Math.sqrt(k); i++) {/// Math.sqrt()即为开根号
            if (k % i == 0) {
              //  System.out.println("不是素数");
                break;
            }
        }
        if (i > Math.sqrt(k)) {
            System.out.println(k+"是素数");
            }

        }
    }


    public static void main11(String[] args) {
        /// 判断一个数是否为素数
        int n =11;
        int i =2;
        for (;i <= n/2; i++) {
            if (n % i == 0) {
                System.out.println("不是素数");
                break;
            }
        }
        if (i >n/2){
            System.out.println("是素数");
        }


    }
    public static void main10(String[] args) {
        /// 模拟登录，共有三次机会
        int count = 3;
        Scanner scan = new Scanner(System.in);
        while (count != 0) {
            System.out.println("请输入你的密码，只有"+count+"次机会");
            String psw = scan.nextLine();
            if (psw.equals("123")){ /// 字符串需要使用.equals（）来代替==；
                System.out.println("登陆成功");
                break;
            }else{
                System.out.println("登录失败!");
            }
            count--;

        }
    }
    public static void main9(String[] args) {
            ///一个整数n,逆序输出它的个位,十位,百位
          Scanner scan = new Scanner(System.in);
          int n = scan.nextInt();
          while (n!=0){
              System.out.println(n%10);
              n/=10;
          }
    }

    public static void main8(String[] args) {
        ///乘法口诀表
        for (int i=1;i<=9;i++) {
            for (int j=1;j<=i;j++) { /// j<=i,i=j时就会回车到下一行
                System.out.print(i+"*"+j+"="+i*j);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main7(String[] args) {
        /// 输入一个整数，表示输出的行数，也表示组成“x”的反斜线和正斜线的长度。针对每行输出，输出用“*”组成的图案
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) { /// 可以多次输入n,循环输入
            int n = scan.nextInt();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == j || i + j == n - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
        scan.close();

    }
    public static void main6(String[] args) {
        for (int i = 1; i <= 999999; i++) {
            int count = 0;
            int tmp = i;
            int sum = 0;
            while (tmp != 0){   /// 得出i值是几位数
                tmp /= 10;
                count++;
             }
            tmp = i;
            while (tmp != 0){
                sum +=Math.pow(tmp%10,count);
                tmp /= 10;
            }
            if (sum == i) {
                System.out.println(i);
            }
        }
    }
    public static void main5(String[] args) {
        //水仙花数，即一个3位数，其各个数字的3次方和等于该数本身。
        for(int i=100;i<1000;i++){
            int a = i/100;
            int b = i%100/10;
            int c = i%10%10;
            if (a*a*a+b*b*b+c*c*c==i){
                System.out.println(i);
            }
        }
    }

    //求1/1-1/2+1/3-1/4+1/5......+1/99-1/100的值
    public static void main4(String[] args) {
        double sum = 0.0;
        int flag = 1;   //引入一个flag，作为+和-的跳板；
        for (int i = 1; i <= 100; i++) {
            sum = sum + 1.0/i * flag;
            flag = -flag;
        }
        System.out.println(sum);
    }


    public static void main3(String[] args) {
        int i = 0;
        if(10  != 10 && (i++) !=1){
            System.out.println("ture"+i);
        }else{
            System.out.println("false"+i);
        }
    }
    public static void main2(String[] args) {
        int n =15;
        int count = 0;
        while(n != 0){
            n = n & (n-1);
        }
    }
    public static void main1(String[] args) {
        int n =15;
        int count = 0;
        while(n!=0){
            if((n & 1) != 0){
                count++;
            }
            n=n>>>1;
        }
        System.out.println(count);
    }
}
