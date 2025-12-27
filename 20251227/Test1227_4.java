//递归
//这个方法只执行了一部分，再执行另一部分


public class Test1227_4 {
    public  static void funciton(int a){
        if(a==1){
            return;
        }
        funciton(a-1);
        System.out.println(a);
    }

    public static void main(String[] args) {
        funciton(3);

    }
}
