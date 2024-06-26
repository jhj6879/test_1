public class Test9 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880};
        int sum = 0;
        for (int i = 0; i < 10; ++i) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}
