public class Test6 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7, 11, 16, 22, 29, 37, 46};
        int sum = 0;
        for (int i = 0; i < 10; ++i) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}
