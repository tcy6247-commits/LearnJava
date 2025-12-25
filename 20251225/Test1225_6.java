/**
 * 交换两个整型变量
  需要引入数组来进行交换
 */

public class Test1225_6 {
    public static void main(String[] args) {
        int [] arr= {10,20};
        swap(arr);
        System.out.println("arr[0]="+arr[0]+" arr[1]="+arr[1]);
    }

    public static void swap(int arr[]){
        int temp=arr[0];
        arr[0]=arr[1];
        arr[1]=temp;
    }
}
