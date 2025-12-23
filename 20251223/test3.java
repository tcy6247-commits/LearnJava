public class test3 {
    public static void main(String[] args) {
            int n = 15;
    }

    public static void main2(String[] args) {
         int n = -1;
         int count = 0;
         while (n != 0){
             if((n &1) !=0) {
                 count++;
             }
             n = n >>> 1;
         }
         System.out.println(count);
    }



    public static void main1(String[] args) {
        int n = -1;
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if(( (n >> i) & 1) !=0){
                 count++;
            }
        }
        System.out.println(count);
    }
}
