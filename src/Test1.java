import com.sun.tools.javac.Main;

import java.util.Random;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(100);
        System.out.println("请输入随机数"+n);
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("请输入你要猜的数字");
            int num = scan.nextInt();
            if (num < n){
                System.out.println("小了！");
            }else if (num > n){
                System.out.println("大了！");
            }else  {
                System.out.println("猜对了！");
                break;
            }
        }
    }
    public static void main19(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextInt()) {
            System.out.println("请输入你的年龄");
            int age = scan.nextInt();
            System.out.println("年龄：" + age);
        }
    }
    public static void main18(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("请输入你的姓名");
            String name = scan.nextLine();
            System.out.println("姓名："+name);
            System.out.println("请输入你的年龄");
            int age = scan.nextInt();
            System.out.println("年龄：" +age);
            scan.close();
    }
        public static void main17(String[] args) {
        int i =1;
        while (i<=100){
            i++;
            if(i%3==0 && i%5==0){
                System.out.println(i);
                continue;
            }
        }
    }
    public static void main16(String[] args) {
        int sum = 0;
        int n = 1;
        while (n <= 5) {
            int i =1 ;
            int result=1;
            while (i <= n) {
                result *= i;
                i++;
            }
            n++;
            sum +=result;
        }System.out.println(sum); //5的阶乘


    }
    public static void main15(String[] args) {
        int i = 1;
        int sum = 0;
        int sum1 = 0;
        int sum2 = 0;
        while (i<=100 ){
            sum += i;
            if(i%2==0){
                sum1+=i;
            }
            else{
                sum2+=i;
            }
            i++;

        }
        System.out.println("100之内的和: "+sum);
        System.out.println("100内的偶数和: "+sum1);
        System.out.println("100内的奇数和: "+sum2);
    }
    public static void main14(String[] args) {
            int a = 1; //循环变量的初始条件
            while(a<=10){  // 循环的判断条件
                System.out.println(a);
                a++;  //循环的步进
            }
    }
    public static void main13(String[] args) {
        int a = 1;
        switch (a){
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
               break;
            default:
                System.out.println("default");
                break;
        }
    }
    public static void main12(String[] args) {
        int a=2;
        if(a>0){
            System.out.println("正数");
        }else if (a<0){
            System.out.println("负数");
        } else {
            System.out.println("0");
        }
    }
    public static void main11(String[] args) {

           int x = 10;
           int y = 20;
           if(x == 10){
               if(y == 20){
                   System.out.println("AAA");
               }else {
                   System.out.println("BBB");
               }
           }
    }
    public static void main10(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int year = 1000; year<num; year++) {
            if (year % 100 != 0) {
                if (year % 4 == 0) {
                    System.out.println(year + " 是闰年");
            }
        } else {
            if (year % 400 == 0) {
                System.out.println(year + " 是闰年");
            }
        }
    }
}
    public static void main9(String[] args) {
        //Scanner 工具   System.in : 键盘
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if(a%2==0){
            System.out.println("偶数");
        }else {
            System.out.println("奇数");
        }

    }
    public static void main8(String[] args) {
        int a = 10;
        int b = 20;
        int c = a+((b-a) >> 1); //位右移运算
        System.out.println(c);
    }
    public static void main7(String[] args) {
            int a =10;
            long b = 20;
            //int c = a+b;
            long d = a+b;
       // System.out.println(c);
        System.out.println(d);
    }
    public static void main6(String[] args) {
        String str = "1234";
        int a = Integer.parseInt(str);
        System.out.println(a+1);
        //String转为函数
    }
    public static void main5(String[] args) {
        int a=10;
        String str = a+"";
        System.out.println(str);   //int转string
        String ret = String.valueOf(10);
        System.out.println(ret);
    }
    public static void main4(String[] args) {
        String s1 = "hello";
        String s2 = " world";
        System.out.println(s1+s2);  //字符串拼接
    }
    public static void main3(String[] args) {
        int a = 10;
        long b = 100L;
        //b = a; //强制类型转换
        //a = b; 编译失败
        a = (int)b;
        System.out.println(a);


    }
    public static void main1(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }
    public static void main2(String[] args) {
        double d=10.5;
        System.out.println(d);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        }
    }
