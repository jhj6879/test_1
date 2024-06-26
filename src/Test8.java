public class Test8 {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512};
//        int sum = 0;
//        for (int i = 0; i < 10; ++i) {
//            sum = sum + arr[i];
//        }
//        System.out.println(sum);
//    }


        int sum = 0;
        int num = 1;

        for (int i = 1; i <= 10; ++i) {
            sum += num;
            num *= 2;
        }
        System.out.println(sum);
    }

}

